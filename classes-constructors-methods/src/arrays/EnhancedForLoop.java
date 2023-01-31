package arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		Product	product1 = new Product("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d);
		Product product2 = new Product("SMW003", "Smartwatch with 1.69\" HD Display, Sleek Metal Body, HR & SpO2 Level Monitor", 90.00d);
		Product product3 = new Product("BQC003", "Bullet Pro 36W PD Quick Charger, 3 Port Fast Car Charger Adapter", 24.00d);
		Product	product4 = new Product("BWR003", "Anti Skid Double Wheel Total Body AB Roller", 20.00d);
		Product product5 = new Product("CCM003", "Rapid Car Charger Multi Ports Type C Port & USB A Ports for Car Compatible", 23.00d);
		Product product6 = new Product("GKM003", "Zeb-Transformer Gaming Keyboard and Mouse", 34.00d);
		Product	product7 = new Product("BHW003", "Over Ear Bluetooth Headphones with Upto 20 Hours Playback", 70.00d);
		Product product8= new Product("PPG003", "Full Rim Horizontal Lazy High Definition Prism Periscope Glasses ", 30.00d);
		Product product9 = new Product("CLH003", " Cycle Light and Horn - Siren Hooter Cycling LED Front Light", 33.00d);
		
		Product products [] [] = {
				{product1, product2, product3},
				{product4, product5, product6, product7}, // Jagged Array
				{ product8, product9}
          };
		
	
		//Accessing Values from Two Dimentional Jagged Array using Enhanced For Loop
				for (Product i []: products) {
					   
					for (Product j: i) {  // Fetching the length of particular row.
					System.out.println(j);
					}
					System.out.println();
				 }
		
	}
}
