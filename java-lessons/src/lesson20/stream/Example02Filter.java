package lesson20.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example02Filter {

	/**
	 * Filter
	 * 
	 * → The filter() method is used to FILTER THE ELEMENTS OF A LIST OR COLLECTION
	 * BASED ON A SPECIFIC CONDITION. It returns a new Stream containing only the
	 * elements that meet the given condition.
	 * 
	 * → Let's see how we can use filter() to filter even numbers from a list of
	 * numbers from 1 to 10.
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("=== Method 'filter()' Example ===");

		List<Integer> evenNumbers = numbers.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());

		System.out.println("\n→ Numbers     : " + numbers);
		System.out.println("→ Even numbers: " + evenNumbers);

	}

}
