package branching.statements;


//"Labeled 'break' BRANCHING STATEMENT DEMO...

/* POINTS TO REMEMBER
 After the condition is satisfied, Labeled 'break' terminates an 'outer loop' which is
 identified by the label specified in the break statement.

And, the flow of control transfers to the statement immediately following the labeled (terminated) statement.
*/


public class LabeledBreak {

	public static void main(String[] args) {
		
		System.out.println("Labeled break BRANCHING STATEMENT RESULT...");

	     int [][] numbers = {
	                         {1, 2, 3},
	                         {4, 5, 5},
	                         {7, 8, 9}
	                       };   //  (3X3) Two dimensional array...

	        int searchNum = 5;
	        boolean foundNum = false;

	/* Note:
	 Here, the below 'if' condition matches the each value of a two dimensional array with the value
	 of 'searchNum' int variable.

	 If the condition is satisfied, then labeled 'break' will terminate the outer 'for loop' and flow of
	 control transfers to the statement immediately following the labeled (terminated) statement.
	 */

	 searchLabel:    // lebeled break statement of outer for loop….
	      for( int i=0; i<3; i++ ){   // outer for loop…
	          
	    	  for( int j=0; j<3; j++ ){  // inner for loop…
	             
	        	   if( searchNum == numbers[i][j] ){
	        		   
	                     foundNum = true;
	              	   
	                 System.out.println( searchNum);
	                 break searchLabel;
	        	   }	
	        	
	        	   
	           } // inner for loop ends here..
	    	//   System.out.println( i   );
	              
	      
	      } // outer for loop ends here..

	      if( foundNum ) // here, boolean variable 'foundNum' is passed in the 'if' condition and it holds either true/false.
	            System.out.println( searchNum + " found!" );
	        else
	            System.out.println( searchNum + " not found." );

	 }
	}


