package statickeyword;

public class ProductDemo {


	public static void main(String[] args) {
		
		Product product  = new Product("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d);
		
		String category  = Product.getCategory();

		System.out.println( product);
		
		// Accessing static variable using class name without using object reference variable.
		System.out.println(category );
		
		
	}

}
