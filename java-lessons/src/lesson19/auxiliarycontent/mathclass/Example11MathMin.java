package lesson19.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example11MathMin {

	/**
	 * Math.min(x,y)
	 * 
	 * → Returns the smallest value between 'x' and 'y'. The arguments 'x' and 'y'
	 * can be 'float', 'int', 'long', or 'double'.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double n1 = 2.3, n2 = 12.7, n3 = -2.3, n4 = -12.7;

		System.out.println("=== Math.min(x,y) ===\n");
		System.out.printf("→ 1) Math.min(%.2f, %.2f) = %.2f;%n", n1, n2, Math.min(n1, n2)); // 2.30
		System.out.printf("→ 2) Math.min(%.2f, %.2f) = %.2f.%n", n3, n4, Math.min(n3, n4)); // -12.70

	}

}
