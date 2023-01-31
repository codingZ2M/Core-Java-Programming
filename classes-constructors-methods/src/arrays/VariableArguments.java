package arrays;

import statickeyword.Product;

/*
 Variable Argument (Varargs):
  Allows the method to accept zero or multiple arguments.
  Useful, If we don't know how many argument we will have to pass in the method.
  A short-hand for methods that support an arbitrary number of parameters of one type.
  Rules:
  =====
  Each method can only have one varargs parameter
  The varargs argument must be the last parameter
 */
public class VariableArguments {

	    public Product[] cartItems(Product... varargs){  // Variable length arguments
	        System.out.println("No Of Products: " + varargs.length);
	        return varargs;
	    }

	    
	    public static void main( String[] args ) {
	    	
	    	VariableArguments va = new VariableArguments();
	    	Product[] products= null;
	    	
	    	products = va.cartItems(
	    			new Product("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d),
	    			new Product("SMW003", "Smartwatch with 1.69\" HD Display, Sleek Metal Body, HR & SpO2 Level Monitor", 90.00d)
	    			);
	
	    	for (Product i: products) {
	    		System.out.println(i);
	    	}
	    	
	    	System.out.println("******************************************************");
	    	
	     	products = va.cartItems(
	     			new Product("BQC003", "Bullet Pro 36W PD Quick Charger, 3 Port Fast Car Charger Adapter", 24.00d),
	     			new Product("BWR003", "Anti Skid Double Wheel Total Body AB Roller", 20.00d),
	     			new Product("CCM003", "Rapid Car Charger Multi Ports Type C Port & USB A Ports for Car Compatible", 23.00d)
	    			);
	
	    	for (Product i: products) {
	    		System.out.println(i);
	    	}
	    	
	    	
	    }
	}