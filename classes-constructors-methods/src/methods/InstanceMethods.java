package methods;

public class InstanceMethods {
	 
	 private double rateOfInterest;
	  private double amountOfDeposit;
	 

	public double getRateOfInterest() {
		return rateOfInterest;
	}


	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}


	public double getAmountOfDeposit() {
		return this.amountOfDeposit;
	}


	public void setAmountOfDeposit(double amountOfDeposit) {
		this.amountOfDeposit = amountOfDeposit;
	}


	private double calculateInterest(double amountOfDeposit, double rateOfInterest, int tenure) {
		
		if (amountOfDeposit <=0 || this.rateOfInterest <=0 ) {
			return -1;
		}
	
   	return    amountOfDeposit * (1 + (this.rateOfInterest/100)  * tenure) ;
   }
   
	
   public void  showInterestAmount () {
   	
	   for ( int tenure = 1; tenure< 10; tenure++  ) {
		   
		double interestAmount =   this.calculateInterest(this.amountOfDeposit, this.rateOfInterest, tenure);
		
		   if ( interestAmount== -1) {
			   System.out.println(" Enter Valid Deposit Amount or Interest Rate");
			   break;
		   }
		System.out.println("Principal Amount of " + this.amountOfDeposit +" at a rate of " + 
		                      this.rateOfInterest + " per year for " + tenure + " year(s) is " + interestAmount);
	   
	   }
   }
   
   
   
   }