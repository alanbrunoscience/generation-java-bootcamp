package lesson19.auxiliarycontent.stringclass;

public class Example09StringToUpperCase {

	/**
	 * String.toUpperCase()
	 * 
	 * → Converts all letters in a String to upper case.
	 * 
	 */

	public static void main(String[] args) {

		String text = "Hello";

		System.out.println("=== String.toUpperCase() ===\n");
		System.out.printf("→ 1) Word: '%s';%n", text); // "Hello"
		System.out.printf("→ 2) Word in upper case letters: '%s'.%n", text.toUpperCase()); // "HELLO"

	}

}
