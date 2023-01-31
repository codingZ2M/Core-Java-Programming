package burger;

public class Drink extends Sides {

private String drink;
    
	private static double MangoPeachFlavoredJuicePrice;
	private static double PineappleMangoSplashJuicePrice;
	private static double splashWatermelonCherryJuicePrice;
	
	static {
		MangoPeachFlavoredJuicePrice = 6.00d;
		PineappleMangoSplashJuicePrice = 4.00d;
		splashWatermelonCherryJuicePrice = 5.50d;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public static double getMangoPeachFlavoredJuicePrice() {
		return MangoPeachFlavoredJuicePrice;
	}

	public static double getPineappleMangoSplashJuicePrice() {
		return PineappleMangoSplashJuicePrice;
	}

	public static double getSplashWatermelonCherryJuicePrice() {
		return splashWatermelonCherryJuicePrice;
	}


	// Method Overriding with 'super' keyword
	@Override
	public double calculatePrice () {
		double sidePrice = super.calculatePrice();
		double drinkPrice = 0.00d;
		
		 if(this.drink != null && this.drink.equals("Mango Peach Flavored Juice")) {
			 sidePrice+= getMangoPeachFlavoredJuicePrice() ;
		    }
		 if(this.drink != null && this.drink.equals("Pineapple Mango Splash Juice")) {
			 sidePrice+= getPineappleMangoSplashJuicePrice();
		    }
		 if(this.drink != null && this.drink.equals("Splash Watermelon Cherry Juice")) {
			 sidePrice+= getSplashWatermelonCherryJuicePrice();
		    }
		
		 return drinkPrice + sidePrice;
	  }
	
}
