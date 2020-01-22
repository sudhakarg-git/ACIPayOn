package com.belk.payon.util.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ResultDetails {

	private String extendedDescription;
	private String connectorTxID3;
	private String connectorTxID2;
	private String connectorTxID1;
	private String authCode;
	private String cardToken;
	private String clearingInstituteName;
	private String acquirerResponse;
	private String reconciliationId;
	private String retrievalReferenceNumber;

	public ResultDetails() {
	}

	public ResultDetails(String extendedDescription, String connectorTxID3, String connectorTxID2,
			String connectorTxID1, String authCode, String cardToken, String clearingInstituteName,
			String acquirerResponse, String reconciliationId, String retrievalReferenceNumber) {
		super();
		this.extendedDescription = extendedDescription;
		this.connectorTxID3 = connectorTxID3;
		this.connectorTxID2 = connectorTxID2;
		this.connectorTxID1 = connectorTxID1;
		this.authCode = authCode;
		this.cardToken = cardToken;
		this.clearingInstituteName = clearingInstituteName;
		this.acquirerResponse = acquirerResponse;
		this.reconciliationId = reconciliationId;
		this.retrievalReferenceNumber = retrievalReferenceNumber;
	}

	public String getExtendedDescription() {
		return extendedDescription;
	}

	public void setExtendedDescription(String extendedDescription) {
		this.extendedDescription = extendedDescription;
	}

	public String getConnectorTxID3() {
		return connectorTxID3;
	}

	public void setConnectorTxID3(String connectorTxID3) {
		this.connectorTxID3 = connectorTxID3;
	}

	public String getConnectorTxID2() {
		return connectorTxID2;
	}

	public void setConnectorTxID2(String connectorTxID2) {
		this.connectorTxID2 = connectorTxID2;
	}

	public String getConnectorTxID1() {
		return connectorTxID1;
	}

	public void setConnectorTxID1(String connectorTxID1) {
		this.connectorTxID1 = connectorTxID1;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getCardToken() {
		return cardToken;
	}

	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}

	public String getClearingInstituteName() {
		return clearingInstituteName;
	}

	public void setClearingInstituteName(String clearingInstituteName) {
		this.clearingInstituteName = clearingInstituteName;
	}

	public String getAcquirerResponse() {
		return acquirerResponse;
	}

	public void setAcquirerResponse(String acquirerResponse) {
		this.acquirerResponse = acquirerResponse;
	}

	public String getReconciliationId() {
		return reconciliationId;
	}

	public void setReconciliationId(String reconciliationId) {
		this.reconciliationId = reconciliationId;
	}

	public String getRetrievalReferenceNumber() {
		return retrievalReferenceNumber;
	}

	public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
		this.retrievalReferenceNumber = retrievalReferenceNumber;
	}
	
	


}
