package com.example.demo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import lombok.Data;

@Data
public class Components
{
	@JsonProperty("CANDIDATE_DE_COMPLETED_DT")
    private String cANDIDATEDECOMPLETED_DT;
	@JsonProperty("PRODUCT")
    private String pRODUCT;
	@JsonProperty("Component name")
    private String componentNameC;
	private String componentName;
	private String dbComponent;
	@JsonProperty("Records")
    private List<ObjectNode> records;
}