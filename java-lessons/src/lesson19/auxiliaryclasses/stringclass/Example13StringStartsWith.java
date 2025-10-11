package lesson19.auxiliaryclasses.stringclass;

public class Example13StringStartsWith {

	/**
	 * String.startsWith(String)
	 * 
	 * → Checks if a String starts with the String passed as a parameter.
	 * 
	 */

	public static void main(String[] args) {

		String text = "Hello";
		char firstChar = text.charAt(0);

		System.out.println("=== String.startsWith(String) ===\n");
		System.out.printf("→ 1) Does '%s' start with '%c'? '%b';%n", text, firstChar, text.startsWith("H")); // true

		char lowerH = 'h';
		System.out.printf("→ 2) Does '%s' start with '%c'? '%b'.%n", text, lowerH, text.startsWith("h")); // false

	}

}
