package com.flyinquotes.flyinquotes.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IHomeController {
	
	@RequestMapping(value = "/")
	public String index();
	
}
