package com.manohar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GetInformation {
	@GetMapping("/hello/{id}")
	public String sayHi(@PathVariable String id) {
		
		return "Hi Manohar";
	}
}
