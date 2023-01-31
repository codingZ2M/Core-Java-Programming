package methods;

public class InstanceMethodsTest {
	
	public static void main (String[] args) {

		InstanceMethods  interestCalculator = new InstanceMethods ();
	
		 interestCalculator.setRateOfInterest(6.0d);
		 interestCalculator.setAmountOfDeposit(15000.00d);
		 
		 interestCalculator.showInterestAmount();
		 
		 /*	 interestCalculator.setRateOfInterest(6.50d);
		 interestCalculator.setAmountOfDeposit(10000.00d);
		 interestCalculator.showInterestAmount();
	*/	 

	
}
	
}