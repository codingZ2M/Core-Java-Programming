package com.codingz2m.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcardsTest {

	   public static double sum(List<? extends Number> numberlist) {
	      double sum = 0.0;
	      for (Number n : numberlist) sum += n.doubleValue();
	      return sum;
	   }

	   public static void main(String args[]) {
		   
	      List<Integer> integerList = Arrays.asList(1, 2, 3);
	      System.out.println("sum = " + sum(integerList));

	      List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
	      System.out.println("sum = " + sum(doubleList));
	      
	   }
	}

/* Java Generics - Upper Bounded Wildcards:
The question mark (?), represents the wildcard, stands for unknown type in generics. 
There may be times when you'll want to restrict the kinds of types that are allowed 
to be passed to a type parameter. For example, a method that operates on numbers might 
only want to accept instances of Number or its subclasses.

To declare a upper bounded Wildcard parameter, list the ?, followed by the extends keyword,
 followed by its upper bound.

*/