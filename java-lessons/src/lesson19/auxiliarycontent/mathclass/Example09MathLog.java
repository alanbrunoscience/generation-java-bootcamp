package lesson19.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example09MathLog {

	/**
	 * Math.log(x)
	 * 
	 * → Returns the natural logarithm of 'x' (base e). The 'x' argument must be
	 * double.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double num1 = 2.718282, num2 = 7.389056;

		System.out.println("=== Math.log(x) ===\n");
		System.out.printf("→ 1) Math.log(%.2f) = %.2f;%n", num1, Math.log(num1)); // 1.00
		System.out.printf("→ 2) Math.log(%.2f) = %.2f.%n", num2, Math.log(num2)); // 2.00

	}

}
