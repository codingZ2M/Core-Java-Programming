package variables;

public class WholeNumbersRange {
	
	  public static void main(String[] args) {
	
		  //PRIMITIVE DATA TYPES...
		  // A Byte has a width of 8 Bits
		  // Example: int (32 bit) needs four times the amount of space, than a byte does..& thus has a width of 32
	/*
	 byte(8-bit): It has a minimum value of -128 and a maximum value of 127 (inclusive).	  
	 */
		  byte minByteValue= Byte.MIN_VALUE;
          byte maxByteValue = Byte.MAX_VALUE;
          
        System.out.println("Minimum & Maximum Values of bye Data Type Variable:");
        System.out.println("Minimum Value of Byte Variable Is: " + minByteValue);
        System.out.println("Maximum Value  Byte Variable Is : " + maxByteValue);
        System.out.println("*****************************************************");
	  
        /*
        short(16-bit ): It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
         */
		  short minShortValue= Short.MIN_VALUE;
          short maxShortValue=  Short.MAX_VALUE;
          
      System.out.println("Minimum & Maximum Values of short Data Type Variable:");
      System.out.println("Minimum Value: " + minShortValue);
      System.out.println("Maximum Value: " + maxShortValue);
      System.out.println("*****************************************************");
        
        /*
	     int(32-bit): int data type is a 32-bit signed two's complement integer,
	     which has a minimum value of -2 power of 31 and a maximum value of 2 power of 31-1
	     −2,147,483,648 to 2,147,483,647
	    */
		  
              int minIntValue= Integer.MIN_VALUE;
              int maxIntValue=  Integer.MAX_VALUE;
              
	        System.out.println("Minimum & Maximum Values of int Data Type Variable:");
	        System.out.println("Minimum Value: " + minIntValue);
	        System.out.println("Maximum Value: " + maxIntValue);
	        System.out.println("*****************************************************");
	        
	                   //int maxlongValue = 2147483648L;
	        /*
	        long(64-bit): The signed long has a minimum value of -2 power of 63 and 
	        a maximum value of 2 power of 63-1
	        */
	         long minLongValue= Long.MIN_VALUE;
              long maxLongValue=  92_23_37_20_36_85_47_75_807L;
              
	        System.out.println("Minimum & Maximum Values of long Data Type Variable:");
	        System.out.println("Minimum Value: " + minLongValue);
	        System.out.println("Maximum Value: " + maxLongValue);
	        
	        System.out.println("*****************************************************");        
	        
	  }
}
