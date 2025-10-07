package lesson19.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class Example07LambdaExpressionAndCollections2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("=== Display The Items Of The List ===\n");

		numbers.forEach(n -> System.out.printf("→ %d%n", n));

		System.out.println("\n=== Display Items Added To Themselves ===\n");

		numbers.forEach(n -> System.out.printf("→ %d%n", n + n));

		System.out.println("\n=== Display Even Elements Of The List ===\n");

		numbers.forEach(n -> {
			if (n % 2 == 0) {
				System.out.printf("→ %d%n", n);
			}
		});

	}

}
