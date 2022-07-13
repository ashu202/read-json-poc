package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CaseDetails {
	@JsonProperty("Type of Check")
	private String typeOfCheck;
	@JsonProperty("Package Name")
	private String packageName;
	@JsonProperty("Request Status")
	private String requestStatus;
	@JsonProperty("Contact Date")
	private String contactDate;
	@JsonProperty("Do you have a date when we can contact the current or most recent employer for this Candidate?")
	private String mostRecentEmployer;
	@JsonProperty("Case Origin")
	private String caseOrigin;
	@JsonProperty("Email To")
	private String emailTo;
	@JsonProperty("Candidate's First Name")
	private String candidateFirstName;
	@JsonProperty("Official Email Address")
	private String officialEmailAddress;
	@JsonProperty("Start Date")
	private String startDate;
	@JsonProperty("SRT")
	private String sRT;
	@JsonProperty("Remarks")
	private String remarks;
	@JsonProperty("Client Name(Full Business name)")
	private String clientName;
	@JsonProperty("Subject Type")
	private String subjectType;
	@JsonProperty("Is Duplicate Case")
	private String isDuplicateCase;
	@JsonProperty("SBU")
	private String sBU;
	@JsonProperty("LOA Submitted")
	private String lOASubmitted;
	@JsonProperty("Personal Email Address")
	private String personalEmail;
	@JsonProperty("Candidate's Last Name")
	private String candidateLastName;
	@JsonProperty("Package Type")
	private String packageType;
	@JsonProperty("Subject Details to be Entered By")
	private String subjectDetails;
	@JsonProperty("Email Template")
	private String emailTemplate;
	@JsonProperty("Client Cost Code")
	private String clientCostCode;
	@JsonProperty("Client Reference #")
	private String clientReference;
	@JsonProperty("Candidate's Middle Name")
	private String candidateMiddleName;
	@JsonProperty("Case Date")
	private String caseDate;
	@JsonProperty("Date of Birth")
	private String dateOfBirth;
	@JsonProperty("Do you grant FADV persmission for checks to be undertaken with the current or most recent employer now?")
	private String fadvPersmission;
	@JsonProperty("Candidate Auhorization Letter")
	private String candidateAuthLetter;
}