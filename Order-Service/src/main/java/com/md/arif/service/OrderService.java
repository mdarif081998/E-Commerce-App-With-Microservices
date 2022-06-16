package com.md.arif.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.md.arif.model.Orders;
import com.md.arif.openfeign.ApiGatewayClient;
//import com.md.arif.openfeign.CustomerServiceClient;
//import com.md.arif.openfeign.ProductServiceClient;
//import com.md.arif.openfeign.ShipperServiceClient;
import com.md.arif.repository.OrderRepository;
import com.md.arif.response.CustomerDetails;
import com.md.arif.response.OrderDetails;
import com.md.arif.response.ProductDetails;
import com.md.arif.response.ShipperDetails;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ApiGatewayClient apigc;
	
//	@Autowired
//	private ProductServiceClient psc;
//	
//	@Autowired
//	private CustomerServiceClient csc;
//	
//	@Autowired
//	private ShipperServiceClient ssc;
	
	
	
	public OrderDetails placeOrder(Orders order) {
		
		ProductDetails  pr = apigc.getProductById(order.getProductId());
		CustomerDetails cr = apigc.getCustomerById(order.getCustomerId());
		ShipperDetails sr = apigc.getShipperById(order.getShipperId());
		Orders o = orderRepository.save(order);
		
		OrderDetails or = new OrderDetails(o);
		or.setProductDetails(pr);
		or.setCustomerDetails(cr);
		or.setShipperDetails(sr);
		
		return or;
	}
	
	
	public List<Orders> getAllPlacedOrders(){
		return (List<Orders>) orderRepository.findAll();
	}
	
	
	public OrderDetails getOrderById(int orderId) {
		Optional<Orders>  order= orderRepository.findById(orderId);
		OrderDetails od = new OrderDetails(order.get());
		od.setProductDetails(apigc.getProductById(order.get().getProductId()));
		od.setCustomerDetails(apigc.getCustomerById(order.get().getCustomerId()));
		od.setShipperDetails(apigc.getShipperById(order.get().getShipperId()));
		return od;
	}
	
	
	public Orders updateOrderDetails(Orders order) {
		Optional<Orders> ord=orderRepository.findById(order.getOrderId());
		
		ord.get().setOrderPlacedDate(order.getOrderPlacedDate());;
		ord.get().setOrderDispatchDate(order.getOrderDispatchDate());;
		ord.get().setOrderDeleveryDate(order.getOrderDeleveryDate());;
		ord.get().setPaymentId(order.getPaymentId());;
		ord.get().setCustomerId(order.getCustomerId());;
		ord.get().setProductId(order.getProductId());;
		ord.get().setShipperId(order.getShipperId());;
		
		return orderRepository.save(ord.get());
	}
	
	
	public void deleteOrderDetails(int orderId) {
		Optional<Orders> ord=orderRepository.findById(orderId);
		orderRepository.delete(ord.get());
	}

}
