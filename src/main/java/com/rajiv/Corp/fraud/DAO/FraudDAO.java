package com.rajiv.Corp.fraud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajiv.Corp.fraud.model.FraudCheckHistory;

@Repository
public interface FraudDAO extends JpaRepository<FraudCheckHistory, Integer>{
	
	

}
