package com.md.arif.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.md.arif.model.Supplier;
import com.md.arif.repository.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired
	private SupplierRepository suppRep;
	
	public List<Supplier> getSuppliers(){
		return suppRep.findAll();
	}
	
	public Optional<Supplier> getSupplierById(int id) {
		return suppRep.findById(id);
	}
	
	public Supplier addSupplier(Supplier supplier) {
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
