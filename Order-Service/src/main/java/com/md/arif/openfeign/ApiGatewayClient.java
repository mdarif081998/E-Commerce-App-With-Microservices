package com.md.arif.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.md.arif.response.CustomerDetails;
import com.md.arif.response.ProductDetails;
import com.md.arif.response.ShipperDetails;

@FeignClient(value = "api-gateway")
public interface ApiGatewayClient {

	@GetMapping("/customer-service/customers/{customerId}")
	public CustomerDetails getCustomerById(@PathVariable int customerId);
	

	@GetMapping("/product-service/products/{productId}")
	public ProductDetails getProductById(@PathVariable int productId);
	
	@GetMapping("/shipper-service/shippers/{shipperId}")
	public ShipperDetails getShipperById(@PathVariable int shipperId);
	
}
