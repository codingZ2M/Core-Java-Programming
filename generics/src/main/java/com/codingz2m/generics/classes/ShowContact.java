package com.codingz2m.generics.classes;

public class ShowContact {
	 
    public static void main(String[] args) {
 
        // Create KeyValue object.
        // Integer: Phone Number (K = Integer)
        // String: Name of User (V = String)
        Contact<Double, String> entry = new Contact<Double, String>(12000.00, "Tom");
 
        // Java understands that the return type is a Integer
        // (K = Integer)
        Double phone = entry.getKey();
 
        // Java understands that the return type is a String
        // (V = String).
        String name = entry.getValue();
 
        System.out.println("Phone = " + phone + " / name = " + name);
    }
 
}