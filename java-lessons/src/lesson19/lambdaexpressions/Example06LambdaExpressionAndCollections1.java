package lesson19.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class Example06LambdaExpressionAndCollections1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("Display the items of the List:\n");

		int count = 1;

		// Displays List items without Lambda Expression
		for (Integer n : numbers) {
			System.out.printf("→ %dº Element: %d%n", count, n);
			count++;
		}

		count = 1;

		System.out.println("\nDisplay items added to themselves:\n");
		for (Integer n : numbers) {
			System.out.printf("→ %dº Element: %d%n", count, n + n);
			count++;
		}

		count = 1;

		System.out.println("\nDisplay even elements of the List:\n");
		for (Integer n : numbers) {
			if (n % 2 == 0) {
				System.out.printf("→ %dº Element: %d%n", count, n);
				count++;
			}
		}

	}

}
