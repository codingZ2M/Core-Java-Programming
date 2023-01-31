package variables;

public class FloatingPointNumbers {
	
	 public static void main(String[] args) {
		 
		 //PRIMITIVE DATA TYPES...Floating Point Numbers have Fractional Parts...
		 //float has a width of 32  & double has a width of 64
		 /* For General calculations, float & double are fine. But for precise calculations,
		     such as currency calculations, we need BigDecimal
		 */
		 
		// float floatValue = (float) 5.4;
		 float floatValue =  5.40f;
		// double doubleValue = 5.4;
		 double doubleValue = 5.4;


		 float minFloatValue= Float.MIN_VALUE;
         float maxFloatValue = Float.MAX_VALUE;
         
       System.out.println("Minimum & Maximum Values of float Data Type Variable:");
       System.out.println("Minimum Value of Float Variable Is: " + minFloatValue);
       System.out.println("Maximum Value of Float Variable Is : " + maxFloatValue);
       System.out.println("*****************************************************");
		 
       double minDoubleValue= Double.MIN_VALUE;
       double maxDoubleValue = Double.MAX_VALUE;
       
     System.out.println("Minimum & Maximum Values of doiuble Data Type Variable:");
     System.out.println("Minimum Value of Double Variable Is: " + minDoubleValue);
     System.out.println("Maximum Value of Double Variable Is : " + maxDoubleValue);
     System.out.println("*****************************************************");
		 
		 
		 /*
		 float(32-bit): 
		      Range of values that can be stored: 3.4e−038 to 3.4e+038	  
		 */
			 
		  double numOfPounds = 325.55d;
		  	  
	        double kilograms = numOfPounds * 0.45359237d;
	        
	        System.out.println(numOfPounds + " is equal to  " + kilograms + " Kilograms" );
	        
	        
	        
	        float pounds =325.55f;
	        float kgs =  pounds * 0.45359237f;
	        System.out.println("Kilograms = " + kgs);

	        
	        
	        //CASTING....
	       float result = (float) (numOfPounds * 0.45359237d);
	       System.out.println("Result after converting double into float" + result );

	      int res = (int) (numOfPounds * 0.45359237d);
	      
	      result = res;
	      System.out.println(result);
	 }

}




       