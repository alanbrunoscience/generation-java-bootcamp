package lesson03.datainputandoutput;

import java.util.Locale;
import java.util.Scanner;

public class Example03DataInput {

	public static void main(String[] args) {
		
		/**
		 * Scanner Class - Input Methods
		 * 
		 * *--------------------------------------------------------------------------------------------------*
		 * | Method          | Return Type  | Description                                                     |
		 * *--------------------------------------------------------------------------------------------------*
		 * | next()          | String       | Reads a single word (a string without spaces).                  |
		 * | next().charAt(0)| char         | Reads a single character, except for the whitespace character.  |
		 * | nextLine()      | String       | Reads a full line of characters, including spaces.              |
		 * | nextInt()       | int          | Reads a 32-bit integer number.                                  |
	 	 * | nextLong()      | long         | Reads a 64-bit integer number.                                  |
		 * | nextFloat()     | float        | Reads a 32-bit real number (floating-point).                    |
		 * | nextDouble()    | double       | Reads a 64-bit real number (floating-point or scientific).      |
		 * | nextBoolean()   | boolean      | Reads a boolean value (true or false).                          |
		 * *--------------------------------------------------------------------------------------------------*
		 * 
		 */

		Locale.setDefault(Locale.US);
		
		// Defining the Scanner Class to obtain information from the user through the keyboard
		Scanner input = new Scanner(System.in); // 'System.in' → Standard input device (e.g.: keyboard, text file, etc.).
		
		// Variables declaration
		int quantity;
		long identifier;
		float height;
		double area;
		char type;
		String phrase;
		boolean active;
		
		// Data input
		System.out.printf("1) Enter a value to the '%s' variable (int): ", "quantity");
		quantity = input.nextInt();
		
		System.out.printf("2) Enter a value to the '%s' variable (long): ", "identifier");
		identifier = input.nextLong();
		
		System.out.printf("3) Enter a value to the '%s' variable (float): ", "height");
		height = input.nextFloat();
		
		System.out.printf("4) Enter a value to the '%s' variable (Double): ", "area");
		area = input.nextDouble();

		System.out.printf("5) Enter a value to the '%s' variable (char): ", "type");
		type = input.next().charAt(0);
		
		input.nextLine(); // It consumes the line break on the terminal buffer
		
		System.out.printf("6) Enter a value to the '%s' variable (String): ", "phrase");
		// input.skip("\\R?"); // Skip the line break before using nextLine()
		phrase = input.nextLine();
		
		System.out.printf("7) Enter a value to the '%s' variable (boolean): ", "active");
		active = input.nextBoolean();
		
		// Data output
		System.out.println("\n*** Received Data From Keyboard ***\n");
		System.out.printf("1) Value of '%s' variable: %d;\n", "quantity", quantity);
		System.out.printf("2) Value of '%s' variable: %d;\n", "identifier", identifier);
		System.out.printf("3) Value of '%s' variable: %.2f;\n", "height", height);
		System.out.printf("4) Value of '%s' variable: %.2f;\n", "area", area);
		System.out.printf("5) Value of '%s' variable: %c;\n", "type", type);
		System.out.printf("6) Value of '%s' variable: %s;\n", "phrase", phrase);
		System.out.printf("7) Value of '%s' variable: %b.\n", "active", active);
		
		input.close(); // input.close() releases the system's input resource, preventing resource leaks 
		// that keep the communication port busy. It must be explicitly closed.

	}

}
