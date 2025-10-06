package lesson17.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example03Throw2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int age;
		boolean loop = true;

		do {

			try {
				System.out.print("Enter your age: ");
				age = input.nextInt();

				validateAge(age);

				loop = false;

			} catch (InputMismatchException e) {
				System.err.println("\n🚫 ERROR: Invalid input! Please enter an integer.\n");
				input.nextLine();

			} catch (ArithmeticException e) {

				System.err.printf("\n%s\n\n", e.getMessage());
				input.nextLine();
				System.out.printf("→ Please enter an integer greater than or equal to 18!\n\n");
			}

		} while (loop);

		input.close();
		System.out.println("\nProgram terminated gracefully.");

	}

	public static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("❌ You can't drive!");
		} else {
			System.out.println("\n→ You can drive!");
		}
	}

}