package com.nov.dailycodeone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	//@RequestMapping(value = "/",method = RequestMethod.GET)
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "Welcome to the new world of Spring Boot.";
	}
}
