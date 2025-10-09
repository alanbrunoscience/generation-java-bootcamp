package lesson19.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example04MathSin {

	/**
	 * Math.sin(x)
	 * 
	 * → Returns the sine of an angle. The 'x' argument must be a double, and the
	 * angle must be in radians.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double angleRad = 0.00;

		System.out.println("=== Math.sin(x) ===\n");
		System.out.printf("→ 1) Math.sin(%.2f) = %.2f.%n", angleRad, Math.sin(angleRad)); // 0.00

	}

}
