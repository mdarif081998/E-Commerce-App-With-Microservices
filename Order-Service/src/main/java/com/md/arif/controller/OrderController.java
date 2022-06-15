package com.md.arif.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.md.arif.model.Orders;
import com.md.arif.response.OrderDetails;
import com.md.arif.service.OrderService;

@RestController
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;

	
	@GetMapping("/orders")
	public List<Orders> getAllPlacedOrderDetails(){
		return orderService.getAllPlacedOrders();
	}
	
	@PostMapping("/orders")
	public OrderDetails addPlacedOrder(@RequestBody Orders order) {
		return orderService.placeOrder(order);
	}
	
	@GetMapping("/orders/{orderId}")
	public OrderDetails getOrderById(@PathVariable("orderId") int orderId) {
		OrderDetails ord=orderService.getOrderById(orderId);
		return ord;
	}
	
	@PutMapping("/orders/{orderId}")
	public Orders updateOrderDetails(@PathVariable("orderId") int orderId, @RequestBody Orders order) {
		order.setOrderId(orderId);
		return orderService.updateOrderDetails(order);
	}
	
	@DeleteMapping("/orders/{orderId}")
	public void deleteOrderDetails(@PathVariable("orderId") int orderId) {
		 orderService.deleteOrderDetails(orderId);
	}

}
