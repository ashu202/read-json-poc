package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public interface JsonConService {

	void convertJson();
	String saveJson(JsonNode saveJsonNode);
	String findJsonAndSaveReponse();
}
