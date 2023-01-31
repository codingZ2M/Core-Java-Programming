package looping.statements;

public class ForStatement {
	
    public static double  calculateInterest(double amountOfDeposit, double rateOfInterest, int tenure) {
		
    	return    amountOfDeposit * (1 + (rateOfInterest/100)  * tenure) ;
    }
    
    
	   public static void main(String arg[]) {
	    
		   double rateOfInterest = 6.50d;
		   double amountOfDeposit = 10000.00d;
		   
		   
		   for ( int tenure = 1; tenure< 10; tenure++  ) {
			   
			double interestAmount =   calculateInterest(amountOfDeposit, rateOfInterest, tenure);
			
			System.out.println("Principal Amount of " + amountOfDeposit +" at a rate of " + 
			                      rateOfInterest + " per year for " + tenure + " year(s) is " + interestAmount);
		   
		   }
	 }
	    
}
/*

Calculation:
First, converting R percent to r a decimal
r = R/100 = 6.5%/100 = 0.065 per year.

Solving our equation:
A = 10000(1 + (0.065 × 3)) = 11950 
A = $11,950.00

*/