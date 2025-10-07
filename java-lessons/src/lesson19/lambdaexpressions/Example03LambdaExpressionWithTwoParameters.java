package lesson19.lambdaexpressions;

import java.util.Locale;

@FunctionalInterface
interface MathOperation3 {
	float subtract(float a, float b);
}

public class Example03LambdaExpressionWithTwoParameters {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		float a = 10.5f, b = 8.9f;
		
		// 1. Assign the lambda expression to the functional interface variable.
		MathOperation3 subtraction = (x, y) -> x - y;
		
		// 2. Execute the lambda's logic by calling the interface's method.
		float result = subtraction.subtract(a, b);
		
		// 3. Print the result.
		System.out.printf("→ %.2f - %.2f = %.2f.%n", a, b, result);

	}

}
