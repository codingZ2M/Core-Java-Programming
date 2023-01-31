package com.codingz2m.InterfcesAbstractClasses.interfaces;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");

    }

    
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now Dialing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }

    }

    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }

        return isRinging;
    }

    public boolean isRinging() {
        return isRinging;
    }
}