package com.rajeshkurell.springBootStart.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World, Welcome to Spring Boot";
	}

}
