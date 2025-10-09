package lesson17.lambdaexpressions;

@FunctionalInterface
interface MathOperation2 {
	int squared(int a);
}

public class Example02LambdaExpressionWithOneParameter {

	/**
	 * Lambda Expression With One Parameter
	 * 
	 * • Parentheses around the parameter:
	 * 
	 * → Parentheses around the parameter are optional. You can add parentheses if
	 * you like, otherwise leave them as is. If there is MORE THAN ONE PARAMETER in
	 * a Lambda Expression, PARENTHESES ARE REQUIRED.
	 * 
	 */

	public static void main(String[] args) {
		
		int a = 10;
		
		MathOperation2 numberSquared = x -> x * x;
		
		int result = numberSquared.squared(a);
		
		System.out.printf("→ %d² = %d.%n", a, result);

	}

}
