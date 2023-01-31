package com.codingz2m.wrapperclasses;

public class ObjectsToValues {

	public static void main(String[] args) {

//***********************Converting Objects to Values**********************
		
		//double df = 9.4d;
		String dfd = "9.4d";
		Double d = Double.valueOf(dfd);
        
    	double prim_d =  d.doubleValue(); 
           System.out.println("Value converted to double: " + prim_d);
           
        byte b = d.byteValue(); 
           System.out.println("Value when converted to bye: " + b);
           
        int i = d.intValue();
            System.out.println("Value when converted to int: " + i);
            
        short st = d.shortValue(); 
            System.out.println("Value when converted to short: " + st);
            
        int l = (int) d.longValue();
            System.out.println("Value when converted to long: " + l);
         
            
         int intVal = 123456;
         Integer i1 = Integer.valueOf(intVal);
            		
        System.out.println("Integer i value is converted into byte : " + i1.byteValue());
            				
            	double dd = i1.doubleValue();
            				i1.intValue();
            				i1.longValue();
            				
            						
            				
            				
            		 float floatVal =789.00f;
            		 Number f = Float.valueOf(floatVal);
            			
            				System.out.println("Float f value is converted into double : " + f.longValue()); 
            				System.out.println("Float f value is converted into short : " + f.shortValue());
            				
            	    f =  Long.valueOf(654321);
            
            			System.out.println("Long l value is converted into float : " + f.doubleValue()); 
                        System.out.println("Integer i value is converted into long : " + f.longValue());
            
            
        

	}

}
