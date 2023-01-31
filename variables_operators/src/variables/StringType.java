package variables;
//import java.lang.String;

public class StringType {
	
	  public static void main(String[] args) {
		  
		  String  firstName ;
		  
		  
		  String lastName = "Z2M";
		  
		  firstName= "Coding";
		  
		  System.out.println("First Name: " + firstName);
		  System.out.println("Last Name: " + lastName);
		  
		  String website ="www.codingz2m.com" + " \u00A9" + " 2018";
		  
		  System.out.println("Website: " + website);
		  System.out.println();
		  
		  String productPrice ="200.00";
		  
		  System.out.println("Product Price: " + "$ " + productPrice);
		  
		  
		  String firstProductPrice = "23.99";
		  double secondProductPrice = 29.99d;
		  
		  System.out.println("Toatl Products Price: " + "$ " + firstProductPrice + "  " + secondProductPrice);
	  }

}
