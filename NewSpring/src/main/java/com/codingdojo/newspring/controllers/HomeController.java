package com.codingdojo.newspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@RequestMapping("")
	public String index() {
		return "Hello World!";
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", required= false) String name, @RequestParam(value="stack", required=false) String stack) {
		if (name != null && stack != null) {			
			return String.format("Hello, %s. Welcome to %s", name, stack);
		} else if (name != null) {
			return "Hello, " + name;
		} else {
			return "Hello";
		}
	}
	
	@RequestMapping("welcome/{name}/{stack}/{rating}")
	public String welcome(@PathVariable String name, @PathVariable String stack, @PathVariable Integer rating) {
		return String.format("Welcome, %s, are you enjoying %s so far? I would rate it a %d", name, stack, rating);
	}
	
	
	
	
}
