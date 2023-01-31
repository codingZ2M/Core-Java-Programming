package runtime_polymorphism;

public class Hamburger {
	
	private String breadRollType;
    private String meat;
    private double tomatoPrice;
    private  double carrotPrice;
    private double lettucePrice;
    private double cheesePrice;
    private double HamburgerBasePrice;
    private int lettuceCount =0;
    private int carrotCount = 0;
    private int tomatoCount = 0;
    private int CheeseCount = 0;

    public Hamburger(String breadRollType, String meat, double HamburgerBasePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.HamburgerBasePrice = HamburgerBasePrice;
        this.tomatoPrice = 2.00d;
        this.carrotPrice  = 2.00d;
        this.lettucePrice = 2.00d;
        this.cheesePrice = 5.00d;
    }

    public String getBreadRollType() {
        return this.breadRollType;
    }

    public String getMeat() {
        return this.meat;
    }

    public double getTomatoPrice() {
        return this.tomatoPrice;
    }

    public double getCarrotPrice() {
        return this.carrotPrice;
    }

    public double getLettucePrice() {
        return this.lettucePrice;
    }

    public double getCheesePrice() {
        return this.cheesePrice;
    }

    public double getHamburgerBasePrice() {
        return this.HamburgerBasePrice;
    }
    
    public void resetCounters(){
    	this.lettuceCount = 0;
    	this.carrotCount = 0;
    	this.tomatoCount = 0;
    	this.CheeseCount = 0;
    }

    public double AddLettuce(){
         
    	this.lettuceCount ++;
        return this.lettuceCount;
    }

    public double AddCarrots(){
        
    	this.carrotCount ++;
        return this.carrotCount;
    }
    public double AddTomatoes(){
    	this.tomatoCount ++;
        return this.tomatoCount;
    }

    public double AddCheese(){
        
    	this.CheeseCount ++;
        return this.CheeseCount;
    }

    public double calculatePrice(){
        double price1;
        double price2;
        double price3;
        double price4;

        double totalPrice;
        if (lettuceCount > 0) {
            
            System.out.println(" Lettuce is Added ");
            price1 = this.getLettucePrice() * lettuceCount;
        }
        else
            price1 = 0;


        if (carrotCount > 0) {
            
            System.out.println(" Carrots is Added ");
            price2 = this.getCarrotPrice() * carrotCount;
        }
        else
            price2 = 0;

        if (tomatoCount > 0) {
            
            System.out.println(" Tomatoes is Added ");
            price3 = this.getTomatoPrice() * tomatoCount;
        }
        else
            price3 = 0;

        if (CheeseCount > 0) {

            System.out.println(" Cheese is Added ");
            price4 = this.getCheesePrice() * CheeseCount;
        }
        else
            price4 = 0;

        totalPrice = this.getHamburgerBasePrice() + price1 + price2 + price3 + price4;
        
        resetCounters();
    return  totalPrice;

    }
}
