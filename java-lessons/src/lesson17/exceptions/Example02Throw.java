package lesson17.exceptions;

import java.util.Scanner;

public class Example02Throw {

	public static void main(String[] args) {

		/**
		 * Throw
		 * 
		 * → The 'throw' clause explicitly launches an exception at any point in the
		 * code.
		 * 
		 * • It transfers the control flow to the calling methods; 
		 * 
		 * • The 'throw' clause allows you to throw both checked and unchecked exceptions.
		 * 
		 * → The 'throw' keyword is primarily used to throw 'custom exceptions' — that
		 * is, an Exception Class created by the developer to be thrown upon a specific
		 * error when Java does not have an appropriate built-in Exception Type for that
		 * error. See the example below:
		 * 
		 */

		try (Scanner input = new Scanner(System.in)) {

			int age;

			System.out.print("Enter your age: ");
			age = input.nextInt();

			validateAge(age);

		}

	}

	public static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("❌ You can't drive!");
		} else {
			System.out.println("\n→ You can drive!");
		}
	}

}
