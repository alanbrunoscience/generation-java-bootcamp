package lesson17.lambdaexpressions;

@FunctionalInterface
interface Operation {
	int apply(int number);
}

public class Example05LambdaExpWithVariousInstructions {

	/**
	 * Lambda Expressions With Various Instructions
	 * 
	 * Braces {}:
	 * 
	 * → Braces around the function body are also optional if there is only one
	 * statement. For multiple statements, braces around the function body are
	 * required.
	 * 
	 * n -> { instruction 01 instruction 02 instruction 03 };
	 * 
	 */

	public static void main(String[] args) {

		int input = 10;

		Operation doubleAndAdd = n -> {

			// Instruction 1: Doubles the value of the variable 'input'
			int doubled = n * 2;

			// Instruction 2: Prints some statement before returning the final value
			System.out.printf(
					"→ [Inside The Lambda Function] Doubling the initial value ('%d') and adding five to it...%n", n);

			// Instruction 3: Returns the final value (MANDATORY when using curly braces AND
			// there is a return)
			return doubled + 5;

			/**
			 * Return statement:
			 * 
			 * The 'return' keyword is optional in Lambda Expressions.
			 * 
			 * → 1. IMPLICIT RETURN: If the body contains a single expression, the Java
			 * compiler automatically returns the value. In this case, curly braces are NOT
			 * used. (Example: x -> x * x);
			 * 
			 * → 2. EXPLICIT RETURN: If the function body requires multiple statements
			 * (e.g., logic, print, then return), you MUST enclose the body in curly braces
			 * {} AND explicitly use the 'return' keyword (if the function is not void).
			 * 
			 * (Example: x -> { System.out.println(x); return x + 1; })
			 * 
			 */

		};

		int result = doubleAndAdd.apply(input);

		System.out.println("\n--- Result ---\n");
		System.out.printf("→ Initial value: %d;%n", input);
		System.out.printf("→ Final value (doubled + 5): %d.%n", result);

	}

}
