package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JsonConService;
import com.fasterxml.jackson.databind.JsonNode;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test")
public class JsonConversionController {
	public static int counter=0;
	@Autowired
	JsonConService jsonConService;
	
	@GetMapping("/convert-json")
	public void convertJson() {
		counter++;
		jsonConService.convertJson();
		System.out.println("Counter:"+counter);
	}
	
	@PostMapping(path = "/save-json", consumes = "application/json")
	public String doRecordProcess(@RequestBody JsonNode requestBody) {
		String response = jsonConService.saveJson(requestBody);
		return response;
	}
	
	@GetMapping("/find-json")
	public void findJson() {
		
		jsonConService.findJsonAndSaveReponse();
	}
}
