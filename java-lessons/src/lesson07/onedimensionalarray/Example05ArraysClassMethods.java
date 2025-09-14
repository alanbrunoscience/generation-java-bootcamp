package lesson07.onedimensionalarray;

import java.util.Arrays;
import java.util.Collections;

public class Example05ArraysClassMethods {

	public static void main(String[] args) {
		
		/**
		 * Arrays Class Methods
		 * 
		 * → The Arrays class implements methods for manipulating arrays. The Arrays class methods 
		 * support arrays of any type.
		 * 
		 * *----------------------------------------------------------------------------------------------*
		 * |  Method                                          |  Description                              |
		 * *----------------------------------------------------------------------------------------------*
		 * |  Arrays.sort(array)                              |  The sort() method sorts an array in      | 
		 * |                                                  |  ascending order. This method sorts       |
		 * |                                                  |  arrays of strings alphabetically, and    |
		 * |                                                  |  arrays of integers numerically.          |
		 * *----------------------------------------------------------------------------------------------*
		 * |  Arrays.sort(array, Collections.reverseOrder())  |  Sorts the elements of an array of        |
		 * |                                                  |  Objects in descending order. To use      |
		 * |                                                  |  this method with a primitive array, you  |
		 * |                                                  |  need to convert it to an array of        |
		 * |                                                  |  Objects using Wrapper Classes.           |
		 * *----------------------------------------------------------------------------------------------*
		 * |  Arrays.equals(array1, array2)                   |  Compares 2 arrays returning 'true' if    |
		 * |                                                  |  both have the same length and the same   | 
		 * |                                                  |  elements in the same order.              |
		 * *----------------------------------------------------------------------------------------------*
		 * |  Arrays.toString(array)                          |  The Arrays.toString() method belongs to  | 
		 * |                                                  |  the Arrays class in Java. It converts an |
		 * |                                                  |  array into its string representation     |
		 * |                                                  |  consisting of a list of the array's      |  
		 * |                                                  |  elements. In the case of an Object Array,|
		 * |                                                  |  if the array contains other arrays as    |
		 * |                                                  |  elements, their string representation    |
		 * |                                                  |  shows memory addresses instead of        |
		 * |                                                  |  contents.                                |
		 * *----------------------------------------------------------------------------------------------*
		 * |  Arrays.binarySearch(array, key)                 |  Returns the position of the searched     |
		 * |                                                  |  element in the array. The array must be  |
		 * |                                                  |  sorted. If there are duplicates, the     |
		 * |                                                  |  index returned is not guaranteed.        |
		 * *----------------------------------------------------------------------------------------------*
		 * |  Arrays.fill(array, value)                       |  Fills the entire array with the          |
		 * |                                                  |  specified value.                         |
		 * *----------------------------------------------------------------------------------------------*
		 * |  Arrays.compare(array1, array2)                  |  Compares two arrays based on their       |
		 * |                                                  |  content, returning 0 if they are equal,  |
		 * |                                                  |  a negative value if the first array is   |
		 * |                                                  |  smaller (lexicographically), and a       | 
		 * |                                                  |  positive value if it's lexicographically | 
		 * |                                                  |  greater.                                 |
		 * *----------------------------------------------------------------------------------------------*
		 * 
		 */

		// .sort() Method
		
		// Array declaration
		String names[] = {"Samantha", "Amanda", "Mark", "Kirk", "Leo"};
		
		// Print the original array
		System.out.println("*** Original Array ***\n");
		for (int i = 0; i < names.length; i++) {
			if (i != names.length - 1)
				System.out.printf("→ %dº name: %s;\n", (i + 1), names[i]);
			else
				System.out.printf("→ %dº name: %s.\n", (i + 1), names[i]);
		}
		
		// Sorting the array in ascending order
		Arrays.sort(names);
		
		System.out.println("\n*** Array in Ascending Order ***\n");
		for (int i = 0; i < names.length; i++) {
			if (i != names.length - 1)
				System.out.printf("→ %dº name: %s;\n", (i + 1), names[i]);
			else
				System.out.printf("→ %dº name: %s.\n", (i + 1), names[i]);
		}
		
		// Sorting the array in descending order
		Arrays.sort(names, Collections.reverseOrder());
		
		System.out.println("\n*** Array in Descending Order ***\n");
		for (int i = 0; i < names.length; i++) {
			if (i != names.length - 1)
				System.out.printf("→ %dº name: %s;\n", (i + 1), names[i]);
			else
				System.out.printf("→ %dº name: %s.\n", (i + 1), names[i]);
		}
		
	}

}
