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

import com.md.arif.model.Customer;
import com.md.arif.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/customers/{customerId}")
	public Optional<Customer> getCustomerById(@PathVariable("customerId") int customerId) {
		return customerService.getCustomerById(customerId);
	}
	
	@PutMapping("/customers/{customerId}")
	public Customer updateCustomerById(@PathVariable("customerId") int customerId, @RequestBody Customer customer) {
		customer.setCustomerId(customerId);
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/customers/{customerId}")
	public void deleteCustomerById(@PathVariable("customerId") int customerId) {
		customerService.deleteCustomer(customerId);
	}
}


