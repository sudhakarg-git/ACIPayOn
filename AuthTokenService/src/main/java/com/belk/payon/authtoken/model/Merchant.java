package com.belk.payon.authtoken.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Merchant {
	
	private BankAccount bankAccount;

	public Merchant() {
		
	}

	public Merchant(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
	
	
	

}
