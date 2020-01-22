package com.belk.payon.authtoken.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belk.payon.authtoken.service.AuthTokenService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class AuthTokenController {

	@Autowired
	private AuthTokenService authTokenService;

	@GetMapping("/authToken")
	public void authTokenDetails() throws JsonParseException, JsonMappingException, IOException {
		authTokenService.retrieveAuthTokenDetails();
	}

}
