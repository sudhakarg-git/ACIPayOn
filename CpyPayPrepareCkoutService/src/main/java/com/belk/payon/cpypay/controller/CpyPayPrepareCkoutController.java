package com.belk.payon.cpypay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belk.payon.cpypay.service.CpyPayPrepareCkoutService;

@RestController
public class CpyPayPrepareCkoutController {
	
	@Autowired
	private CpyPayPrepareCkoutService service;
	
	@GetMapping("/payCheckouts")
	public void retrieveCpyPayPreareCheckouts() {
		service.getCpyPayPreareCheckouts();
	}

}
