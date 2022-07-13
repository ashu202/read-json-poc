package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ClientSpecificFields
{
	@JsonProperty("Client POC")
    private String clientPOC;
	@JsonProperty("I verify - Client portal case or offline case")
    private String iVerify;
	@JsonProperty("HCL case date")
    private String hclCaseDate;
	@JsonProperty("CTS request ID")
    private String cTSRequestID;
	@JsonProperty("Project ID")
    private String projectID;
	@JsonProperty("Employee ID")
    private String employeeID;
	@JsonProperty("CTS Associate ID")
    private String cTSAssociateID;
	@JsonProperty("HiringManagerName")
    private String hiringManagerName;
	@JsonProperty("PO Number")
    private String pONumber;
	@JsonProperty("Account Name")
    private String accountName;
	@JsonProperty("Department")
    private String department;
	@JsonProperty("Requestor Name")
    private String requestorName;
	@JsonProperty("Cost Centre")
    private String costCentre;
	@JsonProperty("Date of joining")
    private String dateOfJoining;
	@JsonProperty("Division")
    private String division;
	@JsonProperty("Identity Document")
    private String identityDocument;
	@JsonProperty("Date of Request")
    private String dateOfRequest;
	@JsonProperty("BGV ID-Pre/Post/Existing")
    private String bGVID;
	@JsonProperty("Candidate Identification Number")
    private String candidateIdentification;
	@JsonProperty("JRNumber")
    private String jRNumber;
	@JsonProperty("Position")
    private String position;
	@JsonProperty("Candidate ID")
    private String candidateID;
	private String requestoremail;
	@JsonProperty("Request ID")
    private String requestID;
	@JsonProperty("Tennessee Stopped date")
    private String tennesseeStopped;
	@JsonProperty("Project Name")
    private String projectName;
	@JsonProperty("Hiring Country")
    private String hiringCountry;
	@JsonProperty("SR No")
    private String srNo;
	@JsonProperty("Date of Re-initiation")
    private String dateOfReInitiation;
	@JsonProperty("Initiator Name")
    private String initiatorName;
}