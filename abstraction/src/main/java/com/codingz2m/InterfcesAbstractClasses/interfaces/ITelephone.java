package com.codingz2m.InterfcesAbstractClasses.interfaces;

public interface ITelephone {
	
	//String name;
	
    void powerOn();
    
    void dial(int phoneNumber);
    
    void answer();
    
    boolean callPhone(int phoneNumber);
    
    public abstract boolean isRinging();
    
}
