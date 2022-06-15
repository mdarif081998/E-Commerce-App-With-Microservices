package com.md.arif.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.md.arif.model.Shipper;
import com.md.arif.repository.ShipperRepository;

@Service
public class ShipperService {
	
	@Autowired
	private ShipperRepository shipperRepo;
	
	public List<Shipper> getAllShippers(){
		return shipperRepo.findAll();
	}
	
	
	public Shipper addShipper(Shipper shipper) {
		return shipperRepo.save(shipper);
	}
	
	public Optional<Shipper> getShipperById(int shipperId){
		return shipperRepo.findById(shipperId);
	}
	
	public Shipper updateShipper(Shipper shipper) {
		Optional<Shipper> ship= shipperRepo.findById(shipper.getShipperId());
		
		ship.get().setCompanyName(shipper.getCompanyName());
		ship.get().setContactNo(shipper.getContactNo());
		ship.get().setEmail(shipper.getEmail());
		ship.get().setPassword(shipper.getPassword());
		ship.get().setAddress(shipper.getAddress());
		
		return shipperRepo.save(ship.get());
	}
	
	public void deleteShipper(int shipperId) {
		shipperRepo.deleteById(shipperId);
	}

}
