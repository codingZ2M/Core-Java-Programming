package operators;

public class RelationalOperators {

	public static void main(String[] args) {
	
		 // Relational Operators example...
		   System.out.println("Output of the 'Relational Operators' Example:");

		   String animal = "unknown"; // declare String variable 'animal'

		         int weight = 700; // declare int variable 'weight'
		        char gender = 'm'; // declare char variable 'sex'
		       double colorWaveLength = 1.629; // declare double variable 'colorWaveLength'

		       if (weight >= 500) { // here '>=' relational operator returns true, so 'elephant' is assigned to animal variable.
		             animal = "elephant";
		        }
		          if (colorWaveLength > 1.621 && colorWaveLength== 1.629) { // here '>' relational operator returns true, so 'gray' is appedned to animal variable.
		              animal = "gray " + animal;
		           }
		        if (gender != 'f') { //When comparing a character with a character, or a character
		                          //with a number, Java will use the Unicode value of the character
		                          // as the numerical value, for comparison.

		                         // here '<=' returns false. so 'female' is not appended to animal variable.
		            animal = "female " + animal;
		        }
		                System.out.println("The animal is a " + animal);
		System.out.println("***************************************************************");


		//The resulting value of relational operator can also be assigned directly
		 //to a boolean primitive variable, for example:
		   
		   boolean b = 100 > 99; // here (>) operator returns ‘true’ to boolean primitive ‘b’
		         System.out.println("The value of b is " + b); // now, b is true...s
	}
}


