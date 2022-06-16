package com.md.arif.response;

public class ShipperDetails {
	
	private int shipperId;
	private String companyName;
	private long contactNo;
	private String email;
	private String password;
	private String address;
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ShipperDetails [shipperId=" + shipperId + ", companyName=" + companyName + ", contactNo=" + contactNo
				+ ", email=" + email + ", password=" + password + ", address=" + address + "]";
	}
	
	

}
