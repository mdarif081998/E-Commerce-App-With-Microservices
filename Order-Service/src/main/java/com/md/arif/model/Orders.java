package com.md.arif.model;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	@GeneratedValue
	private int orderId;
	private Date orderPlacedDate;
	private Date orderDispatchDate;
	private Date orderDeleveryDate;
	private int paymentId;
	private int customerId;
	private int productId;
	private int shipperId;

	public Orders() {
		super();
	}

	public Orders(int orderId, Date orderPlacedDate, Date orderDispatchDate, Date orderDeleveryDate, int paymentId,
			int customerId, int productId, int shipperId) {
		super();
		this.orderId = orderId;
		this.orderPlacedDate = orderPlacedDate;
		this.orderDispatchDate = orderDispatchDate;
		this.orderDeleveryDate = orderDeleveryDate;
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.productId = productId;
		this.shipperId = shipperId;
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

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderPlacedDate=" + orderPlacedDate + ", orderDispatchDate="
				+ orderDispatchDate + ", orderDeleveryDate=" + orderDeleveryDate + ", paymentId=" + paymentId
				+ ", customerId=" + customerId + ", productId=" + productId + ", shipperId=" + shipperId + "]";
	}
	
	
}
