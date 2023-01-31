package com.codingz2m.wrapperclasses.accessmodifier.test;

import com.codingz2m.wrapperclasses.accessmodifiers.Product;

// Sub Class
public class AccessModifiersProtectedTest extends Product{

	public AccessModifiersProtectedTest(String productId, String productName, double price) {
		super(productId, productName, price);
	}

	public static void main(String[] args) {
		// Public Access (Product Class)
		AccessModifiersProtectedTest accessModifiersProtectedTest 
		=	new AccessModifiersProtectedTest("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d);
      
		accessModifiersProtectedTest.getPrice();   // Protected Access
		accessModifiersProtectedTest.getProductId();
	}

}
