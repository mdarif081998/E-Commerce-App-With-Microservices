package com.md.arif.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.md.arif.model.Customer;
import com.md.arif.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
	
	public Customer addCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	public Optional<Customer> getCustomerById(int customerId) {
		return customerRepo.findById(customerId);
	}
	
	public Customer updateCustomer(Customer customer) {
		Optional<Customer> cust = customerRepo.findById(customer.getCustomerId());
		
		cust.get().setCustomerName(customer.getCustomerName());
		cust.get().setContactNo(customer.getContactNo());
		cust.get().setEmail(customer.getEmail());
		cust.get().setPassword(customer.getPassword());
		cust.get().setPermenentAddress(customer.getPermenentAddress());
		cust.get().setShippingAddress(customer.getShippingAddress());
		
		return customerRepo.save(cust.get());
	}
	
	public void deleteCustomer(int customerId) {
		customerRepo.deleteById(customerId);
	}
}
