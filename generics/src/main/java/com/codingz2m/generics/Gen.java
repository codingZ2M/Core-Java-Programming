package com.codingz2m.generics;

// Creating a generic class 'Gen' class with type parameter T
//  The name of the type parameter is contained within angle brackets <>
//  This acts as a placeholder for the actual type parameter that will be passed to 'Gen' class when an object is created.
class Gen <T> 
{
  T ob;     //an object of type T is declared<
  
  Gen(T o)  //constructor
  {
    ob = o;
  }
  public T getOb()
  {
	  
	  
    return ob;
  }
 
  
}

/*
  Commonly used type parameter names are:
   
 	E – Element (used extensively by the Java Collections Framework, for example, ArrayList, Set, etc.)
	K – Key (Used in Map)
	N – Number
	T – Type
	V – Value (Used in Map)
	S, U, V, etc. – 2nd, 3rd, 4th types
 
*/