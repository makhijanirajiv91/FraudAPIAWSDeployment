package com.rajiv.Corp.fraud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajiv.Corp.fraud.service.FraudService;

@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudController {
	
	@Autowired
	private FraudService fraudService;
	
	@GetMapping(path = "{customerId}")
	public Boolean fraudCheckResponse(@PathVariable("customerId") Integer customerId) {
		
		return fraudService.isFraudCustomer(customerId);
		
	}

}
