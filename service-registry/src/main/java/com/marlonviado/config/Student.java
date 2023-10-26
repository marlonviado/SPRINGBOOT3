package com.marlonviado.config;

public record Student(String name, int age) {
	
	public String printStudent() {
		return name + " - " + age;
	}
	
	public Student {
		
	}

}
