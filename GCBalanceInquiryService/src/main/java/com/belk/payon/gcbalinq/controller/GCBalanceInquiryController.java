package com.belk.payon.gcbalinq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belk.payon.gcbalinq.service.GCBalanceInquiryService;

@RestController
public class GCBalanceInquiryController {
	
	@Autowired
	private GCBalanceInquiryService service;
	
	@GetMapping("/balanceInquiries")
	public void retrieveGCBalanceInquiryDetails() {
		service.retrieveBalanceInquiryDetails();
	}

}
