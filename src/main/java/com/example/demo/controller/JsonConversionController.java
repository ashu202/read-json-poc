package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JsonConService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test")
public class JsonConversionController {
	@Autowired
	JsonConService jsonConService;
	
	@GetMapping("/convert-json")
	public void convertJson() {
		
		jsonConService.convertJson();
	}
}
