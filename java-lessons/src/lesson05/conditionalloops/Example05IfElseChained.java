package lesson05.conditionalloops;

import java.util.Locale;
import java.util.Scanner;

public class Example05IfElseChained {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		float n1, n2, average;

		try (Scanner input = new Scanner(System.in)) {

			System.out.print("1) Enter the first grade: ");
			n1 = input.nextFloat();

			System.out.print("2) Enter the second grade: ");
			n2 = input.nextFloat();

			average = (n1 + n2) / 2;

			if (average >= 6) {
				System.out.println("\n→ Congratulations, you passed!");
			} else if (average == 5) {
				System.out.println("\n→ You must take the final exam!");
			} else {
				System.out.println("\n→ Unfortunately, you failed!");
			}

		}

	}

}
