package burger;

// Multi Level Inheritance
public class Burger {
	
	private String burger;
	private static double baconCheeseburgerPrice;
	private static double cheeseburgerPrice;
	private static double veggieburgerPrice;
	private static double turkeyburgerPrice;
	
	static {
		baconCheeseburgerPrice = 8.00d;
		cheeseburgerPrice = 7.00d;
		veggieburgerPrice = 6.00d;
		turkeyburgerPrice = 5.50d;
	}

	  public void setBurger(String burger) {
		this.burger = burger;
	}

	

	public static double getBaconCheeseburgerPrice() {
		return baconCheeseburgerPrice;
	}

	public static double getCheeseburgerPrice() {
		return cheeseburgerPrice;
	}

	public static double getVeggieburgerPrice() {
		return veggieburgerPrice;
	}

	public static double getTurkeyburgerPrice() {
		return turkeyburgerPrice;
	}

	public double calculatePrice () {
		double burgerPrice = 0.00d;
		
		 if(this.burger != null && this.burger.equals("Bacon Cheese Burger")) {
			 burgerPrice+= getBaconCheeseburgerPrice();
		    }
		 if(this.burger != null && this.burger.equals("Cheese Burger")) {
			 burgerPrice+= getCheeseburgerPrice();
		    }
		 if(this.burger != null && this.burger.equals("Veggie Burger")) {
			 burgerPrice+= getVeggieburgerPrice();
		    }
		 if(this.burger != null && this.burger.equals("Turkey Burger")) {
			 burgerPrice+= getTurkeyburgerPrice();
		    }
		 return burgerPrice;
	  }
	
	
	}


