package com.belk.payon.authtoken.model;

public class BankAccount {
	
	private String holder;
	private String number;
	private String bic;
	private String county;
	
	public BankAccount(String holder, String number, String bic, String county) {
		super();
		this.holder = holder;
		this.number = number;
		this.bic = bic;
		this.county = county;
	}
	
	public BankAccount() {}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	
	
	

}
