
package branching.statements;

//" 'continue' BRANCHING STATEMENT DEMO...

/* POINTS TO REMEMBER
'continue' statement causes flow of control to be transferred directly to the conditional
 expression that controls the loop.

It skips to the end of the innermost loop's body and and stop processing
the remainder of the code, basically skipping the remainder of this iteration of the loop.
*/


public class ContinueStatement {

	public static void main(String[] args) {

	    System.out.println("'continue'BRANCHING STATEMENT RESULT...");

	    String names[] = {"A", "B", "C", "A"};
	    
	         int count = 0;

	/* Note:
	 In the below example, if the name in the array is not equal to “Beah”, then
	‘continue’ statement skips to the end of the innermost loop's body and stop processing
	the remainder of the code.

	 And, the flow of control is transferred directly to the conditional
	  expression that controls the outer for loop.
	 */
	  outer:
	      for( int i=0; i<names.length; i++ ){
	    	 
	    	  if  ( !  names[i].equals(  "A" ) )  {
	    		  
	             continue outer;
	             
	              
	             } //skip next statement	 
	    	  
	              count++;
	              
	       } // for loop ends here...

	   System.out.println("There are "+count+" 'A' in the list");

	 }
	}
