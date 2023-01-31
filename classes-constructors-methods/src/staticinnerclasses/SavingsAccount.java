package staticinnerclasses;

import java.text.NumberFormat;
import java.util.Locale;

/*
  Why do we need inner class?
  Answer: Inner classes are best for the purpose of logically grouping classes that are 
  used in one-place. For example, if you want to create class which is used by ONLY 
  enclosing class, then it doesn't make sense to create a separate file for that.
 */
public class SavingsAccount {   // Outer Class
  
	private static double balance;
  
     public SavingsAccount(double balance) {  
         SavingsAccount.balance = balance;
     }
   
      public void calculateInterest(double interestRate) {
       new InterestCalculator(interestRate).addInterestAmount(Locale.US);
      }
    
     
  /*
   NOTE: A static inner class is a class that is created inside an outer class 
   It cannot access non-static data members and methods. It can be accessed by outer
    class name.
   */
      
      // This inner class is working only with its Outer Class
      // Inner Class Compiled File Name: SavingsAccount$InterestCalculator.class
    private  static class InterestCalculator { // (Inner Class) - Static Class
    	  private double interestRate;
    	  
         private InterestCalculator(double interestRate)
        {
            this.interestRate = interestRate;
        }
   
         private void addInterestAmount(Locale locale) {  
            double interest = balance * interestRate / 100;
            balance += interest;
   
            NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
            System.out.println("Updated Balance with Interest: "  + formatter.format(balance));
         }
   
      }  // Closing the Inner Class
      
  }
