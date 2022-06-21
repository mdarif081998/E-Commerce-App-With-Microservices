package com.md.arif.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.md.arif.feignclient.SupplierFeignClient;
import com.md.arif.model.Product;
import com.md.arif.repository.ProductRepository;
import com.md.arif.response.ProductDetails;
import com.md.arif.response.SupplierDetails;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productrepository;
	
//	@Autowired
//	private SupplierFeignClient supplierFeignClient;
	
	@Autowired
	private Resilience4jconfiguration resilience4jconfig;
	
	public ProductDetails addProduct(Product product) {
		SupplierDetails  sr = resilience4jconfig.getSupplierById(product.getSupplierId());
		
		Product pro = productrepository.save(product);
		
		ProductDetails pr = new ProductDetails(pro);
		pr.setSupplierDetails(sr);
		
		return pr;
	}
	
	public List<Product> getAllProducts() {
		return (List<Product>) productrepository.findAll();
}
	
	public ProductDetails getProductById(int productId){
		Optional<Product>  product= productrepository.findById(productId);
		ProductDetails pr = new ProductDetails(product.get());
		
		//pr.setSupplierDetails(supplierFeignClient.getSupplierById(product.get().getSupplierId()));
		pr.setSupplierDetails(resilience4jconfig.getSupplierById(product.get().getSupplierId()));
		
		return pr;
	}
	
	
	public Product updateProduct(Product product) {
		 Optional<Product> pro= productrepository.findById(product.getProductId());
		
		 pro.get().setProductName(product.getProductName());
		 pro.get().setProductDescription(product.getProductDescription());
		 pro.get().setProductType(product.getProductType());
		 pro.get().setSupplierId(product.getSupplierId());
		 pro.get().setUnitPrice(product.getUnitPrice());
		 pro.get().setAvailableQty(product.getAvailableQty());
		 
		return productrepository.save(pro.get());
	}
	
	public String deleteProduct(int productId) {
		Optional<Product> pro=productrepository.findById(productId);
		productrepository.delete(pro.get());
		return "Product Removerd Succesfully";
	}
}

