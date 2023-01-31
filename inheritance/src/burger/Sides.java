package burger;


public class Sides extends Burger {  // Sides For Burgers
	
	private String side;
    
	private static double pickledVeggiesPrice;
	private static double melonAndCucumberSaladPrice;
	private static double cornAvocadoAndTomatoSaladPrice;
	private static double rainbowPastaSaladPrice;
	private static double easyBakedSweetPotatoFriesPrice;
	
	
	static {
		pickledVeggiesPrice = 5.00d;
		melonAndCucumberSaladPrice = 4.00d;
		cornAvocadoAndTomatoSaladPrice = 5.50d;
		rainbowPastaSaladPrice = 7.50d;
		easyBakedSweetPotatoFriesPrice = 7.00d;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public static double getPickledVeggiesPrice() {
		return pickledVeggiesPrice;
	}

	public static double getMelonAndCucumberSaladPrice() {
		return melonAndCucumberSaladPrice;
	}

	public static double getCornAvocadoAndTomatoSaladPrice() {
		return cornAvocadoAndTomatoSaladPrice;
	}

	public static double getRainbowPastaSaladPrice() {
		return rainbowPastaSaladPrice;
	}

	public static double getEasyBakedSweetPotatoFriesPrice() {
		return easyBakedSweetPotatoFriesPrice;
	}
	
	
	// Method Overriding with 'super' keyword
	@Override
	public double calculatePrice () {
		double burgerPrice = super.calculatePrice();
		double sidePrice = 0.00d;
		
		 if(this.side != null && this.side.equals("Pickled Veggies")) {
			 sidePrice+= getPickledVeggiesPrice();
		    }
		 if(this.side != null && this.side.equals("Melon And Cucumber Salad")) {
			 sidePrice+= getMelonAndCucumberSaladPrice();
		    }
		 if(this.side != null && this.side.equals("Corn Avocado And Tomato Salad")) {
			 sidePrice+= getCornAvocadoAndTomatoSaladPrice();
		    }
		 if(this.side != null && this.side.equals("Rainbow Pasta Salad")) {
			 sidePrice+= getRainbowPastaSaladPrice();
		    }
		 if(this.side != null && this.side.equals("Easy Baked Sweet Potato Fries")) {
			 sidePrice+= getEasyBakedSweetPotatoFriesPrice();
		    }
		 return sidePrice + burgerPrice;
	  }
	
	
	
}

