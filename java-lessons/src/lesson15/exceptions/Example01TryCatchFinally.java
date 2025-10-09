package lesson15.exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example01TryCatchFinally {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String names[] = { "Alice", "Bob", "Charlie" };
		int index;
		boolean loop = true;

		do {

			System.out.printf("- Available names: %s%n", Arrays.toString(names));

			try {
				// TRY Block: Contains the code that MIGHT throw an exception.
				System.out.print("\n→ Enter the index (0, 1, or 2) to see the name: ");

				// Tries to read an integer from the user.
				index = input.nextInt();

				// Tries to access the array with the provided index.
				// If the user types, for example, '3',
				// this line will throw an 'ArrayIndexOutOfBoundsException'.
				String chosenName = names[index];

				System.out.printf("\n→ The chosen name is: %s.%n", chosenName);

				loop = false;

			} catch (InputMismatchException e) {
				// CATCH Block (Specific): Catches the exception if the user types text instead
				// of a number.
				System.err.println("\n🚫 Error: Invalid input! Please enter integers only.");
				input.nextLine(); // Clears the input buffer (object of the 'Scanner' class).
			} catch (ArrayIndexOutOfBoundsException e) {
				// CATCH Block (Specific): Catches the exception if the index is out of the
				// array bounds.
				// The variable 'e' contains details about the exception.
				System.err.println("\n🚨 CRITICAL ERROR: The index is out of the array's boundary.");
				System.err.println("Exception detail: " + e.getMessage());
			} catch (Exception e) {
				// CATCH Block (Generic): Catches ANY other exception not caught above.
				System.err.println("\n❌ An unknown error occurred: " + e.toString());
				loop = false;
			} finally {
				// FINALLY Block: This block will ALWAYS execute, regardless of whether
				// an exception occurred or was handled.
				System.out.println("\n✅ End of the array access attempt.\n");
			}

		} while (loop);

		input.close(); // Good practice: close resources.

		System.out.println("Program terminated gracefully.");

	}

}