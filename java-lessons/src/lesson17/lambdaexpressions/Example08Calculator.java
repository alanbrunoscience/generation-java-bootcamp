package lesson17.lambdaexpressions;

import java.util.Locale;
import java.util.Scanner;

@FunctionalInterface
interface MathOperations {
	float performMathOps(int a, int b);
}

public class Example08Calculator {
	
	public static float calculate(MathOperations operation, int n1, int n2) {
		return operation.performMathOps(n1, n2);
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int n1, n2;
		
		try(Scanner input = new Scanner(System.in)) {
		
			System.out.println("****************************************************");
			System.out.println("                  Lambda Calculator                 ");
			System.out.println("****************************************************\n");
			System.out.print("1) Enter the first number: ");
			n1 = input.nextInt();
			System.out.print("2) Enter the second number: ");
			n2 = input.nextInt();
			
			System.out.printf("%n→ %d + %d = %.2f%n", n1, n2, calculate((a, b) -> a + b, n1, n2));	
			System.out.printf("→ %d - %d = %.2f%n", n1, n2, calculate((a, b) -> a - b, n1, n2));
			System.out.printf("→ %d * %d = %.2f%n", n1, n2, calculate((a, b) -> a * b, n1, n2));
			System.out.printf("→ %d / %d = %.2f%n", n1, n2, calculate((a, b) -> (float) a / (float) b, n1, n2));
			
		}
		
	}
	
	

}
