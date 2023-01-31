package operators;

public class OperatorPrecedence {

	public static void main(String[] args) {
	
		double fahrenheit = 98.4;
	    
		// converts the temperature in Fahrenheit to Celsius. The formula used is C = 5.0 * (F - 32.0) / 9.0 .     
        double celsius  = ( 5.0 * (fahrenheit - 32.0) ) / 9.0;
        
        System.out.println(fahrenheit + " F is same as " + celsius + " C.");
    
       
        //converts the temperature in Celsius to Fahrenheit. The formula will be F = (( 9.0 * C ) / 5.0) + 32.0
        
        
        double C = 36.9;
		// converts the temperature in Fahrenheit to Celsius. The formula used is C = 5.0 * (F - 32.0) / 9.0 .     
        		double F  = ( ( 9.0 * C ) / 5.0 ) + 32.0;
        
        System.out.println(C + " C is same as " + F + " F.");
    
	}

}
