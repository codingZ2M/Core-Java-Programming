package composition_encapsulation;

public class PC {
	
	/* Composition: Modeling parts...of the grater whole
	 	Here Composition is modeling parts..of the PC
	 	Here Case, monitor, Motherboard are components of PC.. not actually the whole PC
	 	PC class comprises three other classes & it's going to have three objects...
	*/
	
	/* Encapsulation: Binding data with methods
	  	Hiding the Objects... 'Case' & 'Monitor'
    	Don't allow the calling program to access those objects directly.
    	The only way to access the objects (Case, Monitor) of PC through methods.
    	Make the variables as 'private' 
	 */
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
      
    
    public final void powerUp() {
    	  System.out.println("Power Supply is given"); // Maintaining a log
        this.theCase.pressPowerButton();
        this.drawLogo();
      
    }
    
    // Creating an object within object...

    private final void drawLogo() {
    	 System.out.println("Drawing the Logo"); // Maintaining a log
        this.monitor.drawPixelAt(1200, 50, "yellow");
       
    }

    
    
}
