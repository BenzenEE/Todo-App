package com.sayan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class das {

	@GetMapping("/")
	public String display() {
		return "sayan das";
		
	}
}
