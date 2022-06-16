package com.md.arif.response;

public class CustomerDetails {

	private int customerId;
	private String customerName;
	private String password;
	private long contactNo;
	private String email;
	private String permenentAddress;
	private String shippingAddress;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getPermenentAddress() {
		return permenentAddress;
	}
	public void setPermenentAddress(String permenentAddress) {
		this.permenentAddress = permenentAddress;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", password="
				+ password + ", contactNo=" + contactNo + ", email=" + email + ", permenentAddress=" + permenentAddress
				+ ", shippingAddress=" + shippingAddress + "]";
	}
	
	
}
