package com.flyinquotes.flyinquotes.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(HomeController.PATH)
public class HomeController {

	public static final String PATH = "/";
	
	public String index() {
		return "index.html";
	}
}
