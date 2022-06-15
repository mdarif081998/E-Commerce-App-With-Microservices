package com.md.arif.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.md.arif.model.Shipper;
import com.md.arif.service.ShipperService;

@RestController
public class ShipperController {

	@Autowired
	private ShipperService shipperService;
	
	@GetMapping("/shippers")
	public List<Shipper> getAllShippers(){
		return shipperService.getAllShippers();
	}
	
	@PostMapping("/shippers")
	public Shipper addShipper(@RequestBody Shipper shipper) {
		return shipperService.addShipper(shipper);
	}
	
	@GetMapping("/shippers/{shipperId}")
	public Optional<Shipper> getShipperById(@PathVariable("shipperId") int shipperId){
		return shipperService.getShipperById(shipperId);
	}
	
	@PutMapping("/shippers/{shipperId}")
	public Shipper updateShipper(@PathVariable("shipperId") int shipperId, @RequestBody Shipper shipper) {
		shipper.setShipperId(shipperId);
		return shipperService.updateShipper(shipper);
	}
	
	@DeleteMapping("/shippers/{shipperId}")
	public void deleteShipper(@PathVariable("shipperId") int shipperId) {
		shipperService.deleteShipper(shipperId);
	}
}
