package lesson06.loopstructures;

import java.util.Locale;
import java.util.Scanner;

public class Example05WhileAsFor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Variables declaration
			int num, result, count = 0;

			while (count < 3) {
				System.out.printf("%d) Enter the %dº number: ", (count + 1), (count + 1));
				num = input.nextInt();

				result = num * 3;

				System.out.printf("\n→ %d * 3 = %d\n\n", num, result);

				count++;

			}

			System.out.println("Finishing program...");

		}

	}

}
