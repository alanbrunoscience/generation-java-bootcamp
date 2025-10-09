package lesson19.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example14MathRound {

	/**
	 * Math.round(x)
	 * 
	 * → Rounds a 'float' or 'double' number.
	 * 
	 * • Returns 'int' if the argument is 'float'; 
	 * • Returns 'long' if the argument is 'double'.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double n1 = 9.4, n2 = -9.0;

		System.out.println("=== Math.round(x) ===\n");
		System.out.printf("→ 1) Math.round(%.2f) = %d;%n", n1, Math.round(n1)); // 9
		System.out.printf("→ 2) Math.round(%.2f) = %d.%n", n2, Math.round(n2)); // -9

	}

}
