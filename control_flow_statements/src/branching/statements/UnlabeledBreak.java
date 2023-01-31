package branching.statements;


//"Unlabeled 'break' BRANCHING STATEMENT DEMO...

/* POINTS TO REMEMBER
unlabeled 'break' statement is mainly used to terminate the loop, after the condition is satisfied.

It terminates the enclosing switch or while or for loop, and flow of control transfers
to the statement immediately following the looping statements.
 */

public class UnlabeledBreak {

	public static void main(String[] args) {

		System.out.println("Unlabeled break BRANCHING STATEMENT RESULT...");

		String [] empID=  { new String ("E1001"), new String ("E1002"), "E1003", "E1004", "E1005"}; // String array declaration...

		String searchID = "E1004";

		boolean foundID = false;

		/* Note:
	  In the below, if condition matches the each value of an array with the value of 'searchID' string variable.

	 If the condition is satisfied, then 'break' statement will terminate the 'for loop' and flow of control transfers
	 to the statement immediately following the looping statements.
		 */

		for( int i=0; i < empID.length; i++ ){ // getting array values one by one using for loop...

			if( empID[i].equals( searchID )   )  { // condtional expression…

				foundID = true;
				break;
			}
			System.out.println( i );
		}

		if( foundID ) // here, boolean variable 'foundID' is passed in the 'if' condition and it holds either true/false.
			System.out.println( searchID + " found!" );
		else
			System.out.println( searchID + " not found." );

	}
}

