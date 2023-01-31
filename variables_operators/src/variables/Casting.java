package variables;

public class Casting {

    public static void main(String[] args) {

    	int minIntValue= -2_147_483_648;
        int maxIntValue=  2_147_483_647;
        
    	 int result = (minIntValue/2);
    	 System.out.println(result);
    	 
    	  byte minByteValue= -128;
          byte maxByteValue=  127;
          
        /*  By default when you make an assignment in an expression Java converts
          that to an 'integer' so treat the expression value as byte using 'casting' as mentioned below.         
         */
          byte res = (byte)(-minByteValue/2);
          System.out.println(res);
          
          
          short minShortValue= -32_768;
          short maxShortValue=  32_767;          
          short total = (short) (-minShortValue/2);
          System.out.println(total);
          
            float salary = (float) 12567.00d;
          
          
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        

        
        // Everything inside the bracket is to be converted to a short using 'casting' 
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
      
        
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);

                   int myIntValue = 5 / 2;
                   float myFloatValue = 5f / 2f;
                   double myDoubleValue = 5d / 2d;
                   
                   System.out.println("myIntValue = " + myIntValue);
                   System.out.println("myFloatValue = " + myFloatValue);
                   System.out.println("myDoubleValue = " + myDoubleValue);
         
    }
}

