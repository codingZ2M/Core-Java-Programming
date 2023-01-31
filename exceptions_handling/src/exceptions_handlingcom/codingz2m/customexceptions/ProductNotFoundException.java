package exceptions_handlingcom.codingz2m.customexceptions;

public class ProductNotFoundException extends Exception {

	private String errorCode = "Unknown_Exception";

	public ProductNotFoundException(String message, String errorCode) {
		super(message);
		this.errorCode=errorCode;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
}