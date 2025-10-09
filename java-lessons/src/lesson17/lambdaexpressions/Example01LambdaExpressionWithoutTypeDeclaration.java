package lesson17.lambdaexpressions;

/**
 * Functional Interface Definition:
 * 
 * → This interface serves as the "target type" for the lambda expression. It
 * must have exactly ONE ABSTRACT METHOD (sum) to be a Functional Interface.
 * 
 * → This interface is responsible for defining the structure (or signature) of
 * the function. In this specific case, the structure dictates that the function
 * must receive two parameters and return a single output.
 * 
 */

@FunctionalInterface
interface MathOperation {
	// The single abstract method that the lambda expression will implement.
	int sum(int a, int b);
}

public class Example01LambdaExpressionWithoutTypeDeclaration {

	/**
	 * Lambda Expression Characteristics
	 * 
	 * Key characteristic demonstrated here:
	 * 
	 * • Type Inference: The type of parameters 'x' and 'y' in the lambda expression
	 * ((x, y) -> (x + y)) is automatically inferred by the Java compiler from the
	 * target method signature (int sum(int a, int b)).
	 * 
	 */

	public static void main(String[] args) {

		int a = 10, b = 5;

		// 1. Assign the lambda expression to the functional interface variable.
		// The lambda (x, y) -> (x + y) implements the MathOperation.sum(a, b) method.
		MathOperation addition = (x, y) -> (x + y);

		// 2. Execute the lambda's logic by calling the interface's method.
		int result = addition.sum(a, b);

		// 3. Print the result.
		System.out.printf("→ %d + %d = %d.%n", a, b, result);

	}

}