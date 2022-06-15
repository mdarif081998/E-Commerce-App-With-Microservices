package com.md.arif.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Supplier {
	
	@Id
	@GeneratedValue
	private int supplierId;
	private String firstName;
	private String lastName;
	private String companyName;
	private long contactNo;
	private String email;
	private String password;
	private String address;
	


	public Supplier() {
		super();
	}


	public Supplier(int supplierId, String firstName, String lastName, String companyName, long contactNo, String email,
			String password, String address) {
		super();
		this.supplierId = supplierId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		return "Supplier [supplierId=" + supplierId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", companyName=" + companyName + ", contactNo=" + contactNo + ", email=" + email + ", password="
				+ password + ", address=" + address + "]";
	}
	
	

}
