package lesson19.auxiliarycontent.mathclass;

import java.util.Locale;

public class Example08MathToRadians {

	/**
	 * Math.toRadians(x)
	 * 
	 * → Converts an angle in degrees to radians. The 'x' argument must be a double.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double angleDeg = 90.00;

		System.out.println("=== Math.toRadians(x) ===\n");
		System.out.printf("→ 1) Math.toRadians(%.2f) = %.2f.%n", angleDeg, Math.toRadians(angleDeg)); // 1.57

	}

}
