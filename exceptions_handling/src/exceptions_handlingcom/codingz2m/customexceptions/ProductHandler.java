package exceptions_handlingcom.codingz2m.customexceptions;

public class ProductHandler {
	
	 static void processErrorCodes(ProductNotFoundException e)  {
		switch (e.getErrorCode()) {
			case "PRODUCT_NOT_FOUND_EXCEPTION":
				System.out.println("Product is not found, search another product!");
				break;
			default:
				System.out.println("Unknown Exception Occured!" + e.getMessage());
				e.printStackTrace();
		}
	}

	 static void findProduct(String productName) throws ProductNotFoundException {

			Product products [] = new Product[3];
			
			products[0] = new Product("PRP003", "Portable Re-Writeable RuffPad 9 Inches", 190.00d);
			products[1] = new Product("SMW003", "Smartwatch", 90.00d);
			products[2] = new Product("BQC003", "Bullet Pro 36W PD Quick Charger, 3 Port Fast Car Charger Adapter", 24.00d);
			
		
			for (Product product : products) {
				if((product.getProductName().equals(productName))) {
					System.out.println(product.getProductName() + " Available");
					break;
				}
				else {
					throw new ProductNotFoundException(
									product.getProductName() + " Not Found!", 
									"PRODUCT_NOT_FOUND_EXCEPTION");
				}

			}
	}
}