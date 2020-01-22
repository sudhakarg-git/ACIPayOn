package com.belk.payon.util.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class CustomParameters {

	private String CUSTOM_fraudDetectIndicator;
	private String CUSTOM_taxAmount;
	private String CYBERSOURCE_creditCardAmount;
	private String CYBERSOURCE_orderSource;
	private String CYBERSOURCE_orderTotalAmount;
	private String CYBERSOURCE_tenderTypes;
	private String StoredCredentialType;
	private String source;
	
	
	public CustomParameters() {}


	public CustomParameters(String cUSTOM_fraudDetectIndicator, String cUSTOM_taxAmount,
			String cYBERSOURCE_creditCardAmount, String cYBERSOURCE_orderSource, String cYBERSOURCE_orderTotalAmount,
			String cYBERSOURCE_tenderTypes, String storedCredentialType, String source) {
		super();
		CUSTOM_fraudDetectIndicator = cUSTOM_fraudDetectIndicator;
		CUSTOM_taxAmount = cUSTOM_taxAmount;
		CYBERSOURCE_creditCardAmount = cYBERSOURCE_creditCardAmount;
		CYBERSOURCE_orderSource = cYBERSOURCE_orderSource;
		CYBERSOURCE_orderTotalAmount = cYBERSOURCE_orderTotalAmount;
		CYBERSOURCE_tenderTypes = cYBERSOURCE_tenderTypes;
		StoredCredentialType = storedCredentialType;
		this.source = source;
	}


	public String getCUSTOM_fraudDetectIndicator() {
		return CUSTOM_fraudDetectIndicator;
	}


	public void setCUSTOM_fraudDetectIndicator(String cUSTOM_fraudDetectIndicator) {
		CUSTOM_fraudDetectIndicator = cUSTOM_fraudDetectIndicator;
	}


	public String getCUSTOM_taxAmount() {
		return CUSTOM_taxAmount;
	}


	public void setCUSTOM_taxAmount(String cUSTOM_taxAmount) {
		CUSTOM_taxAmount = cUSTOM_taxAmount;
	}


	public String getCYBERSOURCE_creditCardAmount() {
		return CYBERSOURCE_creditCardAmount;
	}


	public void setCYBERSOURCE_creditCardAmount(String cYBERSOURCE_creditCardAmount) {
		CYBERSOURCE_creditCardAmount = cYBERSOURCE_creditCardAmount;
	}


	public String getCYBERSOURCE_orderSource() {
		return CYBERSOURCE_orderSource;
	}


	public void setCYBERSOURCE_orderSource(String cYBERSOURCE_orderSource) {
		CYBERSOURCE_orderSource = cYBERSOURCE_orderSource;
	}


	public String getCYBERSOURCE_orderTotalAmount() {
		return CYBERSOURCE_orderTotalAmount;
	}


	public void setCYBERSOURCE_orderTotalAmount(String cYBERSOURCE_orderTotalAmount) {
		CYBERSOURCE_orderTotalAmount = cYBERSOURCE_orderTotalAmount;
	}


	public String getCYBERSOURCE_tenderTypes() {
		return CYBERSOURCE_tenderTypes;
	}


	public void setCYBERSOURCE_tenderTypes(String cYBERSOURCE_tenderTypes) {
		CYBERSOURCE_tenderTypes = cYBERSOURCE_tenderTypes;
	}


	public String getStoredCredentialType() {
		return StoredCredentialType;
	}


	public void setStoredCredentialType(String storedCredentialType) {
		StoredCredentialType = storedCredentialType;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}

	
	
}
