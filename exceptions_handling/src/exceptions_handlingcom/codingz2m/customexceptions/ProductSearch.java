package exceptions_handlingcom.codingz2m.customexceptions;

public class ProductSearch {

	public static void main(String[] args) {

		
		try {
			ProductHandler.findProduct("Portable Re-Writeable RuffPad 9 Inches");
		}
		catch(ProductNotFoundException pnfe) {
    		ProductHandler.processErrorCodes(pnfe);
			
		}
		
	}

}
