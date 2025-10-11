package lesson19.auxiliaryclasses.mathclass;

import java.util.Locale;

public class Example07MathToDegrees {

	/**
	 * Math.toDegrees(x)
	 * 
	 * → Converts an angle in radians to degrees. The 'x' argument must be double.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double angleRad = 1.5708;

		System.out.println("=== Math.toDegrees(x) ===\n");
		System.out.printf("→ 1) Math.toDegrees(%.2f) = %.2f.%n", angleRad, Math.toDegrees(angleRad)); // 90.00

	}

}
