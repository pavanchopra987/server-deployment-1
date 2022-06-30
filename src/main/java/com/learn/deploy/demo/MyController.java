package com.learn.deploy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		return "welcome to home page";
	}
	
	@GetMapping("/about")
	public String about() {
		return "welcome to about page";
	}
}
