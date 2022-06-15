package com.md.arif.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.md.arif.response.SupplierDetails;


@FeignClient(value = "supplier-service")
public interface SupplierFeignClient {

	@GetMapping("/suppliers/{supplierId}")
	public SupplierDetails getSupplierById(@PathVariable int supplierId);
	
}
