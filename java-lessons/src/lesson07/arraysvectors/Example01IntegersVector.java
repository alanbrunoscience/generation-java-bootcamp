package lesson07.arraysvectors;

import java.util.Locale;
import java.util.Scanner;

public class Example01IntegersVector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Vector declaration
			int integers[] = { 10, 15, 35, 70, 140 };

			// Print vector elements
			System.out.println("******* Array's Elements *******\n");
			for (int i = 0; i < integers.length; i++) {
				// integers[i] → Accessing an element from a specific position
				System.out.printf("→ %dº element of the array: %d\n", (i + 1), integers[i]);
			}

		}

	}

}
