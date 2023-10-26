package com.marlonviado.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		UserDetails userDetails = 
				User.withUsername("Marlon").password(passwordEncoder.encode("Marlon")).roles("ADMIN").build();
		
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable() ).
				authorizeHttpRequests(
						(request) -> request.requestMatchers("/api/welcome").permitAll().anyRequest().authenticated()
						).sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.formLogin(
				form -> form.loginPage("/api/login").permitAll()
				).build();
		//return http.csrf().disable().authorizeHttpRequests().requestMatchers("/welcome/**").permitAll().and().authorizeHttpRequests().requestMatchers("/api/**").authenticated().and().formLogin().and().build();
	}

}
