package com.codingz2m.generics.classes;

public class GenTest {

  public static void main (String[] args) {
	  /*
	   * Note: Since there are two parameters in Generic class - T1 and T2, therefore, 
	   * while creating an instance of this Generic class, we need to mention two data
	   *  types(Parameter type) that needs to be passed as parameter to this class.
	   */
    Gen < String, Integer> obj = new Gen<String, Integer>("Spring Boot",1);

    String  s = obj.getName();
    System.out.println(s);

    Integer i = obj.getValue();
    System.out.println(i);
  }
}  