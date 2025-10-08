package lesson20.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example03Sorted {

	/**
	 * Sorted
	 * 
	 * → The 'sorted()' method is used to SORT THE ELEMENTS OF A COLLECTION. It can
	 * be applied to a Stream to sort the data in ASCENDING or DESCENDING order.
	 * 
	 * → Below, we'll see an example of how to sort a collection of unsorted
	 * integers in ascending or descending order using the 'sorted()' method:
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> unorderedNumbers = Arrays.asList(6, 7, 8, 1, 4, 5, 9, 10, 2, 3);

		System.out.println("=== Method 'sorted()' Example ===");

		// Stream to sort the unsorted numbers in ascending order
		List<Integer> orderedNumbersAsc = unorderedNumbers.stream()
				.sorted()
				.collect(Collectors.toList());

		// Stream to sort the unsorted numbers in descending order
		List<Integer> orderedNumbersDesc = unorderedNumbers.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println("\n→ Unordered numbers: " + unorderedNumbers);
		System.out.println("→ Ordered numbers in ascending order: " + orderedNumbersAsc);
		System.out.println("→ Ordered numbers in descending order: " + orderedNumbersDesc);

	}

	/**
	 * Comparator.reverseOrder()
	 * 
	 * → To sort in descending order, we pass the 'Comparator.reverseOrder()' method
	 * as a parameter to the 'sorted()' method, which reverses the order of the
	 * elements.
	 * 
	 * → 'Comparator' is a functional interface used to compare objects and define
	 * the sorting order (ascending or descending).
	 * 
	 * → The 'Comparator' is utilized to sort elements of a Collection (such as
	 * lists) and can be customized as needed. It compares two objects of the same
	 * class and can sort the Collection according to defined criteria.
	 * 
	 * → Examples of 'Comparator' Methods:
	 * 
	 * • 'Comparator.reverseOrder()': Reverses the natural order of elements,
	 * resulting in a DESCENDING sort.
	 * 
	 * • 'Comparator.naturalOrder()': Sorts according to the natural order of
	 * elements, resulting in an ASCENDING sort.
	 * 
	 */

}
