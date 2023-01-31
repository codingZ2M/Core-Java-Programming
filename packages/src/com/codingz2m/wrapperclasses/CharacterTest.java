package com.codingz2m.wrapperclasses;

public class CharacterTest {

	    public static void main(String arg[])    {
	        
	    	System.out.println("Checks for letter : " + Character.isLetter('M'));
	        
	    	System.out.println("Checks for digit : " + Character.isDigit('5'));
	        
	    	System.out.println("Checks for white space : " + Character.isWhitespace(' '));
	        
	    	System.out.println("Checks for uppercase : " + Character.isUpperCase('C'));
	        
	    	System.out.println("Checks for lowercase : " + Character.isLowerCase('c'));
	        
	    	System.out.println("Converts to uppercase : " + Character.toUpperCase('m'));
	        
	    	System.out.println("Converts to lowercase : " + Character.toLowerCase('Z'));
	        
	    	System.out.println("Converts to string : " + Character.toString('w'));    
	    }
	}

