package lesson07.arraysvectors;

import java.util.Locale;
import java.util.Scanner;

public class Example03EmptyVector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Vector declaration
			float realNumbers[] = new float[5];

			// Inserting elements into the array
			System.out.println("********** Data input **********\n");

			// The '.length' property returns the length of an array, that is, how many
			// elements there are in the array
			for (int i = 0; i < realNumbers.length; i++) {
				System.out.printf("%d) Enter the %dº element of the array (float number): ", (i + 1), (i + 1));
				realNumbers[i] = input.nextFloat();
			}

			// Print array elements
			System.out.println("\n********** Array's Elements **********\n");
			for (int i = 0; i < realNumbers.length; i++) {
				if (i != realNumbers.length - 1)
					System.out.printf("→ %dº element: %.2f;\n", (i + 1), realNumbers[i]);
				else
					System.out.printf("→ %dº element: %.2f.\n", (i + 1), realNumbers[i]);
			}

		}

	}

}
