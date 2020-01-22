package com.belk.payon.gcsettle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belk.payon.gcsettle.service.GCSettlementService;

@RestController
public class GCSettlementController {
	
	@Autowired
	private GCSettlementService service;
	
	@GetMapping("/gcsettlements")
	public void retrieveGcSettlementDetails() {
		service.getGcSettlementDetails();
	}
	

}
