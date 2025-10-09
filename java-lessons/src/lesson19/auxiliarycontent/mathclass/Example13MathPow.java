package lesson19.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example13MathPow {

	/**
	 * Math.pow(x,y)
	 * 
	 * → Returns 'x' raised to the power 'y'. The arguments 'x' and 'y' must be
	 * double.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double n1 = 2.0, n2 = 7.0, n3 = 9.0, n4 = 0.5;

		System.out.println("=== Math.pow(x,y) ===\n");
		System.out.printf("→ 1) Math.pow(%.2f, %.2f) = %.2f;%n", n1, n2, Math.pow(n1, n2)); // 128.00
		System.out.printf("→ 2) Math.pow(%.2f, %.2f) = %.2f.%n", n3, n4, Math.pow(n3, n4)); // 3.00

	}

}
