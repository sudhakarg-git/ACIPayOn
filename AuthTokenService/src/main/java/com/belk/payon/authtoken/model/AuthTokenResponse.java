package com.belk.payon.authtoken.model;

import java.io.Serializable;

import com.belk.payon.util.model.CustomParameters;
import com.belk.payon.util.model.Result;
import com.belk.payon.util.model.ResultDetails;
import com.belk.payon.util.model.Risk;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties
public class AuthTokenResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String referencedId;
	private String paymentType;
	private String paymentBrand;
	private String amount;
	private String currency;
	private String descriptor;
	private String merchantTransactionId;
	private String merchantInvoiceId;
	private Result result;
	private ResultDetails resultDetails;
	private Card card;
	private Merchant merchant;
	private CustomParameters customParameters;
	private Risk risk;
	private String buildNumber;
	private String timeStamp;
	private String ndc;
	
	public AuthTokenResponse() {}
	
	public AuthTokenResponse(String id, String referencedId, String paymentType, String paymentBrand,String amount, String currency, String descriptor,
			String merchantTransactionId,String merchantInvoiceId, Result result, ResultDetails resultDetails, Card card,Merchant merchant,CustomParameters customParameters,
			Risk risk, String buildNumber, String timeStamp, String ndc) {
		super();
		this.id = id;
		this.referencedId = referencedId;
		this.paymentType = paymentType;
		this.paymentBrand = paymentBrand;
		this.amount = amount;
		this.currency = currency;
		this.descriptor = descriptor;
		this.merchantTransactionId = merchantTransactionId;
		this.merchantInvoiceId = merchantInvoiceId;
		this.result = result;
		this.resultDetails = resultDetails;
		this.card =card;
		this.merchant = merchant;
		this.customParameters = customParameters;
		this.risk = risk;
		this.buildNumber = buildNumber;
		this.timeStamp = timeStamp;
		this.ndc = ndc;
	}
	public String getPaymentBrand() {
		return paymentBrand;
	}

	public void setPaymentBrand(String paymentBrand) {
		this.paymentBrand = paymentBrand;
	}

	public String getMerchantInvoiceId() {
		return merchantInvoiceId;
	}

	public void setMerchantInvoiceId(String merchantInvoiceId) {
		this.merchantInvoiceId = merchantInvoiceId;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getReferencedId() {
		return referencedId;
	}

	public void setReferencedId(String referencedId) {
		this.referencedId = referencedId;
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
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public ResultDetails getResultDetails() {
		return resultDetails;
	}
	public void setResultDetails(ResultDetails resultDetails) {
		this.resultDetails = resultDetails;
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
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getNdc() {
		return ndc;
	}
	public void setNdc(String ndc) {
		this.ndc = ndc;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	
	
	
	

}
