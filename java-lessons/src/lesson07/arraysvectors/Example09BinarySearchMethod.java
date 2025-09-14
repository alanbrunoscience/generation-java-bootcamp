package lesson07.arraysvectors;

import java.util.Arrays;

public class Example09BinarySearchMethod {

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5, 10, 7, 6, 9, 8 };

		// Copy the original array
		int numbersCopy[] = Arrays.copyOf(numbers, numbers.length);

		// Sort the array in ascending order
		Arrays.sort(numbersCopy);

		// Print the array sorted
		System.out.println("*** Sorted Array ***\n");
		for (int i = 0; i < numbersCopy.length; i++) {
			if (i != numbersCopy.length - 1)
				System.out.printf("→ %dº element: %d (index %d);\n", (i + 1), numbersCopy[i], i);
			else
				System.out.printf("→ %dº element: %d (index %d).\n", (i + 1), numbersCopy[i], i);
		}

		// Search an element by Search Binary
		int searchedElement = 8;
		int foundElemPos = Arrays.binarySearch(numbersCopy, searchedElement);

		if (foundElemPos < 0)
			System.out.printf("\n→ Element '%d' not found in the array!\n", searchedElement);
		else
			System.out.printf("\n→ Element '%d' found at position '%d'.\n", searchedElement, foundElemPos);

	}

}
