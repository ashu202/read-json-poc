package com.example.demo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

import lombok.Data;

@Data
public class ComponentScoping
{
	@JsonProperty("SBU_NAME")
    private String sbuName;
	@JsonProperty("CRNCreationDate")
    private String crnCreationDate;
	@JsonProperty("Package Name")
    private String packageName;

    private CaseReference caseReference;
    @JsonProperty("CASE_NUMBER")
    private String caseNumber;
    @JsonProperty("CLIENT_NAME")
    private String clientName;

    private ClientSpecificFields clientSpecificFields;
    @JsonProperty("Components")
    private List<Components> components;
    @JsonProperty("CASE_UUID")
    private String caseUUID;

    private ObjectNode caseMoreInfo;
    @JsonProperty("Candidate_Name")
    private String candidateName;
    @JsonProperty("CLIENT_CODE")
    private String clientCode;
    private CaseDetails caseDetails;
    @JsonProperty("CASE_REF_NUMBER")
    private String caseRefNumber;
    @JsonProperty("TYPE")
    private String type;
    @JsonProperty("BaseEJCCountryList")
    private String baseEJCCountryList;
}