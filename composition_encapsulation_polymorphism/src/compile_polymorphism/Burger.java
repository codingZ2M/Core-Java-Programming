package compile_polymorphism;

// Advantages of Method Overloading- Compile Time Polymorphism (OOP)
public class Burger { 
	
    private  int GuacCount = 0;
		private  int salsaCount = 0;
		private  int cokeCount=0;
		private  int chipsCount=0;
	    private  double guacamolePrice;
	    private  double salsaPrice;
	    
	    private double cokePrice;
	    private double chipsPrice;
	    
	   private double burgerBasePrice = 3.00d;
	    private double totalBurgerPrice;
    
	    
	    public double getGuacamolePrice() {
	        return this.guacamolePrice;
	    }

	    public double getSalsaPrice() {
	        return this.salsaPrice;
	    }
	    
	    public double getCokePrice() {
	        return this.cokePrice;
	    }

	    public double getChipsPrice() {
	        return this.chipsPrice;
	    }
	    
	    public void resetCounters(){
        this.GuacCount = 0;
        this.salsaCount = 0;
        this.cokeCount=0;
        this.chipsCount =0;
	    }

	    public double addGualcamole(){
	       
	        this.GuacCount ++;
	        return GuacCount;
	    }
	    
	    public double addSalsa(){
	        
	        this.salsaCount ++;
	        return salsaCount;
	    }
	    
	    public int addCoke(int cokeCount){
	    	
		       this.cokeCount=cokeCount;
	       //cokeCount ;
	        return this.cokeCount;
	    }
	    
	    public int addChips(){
		       
		       this.chipsCount ++;
		        return this.chipsCount;
		    }
	  
	// ************* OVER LOADED METHODS WITH SAME NAME BUT WITH DIFFERENT IMPLEMENTATIONS.... ********************
	    // Remember one method name... instead of multiple remembering method names.. 
	    // Improves code readability & re-usability
	    // Achieves consistency in method naming (Ex: println() )
	    // Gives flexibility to call a similar method with different types of data. 
        // Calls to an overload method will run a specific implementation of that method.
		public double calculatePrice(double salsaPrice, double guacPrice) {
		
			this.guacamolePrice = guacPrice;
			this.salsaPrice = salsaPrice;
	        
	        if (this.GuacCount > 0) {

	            System.out.println(" Guacamole is Added ");
	            this.guacamolePrice = this.getGuacamolePrice() * this.GuacCount ;
	        }
	        else
	        	this.guacamolePrice = 0;

	         if (salsaCount > 0) {

	            System.out.println(" Salsa is Added ");
	             this.salsaPrice  = this.getSalsaPrice() * this.salsaCount;
	        }
	        else
	             this.salsaPrice = 0;

	        this.totalBurgerPrice =  this.burgerBasePrice + this.guacamolePrice + this.salsaPrice;
	       
	         this.resetCounters();
	         return this.totalBurgerPrice;
	    }

		
	    public double calculatePrice(double guacPrice, double salsaPrice, double cokePrice,  double chipsPrice) {
	    	
	    	this.guacamolePrice = guacPrice;
			this.salsaPrice = salsaPrice;
			this.cokePrice = cokePrice;
			this.chipsPrice = chipsPrice;
	    	 
			 if (this.GuacCount > 0) {

		            System.out.println(" Guacamole is Added ");
		            this.guacamolePrice  = this.getGuacamolePrice() * this.GuacCount ;
		        }
		        else
		        	this.guacamolePrice  = 0;

		         if (this.salsaCount > 0) {

		            System.out.println(" Salsa is Added ");
		             this.salsaPrice  = this.getSalsaPrice() * this.salsaCount;
		        }
		        else
		             this.salsaPrice = 0;
		         
		    	 if (this.cokeCount > 0) {

			            System.out.println(" Goke is Added ");
			            this.cokePrice = this.getCokePrice() * this.cokeCount ;
			        }
			        else
			            this.cokePrice = 0;
		    	 
		    	 if (chipsCount > 0) {

			            System.out.println(" Chips is Added ");
			            this.chipsPrice = this.getChipsPrice() * this.chipsCount ;
			        }
			        else
			            this.chipsPrice = 0;

		        this.totalBurgerPrice =  this.burgerBasePrice + this.guacamolePrice + this.salsaPrice + this.chipsPrice + this.cokePrice;
		       
		         this.resetCounters();
		         return this.totalBurgerPrice;
		    
	    }
	    
	    public String calculatePrice (String price) {
			
	   	 return price;
	   	}
	    
	
}
