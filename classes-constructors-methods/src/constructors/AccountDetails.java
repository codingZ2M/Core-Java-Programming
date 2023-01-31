package constructors;

public class AccountDetails {

    public static void main(String[] args) {

 //   BankAccount account1 = new BankAccount();
     
   BankAccount account2 = new BankAccount("5566788", "Savings", 10000.00, "Rick", "rick@gm.com", "(404) 355 4386");
   
 // BankAccount account3 = new BankAccount("11220505", "Rick", "rick@gm.com", "404355076" );
    	
        System.out.println("Account  Holder Number: " + account2.getAccountNumber());
        System.out.println("Account Type: " + account2.getAccountType());
        System.out.println("Account Balance: " + account2.getAccountBalance());
        System.out.println("Account Holder Name: " + account2.getAccountHolderName());
        System.out.println("Account Holder Email: " + account2.getAccountHolderEmail());
        System.out.println("Account Holder Contact Number: " + account2.getAccountHolderrPhoneNumber());
        
        System.out.println("------------------------------------------------------------------------");
        account2.withdrawal(200.0);

        account2.deposit(250.0);
        account2.withdrawal(100.0);

        account2.deposit(150.0);
        account2.withdrawal(200.0);
        
        //Account rickAccount = new Account();
        
   
    }
}
