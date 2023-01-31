package com.codingz2m.wrapperclasses.accessmodifiers;

//	When do we use Static Variable? 
//  If you don't want a variable to be an object specific, make it as static variable
//  All the objects share the same value.

 public class Product {
	
	private String productId;  // Non-Static Variable
	private String productName;
	private double price;
	private static String category;  // Static Variable
	
	
	   // Static Block.. will be executed only once despite how many objects you created
	static {               
		category="Gadgets";
	}
	
	// Constructor is initializing only instance variable of an object
	public Product(String productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	
	public String getProductId() {
		return productId;
	}

    String getProductName() {
		return productName;
	}

	protected double getPrice() {
		return price;
	}

	public static String getCategory() {
		return category;
	}


	@Override
	public String toString() {
		return "Product [productId=" + this.productId + ", productName=" + this.productName + ", price=" + this.price + "]";
	}	
	
}
