package com.codingz2m.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {

	   public static void addCat( List <? super Cat> catList) {
	     // catList.add(new RedCat());
	      System.out.println("Cat Added");
	   }

	   public static void main(String[] args) {
		   
	      List<Animal> animalList= new ArrayList<Animal>();
	      List<Cat> catList= new ArrayList<Cat>();
	      
	      List<RedCat> redCatList= new ArrayList<RedCat>();
	      List<Dog> dogList= new ArrayList<Dog>();

	      //add list of super class Animal of Cat class
	      addCat(animalList);

	      //add list of Cat class
	      addCat(catList);

	      //compile time error
	      //can not add list of subclass RedCat of Cat class
	//   addCat(redCatList);

	      //compile time error
	      //can not add list of subclass Dog of Superclass Animal of Cat class
	   //   addCat(dogList); 
	   }
	}
	
class Animal {}

	class Cat extends Animal {}

	class RedCat extends Cat {}

	class Dog extends Animal {}

/* Java Generics - Lower Bounded Wildcards:
  The question mark (?), represents the wildcard, stands for unknown type in generics.
   There may be times when you'll want to restrict the kinds of types that are allowed 
   to be passed to a type parameter. For example, a method that operates on numbers might 
   only want to accept instances of Integer or its superclasses like Number.

To declare a lower bounded Wildcard parameter, list the ?, followed by the super keyword,
 followed by its lower bound.
  
 
*/