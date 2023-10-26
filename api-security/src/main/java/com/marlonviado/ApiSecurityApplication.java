package com.marlonviado;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSecurityApplication.class, args);
		List<String> sofaTextString = Arrays.asList("<sofa:text property='customer' attributes='id' alt='bahala.png'>",
				"<sofa:text property='customer' attributes='id' alt='bahala.png'>");
		List<String> list = sofaTextString.stream().map(str -> str.replace("customer", "ewan")).collect(Collectors.toList());
		System.out.println(list);
	}

}
