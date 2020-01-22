package com.belk.payon.gcsettle.model;

import java.util.Date;

import com.belk.payon.util.model.CustomParameters;
import com.belk.payon.util.model.Result;
import com.belk.payon.util.model.ResultDetails;
import com.belk.payon.util.model.Risk;

public class GCSettlementResponse {
	
	private String id;
	private String paymentType;
	private String amount;
	private String currency;
	private String descriptor;
	private String merchantTransactionId;
	private String merchantInvoiceId;
	private Result result;
	private ResultDetails resultDetaqils;
	private CustomParameters customParameters;
	private Risk risk;
	private String buildNumber;
	private Date timestamp;
	private String ndc;

	public GCSettlementResponse() {
	}

	public GCSettlementResponse(String id, String paymentType, String amount, String currency, String descriptor,
			String merchantTransactionId, String merchantInvoiceId, Result result,
			ResultDetails resultDetaqils,
			CustomParameters customParameters,Risk risk,
			String buildNumber, Date timestamp, String ndc) {
		super();
		this.id = id;
		this.paymentType = paymentType;
		this.amount = amount;
		this.currency = currency;
		this.descriptor = descriptor;
		this.merchantTransactionId = merchantTransactionId;
		this.merchantInvoiceId = merchantInvoiceId;
		this.result = result;
		this.resultDetaqils = resultDetaqils;
		this.customParameters = customParameters;
		this.risk = risk;
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

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}

	public String getMerchantTransactionId() {
		return merchantTransactionId;
	}

	public void setMerchantTransactionId(String merchantTransactionId) {
		this.merchantTransactionId = merchantTransactionId;
	}

	public String getMerchantInvoiceId() {
		return merchantInvoiceId;
	}

	public void setMerchantInvoiceId(String merchantInvoiceId) {
		this.merchantInvoiceId = merchantInvoiceId;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public ResultDetails getResultDetaqils() {
		return resultDetaqils;
	}

	public void setResultDetaqils(ResultDetails resultDetaqils) {
		this.resultDetaqils = resultDetaqils;
	}

	public CustomParameters getCustomParameters() {
		return customParameters;
	}

	public void setCustomParameters(CustomParameters customParameters) {
		this.customParameters = customParameters;
	}

	public Risk getRisk() {
		return risk;
	}

	public void setRisk(Risk risk) {
		this.risk = risk;
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
