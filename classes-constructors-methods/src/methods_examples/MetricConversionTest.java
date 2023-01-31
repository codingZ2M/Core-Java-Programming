package methods_examples;

public class MetricConversionTest {

	public static void main(String[] args) {

		double kgs=100;
		double pounds=100;
		
		double kg =  MetricConversion.poundsToKilograms (pounds);
		 System.out.println(pounds  + "  Pounds are "+ kg +" kilograms");
		 
		 double pds = MetricConversion.kilogramsToPounds (kgs);
		 System.out.println( kgs + "  Kilograms are "+ pds +" Pounds");

		 MetricConversion.poundsToKilogramsToOunces(pounds, kgs);

	}

}
