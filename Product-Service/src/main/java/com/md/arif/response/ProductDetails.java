package com.md.arif.response;

import com.md.arif.model.Product;

public class ProductDetails {
	
	
	private int productId;
	private String productName;
	private String productDescription;
	private String productType;
	private int supplierId;
	private double unitPrice;
	private int availableQty;
	
	private SupplierDetails supplierDetails;
	
	
	public ProductDetails() {
		super();
	}


	public ProductDetails(Product product) {
		super();
		this.productId = product.getProductId();
		this.productName = product.getProductName();
		this.productDescription = product.getProductDescription();
		this.productType = product.getProductType();
		this.supplierId = product.getSupplierId();
		this.unitPrice = product.getUnitPrice();
		this.availableQty = product.getAvailableQty();
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public int getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getAvailableQty() {
		return availableQty;
	}


	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}


	public SupplierDetails getSupplierDetails() {
		return supplierDetails;
	}


	public void setSupplierDetails(SupplierDetails supplierDetails) {
		this.supplierDetails = supplierDetails;
	}
	
	
	
	
}
