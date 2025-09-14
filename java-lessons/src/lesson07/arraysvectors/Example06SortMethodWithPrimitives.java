package lesson07.arraysvectors;

import java.util.Arrays;

public class Example06SortMethodWithPrimitives {

	public static void main(String[] args) {

		int numbers[] = { 3, 2, 1, 6, 5, 10, 7, 4, 9, 8 };

		// Print the original array
		System.out.println("*** Original Array ***\n");
		for (int i = 0; i < numbers.length; i++) {
			if (i != numbers.length - 1)
				System.out.printf("→ %dº number: %s;\n", (i + 1), numbers[i]);
			else
				System.out.printf("→ %dº number: %s.\n", (i + 1), numbers[i]);
		}

		// Copy the original array
		int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);

		// Sorting the array in ascending order
		Arrays.sort(numbersCopy);

		System.out.println("\n*** Array in Ascending Order ***\n");
		for (int i = 0; i < numbersCopy.length; i++) {
			if (i != numbersCopy.length - 1)
				System.out.printf("→ %dº number: %s;\n", (i + 1), numbersCopy[i]);
			else
				System.out.printf("→ %dº number: %s.\n", (i + 1), numbersCopy[i]);
		}

		// Sorting the array in descending order
		int reverseArray[] = new int[numbersCopy.length];

		for (int i = 0; i < numbersCopy.length; i++) {
			reverseArray[i] = numbersCopy[(numbersCopy.length - 1) - i];
		}

		System.out.println("\n*** Array in Descending Order ***\n");
		for (int i = 0; i < reverseArray.length; i++) {
			if (i != reverseArray.length - 1)
				System.out.printf("→ %dº number: %s;\n", (i + 1), reverseArray[i]);
			else
				System.out.printf("→ %dº number: %s.\n", (i + 1), reverseArray[i]);
		}

	}

}
