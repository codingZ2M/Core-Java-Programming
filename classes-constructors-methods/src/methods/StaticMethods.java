package methods;

public class StaticMethods {
int i;
	public  static final  double RATE_OF_INTEREST = 6.50d;


	/*  Should a method be static or instance method ?
     Answer: Does your method use any fields(instance variables) or instance methods?
     If you reply is 'YES' then use instance methods or 'NO' then use static methods..
	 */
	public void calculateInterest() {
		System.out.print(RATE_OF_INTEREST);

	}
	/*
	   static methods are declared using a 'static' modifier
	   static methods can't access instance methods & instance variables directly.
	   static methods are used for operations that don't require any data from an instance of the class.
	   In static methods, we can't use 'this' keyword
	   whenever you use a method that doesn't use instance variables that method should be declared as a static method.
	 */
	public static double  calculateInterest(double amountOfDeposit, double rateOfInterest, double tenure) {

		return   amountOfDeposit * (1 + (rateOfInterest/100)  * tenure) ;
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