package com.flyinquotes.flyinquotes.Controllers.impl;

import org.springframework.web.bind.annotation.RestController;

import com.flyinquotes.flyinquotes.Controllers.IHomeController;

@RestController
public class HomeController implements IHomeController {
	
	public String index() {
		return "index.html";
	}
}
