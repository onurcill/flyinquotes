package com.flyinquotes.flyinquotes.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
}
