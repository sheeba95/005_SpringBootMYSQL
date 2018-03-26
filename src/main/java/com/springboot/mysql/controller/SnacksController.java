package com.springboot.mysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/snacks")
public class SnacksController {
	@RequestMapping("/get")
	public String welcome() {
		return "Free Snacks are provided";
	}

}
