package lesson19.auxiliaryclasses.mathclass;

import java.util.Locale;

public class Example15MathPI {

	/**
	 * Math.PI
	 * 
	 * → Returns the constant PI (π).
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.println("=== Math.PI ===\n");
		System.out.printf("→ 1) The Pi (π) value is: %.4f%n", Math.PI); // 3.1416
		
	}

}
