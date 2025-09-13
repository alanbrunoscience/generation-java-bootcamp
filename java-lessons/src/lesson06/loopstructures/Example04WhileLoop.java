package lesson06.loopstructures;

import java.util.Locale;
import java.util.Scanner;

public class Example04WhileLoop {

	public static void main(String[] args) {

		/**
		 * While Loop
		 * 
		 * → The while loop is used to repeat a block of code while a condition is
		 * 'true'. It is ideal when you DON'T KNOW HOW MANY TIMES THE LOOP WILL RUN, but
		 * you know when it should stop. It continues executing the block until the
		 * specified condition becomes 'false'.
		 * 
		 */

		Locale.setDefault(Locale.US);

		int num1, num2, sum;
		char isContinuing = 'y';

		try (Scanner input = new Scanner(System.in)) {

			while (!(isContinuing == 'n')) {

				System.out.println("\n*** Data Input ***\n");

				System.out.print("1) Enter the first value: ");
				num1 = input.nextInt();

				System.out.print("2) Enter the second value: ");
				num2 = input.nextInt();

				sum = num1 + num2;

				System.out.printf("\n→ %d + %d = %d\n", num1, num2, sum);

				System.out.print("\nDo you want to continue summing values (y - yes / n - no)?\n\n→ ");
				isContinuing = input.next().charAt(0);

			}
			
			System.out.println("\nFinishing program...");

		}

	}

}
