package operators;

public class EqualityOperator {

	public static void main(String[] args) {
	
		// Equality Operators Demo.....
        System.out.println("Output of the 'Equality Operator with Primitives'Example:");
        
        char c = 'A' ;
        char b = 'A';
        
        boolean f= true;
        boolean g= true;
         int i1= 10;
         int i2 = 20;

       System.out.println("char 'a' == 'a'? " + ( c == b )); // compares two characters
       
       System.out.println("char 'a' == 'b'? " + ('a' == 'b')); // compares two characters
       
       System.out.println("5 != 6? " + (i1 != i2)); // compares two numbers
       
       System.out.println("5.0 == 5L? " + (5.0d == 512.00d)); // compares two numbers
       
       System.out.println("true == false? " + (f == g)); // compares two booleans
       
System.out.println("***************************************************************");

System.out.println("Output of the 'Equality Operator with object reference variables'Example:");
  
   EqualityOperator eo1 = new EqualityOperator();   //  here  ‘eo1’ is an object reference variable of class EqualityOperator
   
   EqualityOperator eo2 = new EqualityOperator();   // here  ‘eo2’ is an object reference variable of class EqualityOperator

    EqualityOperator eo3 = eo1; // 'eo3' is initialized to refer to the same object that ‘eo1’ refers.

        System.out.println("Is reference eo1 == eo2? " + (eo1 == eo2)); // eo1 & eo2 refer different objects
        
        System.out.println("Is reference eo1 == eo3? " + (eo1 == eo3)); // eo1 & eo3 refer the same object
 
	}

}
