package com.codingz2m.generics.functions;


public class Gen {
	
    // Creating a generic method genericDisplay with type parameter T
	//  The name of the type parameter is contained within angle brackets <>
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    } 
   

}
