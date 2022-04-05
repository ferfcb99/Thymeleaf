package com.proyecto_thymeleaf.springboot.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	// localhost:8080/index
	@RequestMapping(method = RequestMethod.GET, value = {"/index", "/"})
	public String index() {
		
		return "index";
	}

}
