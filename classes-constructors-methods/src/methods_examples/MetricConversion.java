package methods_examples;

public class MetricConversion {
	
	int i = 100;
	
	public static double poundsToKilograms ( double pounds) {
		
	    if( (pounds <0) ) {
            System.out.println("Invalid Data for Pounds");
            return -1;
        }
	    
	    double kg = pounds * 0.453;     
        return kg;
	}
	
	public static double kilogramsToPounds ( double kilograms) {
		
	    if( (kilograms <=0) ) {
            System.out.println("Invalid Data for Kilograms");
            return -1;
        }
	    
	    double pounds = kilograms *  2.204;   
        return pounds;
	}
	

		public static void poundsToKilogramsToOunces ( double pounds, double kilograms ) {
			
		    if( (pounds <=0) || (kilograms <=0 )) {
	            System.out.println("Invalid Data for Pounds or Kilograms");
	            
	        }
		    
		    	double kgs= poundsToKilograms (pounds);
		    	
		    	double grams = kilograms *  1000.00d;
       		   double ounces = grams * 0.035274;
	       
       		   System.out.println(pounds + " Pounds are :" + kgs + " Kilograms" + " & " + kilograms + " Kilograms are :" + ounces + " Ounces");
      	    
		}

}
