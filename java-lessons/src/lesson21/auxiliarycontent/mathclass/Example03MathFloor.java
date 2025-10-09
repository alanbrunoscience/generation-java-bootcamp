package lesson21.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example03MathFloor {

	/**
	 * Math.floor(x)
	 * 
	 * → Rounds 'x' to the LARGEST INTEGER NOT GREATER THAN 'x'. The argument 'x'
	 * must be a double.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double n1 = -9.8, n2 = 9.2;

		System.out.println("=== Math.floor(x) ===\n");
		System.out.printf("→ 1) Math.floor(%.2f) = %.2f;%n", n1, Math.floor(n1)); // -10.00
		System.out.printf("→ 2) Math.floor(%.2f) = %.2f.%n", n2, Math.floor(n2)); // 9.00

	}

}
