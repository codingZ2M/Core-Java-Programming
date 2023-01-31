package arrays;

import statickeyword.Product;

public class OneDimentionalArray {

	public static void main(String[] args) {
	
		// 1D Array
		Product products [] = new Product[3];
		
		products[0] = new Product("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d);
		products[1] = new Product("SMW003", "Smartwatch with 1.69\" HD Display, Sleek Metal Body, HR & SpO2 Level Monitor", 90.00d);
		products[2] = new Product("BQC003", "Bullet Pro 36W PD Quick Charger, 3 Port Fast Car Charger Adapter", 24.00d);
		
		for (int i=0; i<products.length; i++) {
			System.out.println(products[i]);
		}
		
		
		
	
		// Alternative way to initialize and create an array
		Product	product1 = new Product("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d);
		Product product2 = new Product("SMW003", "Smartwatch with 1.69\" HD Display, Sleek Metal Body, HR & SpO2 Level Monitor", 90.00d);
		Product product3 = new Product("BQC003", "Bullet Pro 36W PD Quick Charger, 3 Port Fast Car Charger Adapter", 24.00d);
		
		Product products1 [] = {	product1, 	product2, 	product3};
		
		for (int i=0; i<products1.length; i++) {
			System.out.println(products1[i]);
		 }
       
		
	}
}
