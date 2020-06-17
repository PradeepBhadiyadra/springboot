package com.example.FirstSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
	//Question: is it mandatory that mapping methods should return String?
		return "Hello from Vilas Varghese";
	}
}
