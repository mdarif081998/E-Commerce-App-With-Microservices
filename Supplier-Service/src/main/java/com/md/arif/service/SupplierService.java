package com.md.arif.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.md.arif.model.Supplier;
import com.md.arif.repository.SupplierRepository;


@Service
public class SupplierService {
	
	 Logger logger
     = Logger.getLogger("Inside supplier");
	
	@Autowired
	private SupplierRepository suppRep;
	
	public List<Supplier> getSuppliers(){
		logger.info("Inside Get all Supplier");
		return suppRep.findAll();
	}
	
	public Optional<Supplier> getSupplierById(int id) {
		
		logger.info("Inside Get Supplier by id");
		return suppRep.findById(id);
	}
	
	public Supplier addSupplier(Supplier supplier) {
		System.out.println("Inside Add Supplier");
		return suppRep.save(supplier);
	}
	
	public Supplier updateSupplier(Supplier supplier) {
		Optional<Supplier> supp = suppRep.findById(supplier.getSupplierId());
		
		supp.get().setFirstName(supplier.getFirstName());
		supp.get().setLastName(supplier.getLastName());
		supp.get().setCompanyName(supplier.getCompanyName());
		supp.get().setContactNo(supplier.getContactNo());
		supp.get().setEmail(supplier.getEmail());
		supp.get().setPassword(supplier.getPassword());
		supp.get().setAddress(supplier.getAddress());
		
		return suppRep.save(supp.get());
	}
	
	public void deleteSupplier(int Id) {
		suppRep.deleteById(Id);
	}

}
