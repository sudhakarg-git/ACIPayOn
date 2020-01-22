package com.belk.payon.authtoken.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Card {

	private String bin;
	private String last4Digits;
	private String holder;
	private String expiryMonth;
	private String expiryYear;
	private String cvv;
	private String omniToken;
	
	public Card() {}
	
	public Card(String bin, String last4Digits, String holder, String expiryMonth, String expiryYear, String cvv,String omniToken) {
		super();
		this.bin = bin;
		this.last4Digits = last4Digits;
		this.holder = holder;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvv = cvv;
		this.omniToken = omniToken;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getLast4Digits() {
		return last4Digits;
	}
	public void setLast4Digits(String last4Digits) {
		this.last4Digits = last4Digits;
	}
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public String getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getOmniToken() {
		return omniToken;
	}

	public void setOmniToken(String omniToken) {
		this.omniToken = omniToken;
	}
	
	
	
	
}
