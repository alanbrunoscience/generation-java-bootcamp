package lesson19.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example10MathMax {

	/**
	 * Math.max(x,y)
	 * 
	 * → Returns the largest value between 'x' and 'y'. The arguments 'x' and 'y'
	 * can be 'float', 'int', 'long', or 'double'.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double n1 = 2.3, n2 = 12.7, n3 = -2.3, n4 = -12.7;

		System.out.println("=== Math.max(x,y) ===\n");
		System.out.printf("→ 1) Math.max(%.2f, %.2f) = %.2f;%n", n1, n2, Math.max(n1, n2)); // 12.70
		System.out.printf("→ 2) Math.max(%.2f, %.2f) = %.2f.%n", n3, n4, Math.max(n3, n4)); // -2.30

	}

}
