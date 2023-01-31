package com.codingz2m.wrapperclasses.finalkeyword;


public final class Password {
	/*
	 non-static final members can be initialized in the constructor. 
	 They cannot be re-assigned after that.
	 */
    private static final int key = 748576362;
    
    private final int encryptedPassword;

    public Password(int password) {
    	
        this.encryptedPassword = this.encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
