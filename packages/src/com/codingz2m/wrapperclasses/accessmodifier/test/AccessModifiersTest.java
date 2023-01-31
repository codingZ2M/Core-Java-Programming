package com.codingz2m.wrapperclasses.accessmodifier.test;

import com.codingz2m.wrapperclasses.accessmodifiers.Product;

/*
 private: Specific to a class
 default: Specific to a package
 public : Any class inside any package can access
 protected: Only sub class inside any package can access
 */

// Non-Sub Class
public class AccessModifiersTest {

	public static void main(String[] args) {
      
		// Public Access (Product Class)
		Product product =	new Product("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d);
		
		// product.getProductName();  // Default Access Denied
		
		product.getProductId();  // Public Access
		
	//product.getPrice();   // Protected Access Denied
		
	}

}
