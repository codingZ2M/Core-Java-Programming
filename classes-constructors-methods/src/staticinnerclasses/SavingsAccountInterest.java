package staticinnerclasses;

import java.util.Locale;

public class SavingsAccountInterest {

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount(60000.00d);
		savingsAccount.calculateInterest(6.10);
		
		
	// Accessing Static Inner Class & Making Object for an Static Inner Class	
	//	SavingsAccount.InterestCalculator interestCalculator = 
		//								new SavingsAccount.InterestCalculator(6.20);
	//	interestCalculator.addInterestAmount(Locale.US);
	}

}
