package com.belk.payon.cpypay.model;

import java.util.Date;

import com.belk.payon.util.model.Result;

public class CpyPayPreCkoutResponse {

	private String id;
	private Result result;
	private String buildNumber;
	private Date timestamp;
	private String ndc;

	public CpyPayPreCkoutResponse() {

	}

	public CpyPayPreCkoutResponse(String id, Result result, String buildNumber, Date timestamp, String ndc) {
		super();
		this.id = id;
		this.result = result;
		this.buildNumber = buildNumber;
		this.timestamp = timestamp;
		this.ndc = ndc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getNdc() {
		return ndc;
	}

	public void setNdc(String ndc) {
		this.ndc = ndc;
	}

}
