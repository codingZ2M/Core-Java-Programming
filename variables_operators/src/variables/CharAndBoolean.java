package variables;

public class CharAndBoolean {
	
	  public static void main(String[] args) {
			
		  //PRIMITIVE DATA TYPES...
/*
 char: The char data type is a single 16-bit Unicode character.
  It has a minimum value of '\u0000' (or 0) and a maximum value 
  of '\uffff' (or 65,535 inclusive).
 */
// char can represent one of 65535 different types of characters. check it out: unicode-table.com		  
		  
	        // width of 16 - 16 bit (2 bytes)
		    char c1 = '\u0050';
		    char c2 = '\u0055';
		    char c3 = '\u0052';
		    char c4 = '\u0050';
		    char c5 = '\u004C';
		    char c6 = '\u0045';
		  
		   char grade ='A';
		   
	        System.out.println("Unicode output : " + c1+c2+c3+c4+c5+c6);
	        
	        
//boolean: The boolean data type has only two possible values: true and false. 
	        boolean flag = false;
	        boolean isPromoCode = true;

	        
	        char atSymbol = '\u0040';
	        System.out.println("At Symbol = " + atSymbol);
		  
	  }

}

