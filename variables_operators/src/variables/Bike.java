package variables;

public class Bike {

    public static void main(String[] args) {
    	
    	// Variable Declaration...with String Type
    	 String bikeName ="TRIBAN RC 521 DISC ROAD BIKE, NAVY - 105";
    	 
        String rating = "4.4/5";
        int reviews =    39_00_00_000;  // 4 Bytes -> 32 Bits -> -2147483648 to 2147483647

      float bikePrice = 729.99f;  
      double bottleCagePrice = 3.99;  // by default double 

        double totalBikePrice = bikePrice + bottleCagePrice;

        System.out.println("Total Bike Price: " + "$ " + totalBikePrice + " |  " +
        		"Rating: " + rating + "  | " + "Reviews: " + reviews);
    }
}
