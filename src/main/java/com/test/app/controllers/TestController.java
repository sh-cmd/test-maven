package com.test.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{

	@GetMapping("/testApp")
	public String welcomeMessage()
	{
		return "Hi welcome to the application";
	}

	@GetMapping("/")
	public String Dashboard()
	{
		return "This is Dashboard";
	}
}
