package com.md.arif.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.md.arif.model.Supplier;
import com.md.arif.service.SupplierService;

@RestController
@RefreshScope
public class SupplierController {
	
	@Autowired
	private SupplierService supservice;
	
	@Value("${supplier.test}")
	private String test;
	
	
//	private Supplier supplier;
	
	@GetMapping("/suppliers")
	public List<Supplier> getAllSuppliers(){
		return supservice.getSuppliers();
	}
	
	@PostMapping("/suppliers")
	public Supplier addSupplier(@RequestBody Supplier supplier) {
		return supservice.addSupplier(supplier);
	}
	
	@GetMapping("/suppliers/{supplierId}")
	public Supplier getSupplierById(@PathVariable("supplierId") int supplierId) {
		Optional<Supplier> supp=supservice.getSupplierById(supplierId);
		return supp.get();
	}
	
	@PutMapping("/suppliers/{supplierId}")
	public Supplier updateSupplierById(@PathVariable("supplierId") int supplierId, @RequestBody Supplier supplier) {
		supplier.setSupplierId(supplierId);
		return supservice.updateSupplier(supplier);
	}
	
	@DeleteMapping("/suppliers/{supplierId}")
	public void deleteSupplierById(@PathVariable("supplierId") int supplierId) {
		 supservice.deleteSupplier(supplierId);
		
	}
	
	@GetMapping("/test")
	public String test() {
		return test;
	}
	

}
