package superkeyword;

public class BurgerOrders 
{
    public static void main( String[] args )
    {
    	Hamburger burger;
    	// Implementing Polymorphism
      burger = new HealthyBurger( "Beacon", 25);
      
      burger.AddLettuce();
       burger.AddCheese();
       burger.AddTomatoes();
       burger.AddCarrots();
       
      ((HealthyBurger)burger).AddGualcamole();  // Ref Type Casting
  
      (( HealthyBurger)burger).AddSalsa();   
  
     
      // Dynamic Method Dispatch (Introduction to Runtime Ploymorphsim)
       System.out.println(" The total healthy " + burger.getBreadRollType() + " with "+ burger.getMeat() + " Price is " + burger.calculatePrice());
       System.out.println("====================================");
        
       
        burger = new DeluxeBurger();        
        burger.AddTomatoes();
        
        // Dynamic Method Dispatch (Introduction to Runtime Ploymorphsim)
        System.out.println("The deluxeHamburger "+ burger.getBreadRollType()+ " with "+ burger.getMeat()+  " Price is " + burger.calculatePrice());


    }

    }

