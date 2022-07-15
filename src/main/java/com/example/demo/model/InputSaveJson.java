package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import lombok.Data;

@Entity
@Data
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class InputSaveJson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb", name = "request_json")
	private JsonNode requestJson;
	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb", name = "response_json")
	private JsonNode responseJson;
	private String status;
}
