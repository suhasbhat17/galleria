package com.suhas.galleria.galleria_app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to the painting gallery";
	}
}
