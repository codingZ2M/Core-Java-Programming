package com.codingz2m.generics;

/*
 * Generic programming enables the programmer to create classes,interfaces and methods
   in which type of data is specified as a parameter.  
 * It provides a facility to write an algorithm independent of any specific type of data. 
 * Generics also provide type safety. Type safety means ensuring that an operation is 
   being performed on the right type of data before executing that operation.
   
 * Using Generics, it has become possible to create a single class ,interface or method 
   that automatically works with all types of data(Integer, String, Float etc)
   
   Syntax for creating an Object of a Generic type:
   Class_name <data type> reference_name = new Class_name<data type> ();
   We use < > to specify Parameter type 
   
 */

class GenTest {
	
  public static void main (String[] args) {
	  
	  // Reusing the same class for two different data types
	  
    Gen < Double> iob = new Gen<Double>(100.0);   //instance of Integer type Gen Class
    
  double x = iob.getOb();
    System.out.println(x);
    
    Gen < String> sob = new Gen<String>("Hello");  //instance of String type Gen Class
    String str = sob.getOb();
  
    
    
    System.out.println(str);
  }
}
