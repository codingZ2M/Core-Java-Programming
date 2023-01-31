package innerclasses;

public class SavingsAccountInterest {

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount(100000.00d);
		savingsAccount.calculateInterest(6.10);
		
		
	// Accessing Inner Class & Making Object for an Inner Class	
		//SavingsAccount.InterestCalculator interestCalculator = 
				//						savingsAccount.new InterestCalculator(6.20);
		//interestCalculator.addInterestAmount(Locale.US);
	}

}
