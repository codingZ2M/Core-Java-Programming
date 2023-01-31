package exceptions_handlingcom.codingz2m.builtin.exceptions;

import java.io.FileNotFoundException;

public class FileHandler {

	public static void handleFile( int i) throws FileNotFoundException, IllegalArgumentException {
		if (i <= 0) {
			FileNotFoundException fileNotFoundException = new FileNotFoundException("Provide positive value instead of " + i);
			throw fileNotFoundException;
		} else if (i > 10) {
			throw new IllegalArgumentException("Give values from 0 to 10 instead of " + i);
		}
	}
}
