package lesson11.methods;

import java.util.Locale;
import java.util.Scanner;

public class Example03Calculator {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			int n1, n2, option;

			System.out.println("*** Calculator ***\n");

			System.out.print("1) Enter the first number: ");
			n1 = input.nextInt();

			System.out.print("2) Enter the second number: ");
			n2 = input.nextInt();

			do {
				System.out.println("\n*** Operations ***\n");
				System.out.println("→ Choose an option:\n");
				System.out.println("1) Sum;");
				System.out.println("2) Subtraction;");
				System.out.println("3) Multiplication;");
				System.out.println("4) Division;");
				System.out.println("5) Exit;");
				System.out.print("\n→ ");
				option = input.nextInt();

				while (option < 1 || option > 5) {
					System.out.print("\n→ Invalid option! Choose an option between 1 and 5: ");
					option = input.nextInt();
				}

				switch (option) {
				case 1:
					System.out.printf("\n→ %d + %d = %d.\n", n1, n2, sum(n1, n2));
					break;
				case 2:
					System.out.printf("\n→ %d - %d = %d.\n", n1, n2, subtraction(n1, n2));
					break;
				case 3:
					System.out.printf("\n→ %d * %d = %d.\n", n1, n2, multiplication(n1, n2));
					break;
				case 4:
					System.out.printf("\n→ %d / %d = %.4f.\n", n1, n2, division(n1, n2));
					break;
				}
			} while (option != 5);

			System.out.printf("\n→ Exiting the program...\n");

		}

	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static int subtraction(int n1, int n2) {
		return n1 - n2;
	}

	public static int multiplication(int n1, int n2) {
		return n1 * n2;
	}

	public static float division(int n1, int n2) {
		return (float) n1 / (float) n2;
	}

}
