package com.md.arif.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.md.arif.feignclient.SupplierFeignClient;
import com.md.arif.response.SupplierDetails;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class Resilience4jconfiguration {
	
	Logger logger = LoggerFactory.getLogger(Resilience4jconfiguration.class);
	
	long count = 1;
	
	@Autowired
	SupplierFeignClient supplierFeignClient;

	@CircuitBreaker(name = "supplierService",
			fallbackMethod = "fallbackGetSupplierById")
	public SupplierDetails getSupplierById(int supplierId) {
		logger.info("count = " + count);
		count++;
		SupplierDetails supp = 
				supplierFeignClient.getSupplierById(supplierId);;
		
		return supp;
	}
	
	public SupplierDetails fallbackGetSupplierById(int supplierId, Throwable th) {
		logger.error("Error = " + th);
		return new SupplierDetails();
	}
	
}

