package com.md.arif.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.md.arif.model.Product;
import com.md.arif.response.ProductDetails;
import com.md.arif.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	private ProductService productService;


	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping("/products")
	public ProductDetails addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/products/{id}")
	public ProductDetails getProductById(@PathVariable("id") int id) {
		ProductDetails pro = productService.getProductById(id);
		return pro;
	}
	
	@PutMapping("/products/{id}")
	public Product updateProductById(@PathVariable("id") int id, @RequestBody Product product) {
		product.setProductId(id);
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProductById(@PathVariable("id") int id) {
		return productService.deleteProduct(id);
		
	}	
	
}

