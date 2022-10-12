package com.rajiv.Corp.fraud.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajiv.Corp.fraud.DAO.FraudDAO;
import com.rajiv.Corp.fraud.model.FraudCheckHistory;

@Service
public class FraudService {
	
	@Autowired
	private FraudDAO dao;

	public Boolean isFraudCustomer(Integer customerId) {
		FraudCheckHistory checkHistory = new FraudCheckHistory();
		checkHistory.setCustomerId(customerId);
		checkHistory.setIsFraudster(false);
		checkHistory.setCreatedAt(LocalDateTime.now());
		dao.save(checkHistory);
		return false;
	}
}
