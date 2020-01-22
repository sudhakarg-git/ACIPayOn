package com.belk.payon.reversal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belk.payon.reversal.service.ReversalService;

@RestController
public class ReversalController {
	
	@Autowired
	private ReversalService reversalService;

	@GetMapping("/reversals")
	public void retriveReversalDetails() {
		reversalService.getReversalDetails();
	}

}
