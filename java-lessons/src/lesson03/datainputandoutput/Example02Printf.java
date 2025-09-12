package lesson03.datainputandoutput;

import java.util.Locale;

public class Example02Printf {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/**
		 * printf()
		 * 
		 * → printf(): Allows you to display formatted data on the screen (date, time, currency, among others).
		 * 
		 * Syntax: 
		 * 
		 * → System.out.printf(control_expression, argument1, argument2, ...);
		 * 
		 * *---------------------------------------------------------------------------------------------------------*
         * | Format Code | Data Type            | Description                                                        |
		 * *---------------------------------------------------------------------------------------------------------*
		 * | %c          | char                 | Single character.                                                  |
		 * | %s          | String               | Character string.                                                  |
		 * | %b          | boolean              | Boolean value (true or false).                                     |
		 * | %d          | int or long          | Integer number.                                                    |
		 * | %f          | float or double      | Floating-point number.                                             |
		 * | %.2f        | float or double      | Floating-point number, limiting the number of decimal digits to 2. |
		 * | %e          | float or double      | Real number in scientific notation with a lowercase "e".           |
		 * | %E          | float or double      | Real number in scientific notation with an uppercase "E".          |
	     * | %%          |                      | Prints the % character itself.                                     |
		 * *---------------------------------------------------------------------------------------------------------*
		 * 
		 * Java Escape Characters:
		 * 
		 * *---------------------------------------------------------------------------------------------------------*
		 * | Escape Character | Description                                                                          |
		 * *---------------------------------------------------------------------------------------------------------*
		 * | \n               | New line                                                                             |
		 * | \t               | Horizontal tab (same as pressing the Tab key)                                        |
		 * | \r               | "Carriage return". Moves the terminal cursor to the beginning of the line.           |
		 * | \b               | Backspace. Moves the cursor one position to the left or deletes a single character.  |
		 * | \'               | Single quote                                                                         |
		 * | \"               | Double quote                                                                         |
		 * | \\               | Backslash                                                                            |
		 * *---------------------------------------------------------------------------------------------------------*
		 * 
		 * → See the examples below:
		 * 
		 */
		
		// Variables declaration
		int quantity = 1000;
		long identifier = 10000l;
		float height = 25.4f;
		double area = 45.4567;
		double size = 650000000.00;
		char type = 'A';
		String word = "Generation";
		
		System.out.printf("1) Variable '%s' = %d;\n", "quantity", quantity); // 1) Variable 'quantity' = 1000;
		System.out.printf("2) Variable '%s' = %d;\n", "identifier", identifier); // 2) Variable 'identifier' = 10000; 
		System.out.printf("3) Variable '%s' = %.2f;\n", "height", height); // 3) Variable 'height' = 25.40;
		System.out.printf("4) Variable '%s' = %.2f;\n", "area", area); // 4) Variable 'area' = 45.46;
		System.out.printf("5) Variable '%s' = %.1e;\n", "size", size); // 5) Variable 'size' = 6.5e+08; ('e' or 'E' base 10, and '+04' represents the exponent of the power)
		System.out.printf("6) Variable '%s' = %.1E;\n", "size", size); // 6) Variable 'size' = 6.5E+08;
		System.out.printf("7) Variable '%s' = %c;\n", "type", type); // 7) Variable 'type' = A;
		System.out.printf("8) Variable '%s' = %s.\n", "word", word); // 8) Variable 'word' = Generation.
		
	}

}
