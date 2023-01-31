package burger;

public class TotalOrder {

	public static void main(String[] args) {
		
		double totalPrice=0.00d;
		
		Drink drink = new Drink(); 
		
		drink.setBurger("Bacon Cheese Burger");
		drink.setSide("Pickled Veggies");
		drink.setDrink("Pineapple Mango Splash Juice");
				
		totalPrice = drink.calculatePrice();
		
        System.out.println("Total Order Value: $"+ totalPrice);
	}

}
