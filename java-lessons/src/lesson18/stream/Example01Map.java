package lesson18.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example01Map {

	/**
	 * Map
	 * 
	 * → The map() method is used to APPLY AN OPERATION TO EACH ELEMENT OF A LIST OR
	 * COLLECTION AND TRANSFORM THE ELEMENTS, generating a NEW COLLECTION.
	 * 
	 * → Let's see how we can use 'map()' to create a new list containing the
	 * numbers from the given list, cubed.
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("=== Method 'map()' Example ===");

		List<Integer> cubedNumbers = numbers.stream()
				.map(x -> (int) Math.pow(x, 3)) // Intermediate Operation
				.collect(Collectors.toList()); // It converts a Stream into a Collection of the List type (Terminal
												// Operation)

		System.out.println("\n→ Numbers      : " + numbers);
		System.out.println("→ Cubed numbers: " + cubedNumbers);

	}

}
