package com.belk.payon.util.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Result {
	
	private String code;
	private String description;
	private String avsResponse;
	private String cvvResponse;
	private ParameterError[] parameterErrors;
	
	public Result() {}
	
	public Result(String code, String description,String avsResponse,String cvvResponse,ParameterError[] parameterErrors) {
		super();
		this.code = code;
		this.description = description;
		this.avsResponse = avsResponse;
		this.cvvResponse = cvvResponse;
		this.parameterErrors = parameterErrors;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getAvsResponse() {
		return avsResponse;
	}

	public void setAvsResponse(String avsResponse) {
		this.avsResponse = avsResponse;
	}

	public String getCvvResponse() {
		return cvvResponse;
	}

	public void setCvvResponse(String cvvResponse) {
		this.cvvResponse = cvvResponse;
	}

	public ParameterError[] getParameterErrors() {
		return parameterErrors;
	}

	public void setParameterErrors(ParameterError[] parameterErrors) {
		this.parameterErrors = parameterErrors;
	}
	
	
	
	

}
