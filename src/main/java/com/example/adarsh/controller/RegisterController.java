package com.example.adarsh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	
	
	@GetMapping("/hello")
	public String string() {
		return "Hi Adarsh";

	}
}
