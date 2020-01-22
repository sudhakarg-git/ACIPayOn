package com.belk.payon.authfraud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belk.payon.authfraud.service.AuthFraudTokenService;

@RestController
public class AuthFraudTokenController {
	
	@Autowired
	private AuthFraudTokenService service;
	
	@GetMapping("/authFraudTokens")
	public void retrieveAuthFraudTokenDetails() {
		service.getAuthFraudTokenDetails();
	}

}
