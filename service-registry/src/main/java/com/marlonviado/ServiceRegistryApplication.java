package com.marlonviado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.marlonviado.config.ServiceRegistryConfig;

@SpringBootApplication
@Import({ServiceRegistryConfig.class})
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
		//Supplier<Student> studentSupplier = () -> new Student("Marlon Viado",47);
		//System.out.println(studentSupplier.get().printStudent());
	}

}
