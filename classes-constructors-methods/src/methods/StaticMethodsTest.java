package methods;


import java.util.Scanner;

public class StaticMethodsTest {

	public static void main(String arg[]) {

		// StaticMembers.RATE_OF_INTEREST = 15.0;

		System.out.println("Enter amount for alculating interest amounts:");

		//  StaticMembers.RATE_OF_INTEREST  = 100;

		Scanner scanner = new Scanner(System.in);

		double amountOfDeposit = scanner.nextDouble();

		for ( int tenure = 1; tenure< 10; tenure ++  ) {

			double interestAmount =   StaticMethods.calculateInterest(amountOfDeposit, StaticMethods.RATE_OF_INTEREST, tenure);

			System.out.println("Principal Amount of " + amountOfDeposit +" at a rate of " + 
					StaticMethods.RATE_OF_INTEREST + " per year for " + tenure + " year(s) is " + interestAmount);

		}
	}


}
