package com.codingz2m.wrapperclasses.finalkeyword;

public class Main {

    public static void main(String[] args) {
    	

        int pw = 5;
        Password password = new Password(pw);
        
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(5);
    }
}
