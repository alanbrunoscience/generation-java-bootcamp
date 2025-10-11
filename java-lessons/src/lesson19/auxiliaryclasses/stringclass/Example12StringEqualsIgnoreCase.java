package lesson19.auxiliaryclasses.stringclass;

public class Example12StringEqualsIgnoreCase {

	/**
	 * String.equalsIgnoreCase(String)
	 * 
	 * → Compares two strings to check if they are equal, ignoring whether the
	 * letters are upper case or lower case.
	 * 
	 */

	public static void main(String[] args) {

		String text1 = "hello";
		String text2 = "HELLO";
		String text3 = "hello";

		System.out.println("=== String.equalsIgnoreCase(String) ===\n");
		System.out.printf("→ 1) Is '%s' equal to '%s'? '%b';%n", text1, text2, text1.equalsIgnoreCase(text2)); // "true"
		System.out.printf("→ 2) Is '%s' equal to '%s'? '%b'.%n", text1, text3, text1.equalsIgnoreCase(text3)); // "true"

	}

}
