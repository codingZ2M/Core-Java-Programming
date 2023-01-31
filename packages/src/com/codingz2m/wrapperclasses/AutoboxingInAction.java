package com.codingz2m.wrapperclasses;

public class AutoboxingInAction {

	public static void main(String[] args) {
		
	int [] values = { 3, 97, 55, 22, 12345 };
		
		// Array to store Integer objects
		Integer[] integerObjectsArray = new Integer[values.length];
		
		
		// Call method to cause boxing conversions
		 for(int i = 0 ; i < values.length; ++i) {
			 integerObjectsArray[i] = boxInteger(Integer.valueOf ( values[i] ) );  // Auto Boxing / Wrapping
		}
		
		 // Use method to cause Unboxing conversions
		 for(Integer intObject : integerObjectsArray) {
		
			 		int i = unboxInteger(intObject);       // UnBoxing
			 		System.out.println(i);
		   }
	    }
		
	
	// Method to cause boxing conversion
	public static Integer boxInteger(Integer obj) {
			   return obj;
		}
	
	// Method to cause unboxing conversion
	
	public static int unboxInteger(int n) {
			
		return   n;

		}
}
