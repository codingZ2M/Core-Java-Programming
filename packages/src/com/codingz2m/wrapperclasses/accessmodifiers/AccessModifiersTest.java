package com.codingz2m.wrapperclasses.accessmodifiers;

/*
 private: Specific to a class
 default: Specific to a package
 public : Any class inside any package can access
 protected: Only sub class inside any package can access
 */

public class AccessModifiersTest {

	public static void main(String[] args) {
      
		Product product =	new Product("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d);
		
		//product.productId ="ED776O";  // Private Access Denied
		
		product.getProductId(); 
		
		product.getProductName();  // Default Access
	}

}
