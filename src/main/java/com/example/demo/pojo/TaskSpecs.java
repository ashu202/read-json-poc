package com.example.demo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TaskSpecs
{
	@JsonProperty("ComponentScoping")
    private List<ComponentScoping> componentScoping;
}