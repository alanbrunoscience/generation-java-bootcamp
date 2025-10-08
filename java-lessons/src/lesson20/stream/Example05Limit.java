package lesson20.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example05Limit {

	/**
	 * Limit
	 * 
	 * → The 'limit(n)' method returns the first 'n' elements of the Stream. It's
	 * useful when you want to get only a portion of the original Collection.
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("=== Method 'limit(n)' Example ===");

		List<Integer> firstFive = numbers.stream()
				.limit(5)
				.collect(Collectors.toList());

		System.out.println("\n→ Numbers: " + numbers);
		System.out.println("→ First five numbers: " + firstFive);

	}

}
