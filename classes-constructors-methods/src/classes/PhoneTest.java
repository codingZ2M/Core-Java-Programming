package classes;

public class PhoneTest {

	public static void main(String[] args) {
		
		Phone samsung = new Phone ();  // Represents real word object / instance
				
		samsung.setBrandCode("SMG098");
		samsung.setBrandName("SAMSUNG Galaxy 657");
		
		// Accessing the state variables / fields...    	 
  	  System.out.println("Brand Name: " + samsung.getBrandName() + "  |  " + "Brand Code: "
		                             + samsung.getBrandCode()
  			             );
  	  
  	System.out.println("************************************************");
  	  
  	Phone iphone = new Phone ();
	
	iphone.setBrandCode("IU098");
	iphone.setBrandName("IPHONE 6S");
	
	// Accessing the state variables / fields...    	 
	  System.out.println("Brand Name: " + iphone.getBrandName() + "  |  " + "Brand Code: "
	                             + iphone.getBrandCode()
			             );

	}

}
