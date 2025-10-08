package lesson20.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example06Skip {

	/**
	 * Skip
	 * 
	 * → The 'skip(n)' method skips the first 'n' elements of the Stream, returning
	 * the remaining elements.
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("=== Method 'skip(n)' Example ===");

		List<Integer> firstFiveIgnored = numbers.stream()
				.skip(5)
				.collect(Collectors.toList());

		System.out.println("\n→ Numbers: " + numbers);
		System.out.println("→ Remaining numbers after the first five: " + firstFiveIgnored);

	}

}
