package compile_polymorphism;

public class OrderBurger {

    public static void main(String[] args) {
    	
    	Burger burger1, burger2;
    	
        burger1 = new Burger( );
       
         burger1.addGualcamole();
         burger1 .addSalsa();   
       // Accessing Overloaded Method...
         System.out.println(" Healthy Burger" + " Price is " + burger1.calculatePrice(6.00d, 4.50d));
         System.out.println("====================================");
         System.out.println();
         
         burger2 = new Burger( );
         
         
         burger2.addGualcamole();
         burger2 .addSalsa(); 
         burger2 .addCoke(2);
         burger2 .addChips();         
         // Accessing Overloaded Methods...
        System.out.println("Deluxe Burger " + " Price is " + burger2.calculatePrice(6.00d, 4.50d, 7.00d, 5.50d));
        System.out.println("====================================");
        System.out.println();
        
        
        
        // Accessing Overloaded Methods...
        System.out.println("Deluxe Burger " + " Price is " + burger2.calculatePrice("Not Available"));

    }

}

