package lesson07.onedimensionalarray;

import java.util.Locale;
import java.util.Scanner;

public class Example04FindingTheSizeOfArray {

	public static void main(String[] args) {
		
		/**
		 * Java Array length Property
		 * 
		 * → The 'length' property returns the length of an array. This is a built-in Java property, and 
		 * does not belong to the 'Java Arrays Class'.
		 * 
		 * → Note: The 'length' property must not be mistaken with the 'length()' method that is used for Strings.
		 * 
		 * → For more information, access: https://www.w3schools.com/java/ref_arrays_length.asp
		 * 
		 */

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Vector declaration
			String dogs[] = { "Golden Retriever", "Bulldog", "Chihuahua", "Poodle", "Yorkshire Terrier" };

			// Print vector elements
			System.out.println("********** Dogs' List **********\n");
			for (int i = 0; i < dogs.length; i++) {
				if (i != dogs.length - 1)
					// dogs[i] → Accessing an element from a specific position
					System.out.printf("→ %dº dog: %s;\n", (i + 1), dogs[i]);
				else
					System.out.printf("→ %dº dog: %s.\n", (i + 1), dogs[i]);
			}
			
			// Size of array
			System.out.printf("\n→ The size of the array is %d.", dogs.length);

		}

	}

}
