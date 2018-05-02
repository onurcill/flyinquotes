package com.flyinquotes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "hello world";
	}
	
	
}
