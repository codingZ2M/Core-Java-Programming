package runtime_polymorphism;

public class DeluxeBurger extends Hamburger {

    private double cokePrice;
    private double chipsPrice;

    public DeluxeBurger() {
    	// Using 'super()' to call super class constructor
        super("Whole Wheat", "Sausage & Beacon", 12.00d);  
        
        this.cokePrice = 10.00d;
        this.chipsPrice = 10.00d;
    }

    public double getCokePrice() {
        return cokePrice;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    @Override
    public double calculatePrice() {
        double baseHamburgerPrice = super.getHamburgerBasePrice();
        double DeluxeBurgerPrice = baseHamburgerPrice + getChipsPrice() + getCokePrice();
        return DeluxeBurgerPrice;
    }

    @Override
    public double AddTomatoes() {
        System.out.println("Tomatoes cannot be added to a Deluxe Burger!");
        return 0.0;
    }

    @Override
    public double AddLettuce() {
        System.out.println(" Lettuce cannot be added to a Deluxe Burger!");
        return 0.0;

    }

    @Override
    public double AddCarrots() {
        System.out.println("Carrots cannot be added to a Deluxe Burger!");
        return 0.0;
    }

    @Override
    public double AddCheese() {
        System.out.println("Cheese cannot be added to a Deluxe Burger!");
        return 0.0;
    }

}
