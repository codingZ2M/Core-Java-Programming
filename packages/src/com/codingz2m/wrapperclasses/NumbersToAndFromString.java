package com.codingz2m.wrapperclasses;

public class NumbersToAndFromString {

	public static void main(String arg[])     {

		//*********Converting between Primitive Type Values To Strings ***********************     

		float f = 156.8f;
		String s3 = Float.toString( f ); 

		System.out.println("converting a value of the corresponding primitive type(float) to a String object = " + s3);
		System.out.println("******************************************************************************************************");	


		int i = 100;
		String s7=   Integer.toString(i);

		double  dd = 12.0d;
		String ss = Double.toString(dd);



		//****************Methods to convert from a String object to a primitive types********************    

		String s1 = "9.9f";

		try {
			float df = Float.parseFloat(s1);
			System.out.println(df);

			String s10 = "134";
			long l  = Long.parseLong(s10);
			System.out.println(l);
		}

		catch (NumberFormatException nfe) {  
			System.out.println("Kindly provide valid data");
		}
		

	}
}

