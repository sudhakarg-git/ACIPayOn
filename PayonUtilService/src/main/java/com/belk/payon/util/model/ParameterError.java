package com.belk.payon.util.model;

public class ParameterError {
	
	private String name;
	private String value;
	private String message;
	
	public ParameterError() {}
	
	public ParameterError(String name, String value, String message) {
		super();
		this.name = name;
		this.value = value;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
