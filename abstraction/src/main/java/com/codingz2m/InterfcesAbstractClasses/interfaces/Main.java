package com.codingz2m.InterfcesAbstractClasses.interfaces;

public class Main {

    public static void main(String[] args) {
    	
        ITelephone timsPhone, rickPhone;
        
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        System.out.println("************************************************");
        rickPhone = new MobilePhone(24565);
        rickPhone.powerOn();
        rickPhone.callPhone(24565);
        rickPhone.answer();

    }
}
