package com.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;



@Controller

public class MainController {
	
	@GetMapping("/")
	public String getHomepage() {
		return "index";
	}
	
	

	
	
}
