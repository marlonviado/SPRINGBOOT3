package com.marlonviado.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.marlonviado.client.CourseClient;

@Configuration
public class WebClientConfig {
	
	@Autowired
	private LoadBalancedExchangeFilterFunction loadBalancedExchangeFilterFunction;
	
	@Bean
	public WebClient courseWebClient() {
		return WebClient
				.builder()
				.baseUrl("http://course-service")
				.filter(loadBalancedExchangeFilterFunction)
				.build();
	}
	
	@Bean
	public CourseClient courseClient() {
		HttpServiceProxyFactory httpServiceProxyFactory = 
				HttpServiceProxyFactory
				.builder(WebClientAdapter.forClient(courseWebClient()))
				.build();
		return httpServiceProxyFactory.createClient(CourseClient.class);
	}

}
