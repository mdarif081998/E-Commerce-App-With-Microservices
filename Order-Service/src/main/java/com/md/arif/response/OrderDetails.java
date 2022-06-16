package com.md.arif.response;

import java.sql.Date;

import com.md.arif.model.Orders;

public class OrderDetails {

	private int orderId;
	private Date orderPlacedDate;
	private Date orderDispatchDate;
	private Date orderDeleveryDate;
	private int paymentId;
	private int customerId;
	private int productId;
	private int shipperId;
	
	private ProductDetails productDetails;
	private CustomerDetails customerDetails;
	private ShipperDetails shipperDetails;
	
	
	public OrderDetails(Orders order) {
		super();
		this.orderId = order.getOrderId();
		this.orderPlacedDate = order.getOrderPlacedDate();
		this.orderDispatchDate = order.getOrderDispatchDate();
		this.orderDeleveryDate = order.getOrderDeleveryDate();
		this.paymentId = order.getPaymentId();
		this.customerId = order.getCustomerId();
		this.productId = order.getProductId();
		this.shipperId = order.getShipperId();
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}


	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}


	public Date getOrderDispatchDate() {
		return orderDispatchDate;
	}


	public void setOrderDispatchDate(Date orderDispatchDate) {
		this.orderDispatchDate = orderDispatchDate;
	}


	public Date getOrderDeleveryDate() {
		return orderDeleveryDate;
	}


	public void setOrderDeleveryDate(Date orderDeleveryDate) {
		this.orderDeleveryDate = orderDeleveryDate;
	}


	public int getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getShipperId() {
		return shipperId;
	}


	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}


	public ProductDetails getProductDetails() {
		return productDetails;
	}


	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}


	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}


	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}


	public ShipperDetails getShipperDetails() {
		return shipperDetails;
	}


	public void setShipperDetails(ShipperDetails shipperDetails) {
		this.shipperDetails = shipperDetails;
	}


	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderPlacedDate=" + orderPlacedDate + ", orderDispatchDate="
				+ orderDispatchDate + ", orderDeleveryDate=" + orderDeleveryDate + ", paymentId=" + paymentId
				+ ", customerId=" + customerId + ", productId=" + productId + ", shipperId=" + shipperId
				+ ", productDetails=" + productDetails + ", customerDetails=" + customerDetails
				+ ", shipperDetails=" + shipperDetails + "]";
	}
	
	
}
