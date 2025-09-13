package lesson06.loopstructures;

import java.util.Locale;
import java.util.Scanner;

public class Example06DoWhile {

	public static void main(String[] args) {

		/**
		 * Do-while
		 * 
		 * → The do-while loop in Java is a control flow statement that executes a block
		 * of code at least once, and then repeatedly executes the block as long as a
		 * specified boolean condition remains 'true'.
		 * 
		 */

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Variables declaration
			int num, result, count = 3;

			do {

				System.out.printf("Enter an integer number: ");
				num = input.nextInt();

				result = num * 5;

				System.out.printf("\n→ %d * 5 = %d\n\n", num, result);

			} while (count <= 2);

		}
		
		System.out.println("Finishing program...");

	}

}
