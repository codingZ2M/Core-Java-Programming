package operators;

public class TernaryOperator {

	public static void main(String[] args) {
	
		// Ternary or conditional operator demo...
	     
	     /* POINTS TO REMEMBER:
	        ternary operator has three operands...
	        x = (boolean expression) ? value to assign if true : value to assign if false
	        refer the following Ternary Operator example...
	    */
	     System.out.println("Output of the 'Ternary or Conditional Operator' Example:");

	   int numOfPets = 8;
	   
	   String status = (numOfPets<4) ? "Pet limit not exceeded" : "too many pets";
	   
	System.out.println("This pet status is " + status);
	System.out.println("***************************************************************");


	//Nested conditional operators into one statement:
	System.out.println("Output of the 'Nested Conditional Operators' Example:");
	int sizeOfYard = 7;
	         int pets = 6;
	         
	     String result = (pets< 7) ?  "Pet count OK" :  (sizeOfYard > 8) ? "Pet limit on the edge" :"too many pets";
	        
	     System.out.println("Pet status is " + result);
	}

}
