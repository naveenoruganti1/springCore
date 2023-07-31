package com.collectiondi.beans;

import java.util.List;

public class Product {
	public int productNo;
	public String productName;
	public List<String> features;
	
	public Product(int productNo) {
		this.productNo = productNo;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setFeatures(List<String> features) {
		this.features = features;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", features=" + features + "]";
	}
}
