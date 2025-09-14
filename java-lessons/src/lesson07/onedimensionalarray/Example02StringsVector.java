package lesson07.onedimensionalarray;

import java.util.Locale;
import java.util.Scanner;

public class Example02StringsVector {

	public static void main(String[] args) {

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

		}

	}

}
