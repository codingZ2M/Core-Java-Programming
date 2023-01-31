package composition_encapsulation;

public class Main {

    public static void main(String[] args) {
    	
        Dimensions dimensions = new Dimensions(20, 20, 5);
        
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        
// Master object PC is managing & looking after and this is using Composition to achieve that..
        
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
      
    // theCase.pressPowerButton();
      
   //thePC.theCase.pressPowerButton();
     
        thePC.powerUp();
       //thePC.theCase.pressPowerButton();
        

    }
}

//Rule:
// Look at using Composition before inheritance 