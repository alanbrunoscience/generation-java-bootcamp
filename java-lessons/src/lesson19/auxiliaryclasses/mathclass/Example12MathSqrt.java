package lesson19.auxiliaryclasses.mathclass;

import java.util.Locale;

public class Example12MathSqrt {

	/**
	 * Math.sqrt(x)
	 * 
	 * → Calculates the square root of 'x'. The argument 'x' must be double.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double n1 = 900.0, n2 = 9.0;

		System.out.println("=== Math.sqrt(x) ===\n");
		System.out.printf("→ 1) Math.sqrt(%.2f) = %.2f;%n", n1, Math.sqrt(n1)); // 30.00
		System.out.printf("→ 2) Math.sqrt(%.2f) = %.2f.%n", n2, Math.sqrt(n2)); // 3.00

	}

}
