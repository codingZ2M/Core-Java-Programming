package conditional.statements;

class NestedIf {
	
    public static void main(String arg[]) {
    	
        int age = 19;
        
        char gender = 'F'; // M - Male, F - Female
        
        if( age < 18 ) // outer if
        {
            if( gender == 'M' )    // inner if
            {
                System.out.println("Man");
            }
            else
            {
                System.out.println("Woman");
            }
        }
        
        else 
        {
            if( gender == 'M' )    
            {
                System.out.println("Boy");
            }
            else
            {
                System.out.println("Girl");
            }
        
        }
    
    }
}