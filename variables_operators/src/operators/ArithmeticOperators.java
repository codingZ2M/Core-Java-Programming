package operators;

import java.rmi.server.Operation;

public class ArithmeticOperators {
	
	  /**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  
// Operators: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
	
		// What is operator & operand?
		  /*Operator: A special symbol, used to perform some Operation.class.
		    Operand: Any object that can be manipulated by an operator..
		  */
 System.out.println("*************** Basic Arithmetic Operators******************");
		          int result = 1 + 2;
		          System.out.println("1 + 2 = " + result);

		          int previousResult = result;

		          result = result - 1;
		          System.out.println(previousResult + " - 1 = " + result);

		          previousResult = result;

		          result = result * 10;
		          System.out.println(previousResult + " * 10 = " + result);

		          previousResult = result;

		          result = result / 5;
		          System.out.println(previousResult + " / 5 = " + result);

		          previousResult = result;
		          result = result % 3; // reminder..
		          System.out.println(previousResult + " % 3 = " + result);

		          previousResult = result;
		          result = result + 1;
		          System.out.println("------Increment Operators-------");
		          System.out.println("Result is now " + result);
		         // ++result;
		          System.out.println("Result is now " + result++);
		         // result--;
		          System.out.println("New Result Value " + ++result);
		          System.out.println("Result is now " + --result);
		          
		          System.out.println("Result is now " + result);
		          result += 2;
		          result = result +2;
		          System.out.println("Result is now " + result);
		          result *= 10;
		          System.out.println("Result is now " + result);
		          result -= 10;
		          System.out.println("Result is now " + result);
		          result /= 10;
		          System.out.println("Result is now " + result);


		          boolean isAlien = false;
		          if (isAlien )
		              System.out.println("It is not an alien!");

		          int topScore = 80;
		          if (topScore < 100)
		              System.out.println("You got the high score!");

		          int secondTopScore = 81;
		          if ( (topScore > secondTopScore) && (topScore < 100) )
		              System.out.println("Greater than second top score and less then 100");
		          
		          System.out.println();
		          
System.out.println("***************Compound Assignment Operators in an Expresions******************");
		     
              int e=10;
		          
		       e *=  (7 * 3) + (24 / 3) - 5;
		       
		             System.out.println(e);
		             
		             int bb = 100;
		             bb /= (7 * 3) + (24 / 3) - 5;
		             System.out.println(bb);
		             
		             int z = 100;
		             z += (7 * 3) + (24 / 3) - 5;
		             
		             System.out.println(z);
		    
		          int j = 2 * 100/5;
		  
		         System.out.println(j);
		  
	  }

}
