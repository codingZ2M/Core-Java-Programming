package com.codingz2m.generics.classes;

/*
  * Generics Work Only with Objects: i.e the type argument must be a class type. You cannot use primitive datatypes
  * Generic Type with more than one parameter
 */

//Creating a generic class 'Gen' class with type parameters T1, T2
// The name of the type parameter is contained within angle brackets <>
// This acts as a placeholder for the actual type parameter that will be passed to 'Gen' class when an object is created.
class Gen <T1,T2>
{
  T1 name;
  T2 value;

  Gen(T1 o1,T2 o2)
  {
    name = o1;
    value = o2;
  }

  public T1 getName()
  {
    return name;
  }

  public T2 getValue()
  {
    return value;
  }

}