package com.md.arif.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Shipper {
	
	@Id
	@GeneratedValue
	private int shipperId;
	private String companyName;
	private long contactNo;
	private String email;
	private String password;
	private String address;
	
	
	public Shipper() {
		super();
	}


	public Shipper(int shipperId, String companyName, long contactNo, String email, String password, String address) {
		super();
		this.shipperId = shipperId;
		this.companyName = companyName;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.address = address;
	}





	public int getShipperId() {
		return shipperId;
	}


	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Shipper [shipperId=" + shipperId + ", companyName=" + companyName + ", contactNo=" + contactNo
				+ ", email=" + email + ", password=" + password + ", address=" + address + "]";
	}
	
	
}
