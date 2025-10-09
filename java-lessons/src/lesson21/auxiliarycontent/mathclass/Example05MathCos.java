package lesson21.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example05MathCos {

	/**
	 * Math.tan(x)
	 * 
	 * → Returns the tangent of an angle. The 'x' argument must be a double and the
	 * angle must be in radians.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double angleRad = 0.00;

		System.out.println("=== Math.tan(x) ===\n");
		System.out.printf("→ 1) Math.tan(%.2f) = %.2f.%n", angleRad, Math.tan(angleRad)); // 0.00

	}

}
