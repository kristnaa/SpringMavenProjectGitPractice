package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping("/")
	public String home() {
		return "Hello spring boot";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "This is contact page";
	}

}
