package com.belk.payon.authtoken.model;

public class Authetication {
	
	private String userId;
	private String password;
	private String entityId;
	private String merchantTransactionId;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getMerchantTransactionId() {
		return merchantTransactionId;
	}
	public void setMerchantTransactionId(String merchantTransactionId) {
		this.merchantTransactionId = merchantTransactionId;
	}
	
	

}
