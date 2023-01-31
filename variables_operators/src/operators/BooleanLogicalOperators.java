package operators;

public class BooleanLogicalOperators {

	public static void main(String[] args) {
		
/*	  
  Reference:
	https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
*/
		   // && short-circuit AND logical operator demo...
	    
	    /* POINTS TO REMEMBER:
	   A short-circuit && evaluates the left side of the operation first (operand one),
	   and if it resolves to false, the && operator doesn't waste time looking at the right side
	   of the equation. (operand two).

	   AND(&&) expression to be true, both operands must be true.
	   */
	    
	System.out.println("Output of the 'short-circuit AND (&&) logical operator' Example:");

	double score = 79;
	 char grade='A';
	 boolean isEligible= true;
	 
	  if ( score >= 95 || score >= 98 )  {
         grade = 'A';
	  isEligible = true;
	  }
	 else if (  (score >= 80)  && (score <=90) ) {
	    	grade = 'B';
	  isEligible = true;
	 }     
	 else   if (  (score >= 70)  && (score <=80) ) {
	    	grade = 'C';  
	  isEligible = true;
	 }
	 else {
		 grade ='D';
	  isEligible = false;
	 }
	  
		System.out.println("Grade Is: " + grade);
		
		if( ! isEligible ) 
			System.out.println("Not Eligible for Scholarship: ");
		else 
			System.out.println("Eligible for Scholarship: ");
			
	}

}
