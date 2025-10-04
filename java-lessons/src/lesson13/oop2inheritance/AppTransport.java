package lesson13.oop2inheritance;

import java.util.Locale;

public class AppTransport {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Car c1 = new Car(1, 4, 0.0f, "Green", 4, "EBN-0301", 0);
		
		c1.display();

	}

}
