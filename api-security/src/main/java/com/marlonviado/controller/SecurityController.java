package com.marlonviado.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecurityController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "WELCOME TO SPRING BOOT 3!!!";
	}
	
	@GetMapping("/add")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String createNewStudent() {
		return "CREATE NEW STUDENT!!!";
	}
	
	@GetMapping("/login")
	public String login() {
		return "PLEASE LOGIN";
	}
	

}
