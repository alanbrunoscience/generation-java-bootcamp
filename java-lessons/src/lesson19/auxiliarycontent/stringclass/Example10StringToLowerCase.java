package lesson19.auxiliarycontent.stringclass;

public class Example10StringToLowerCase {

	/**
	 * String.toLowerCase()
	 * 
	 * → Converts all letters in a String to lower case.
	 * 
	 */

	public static void main(String[] args) {

		String text = "Hello";

		System.out.println("=== String.toLowerCase() ===\n");
		System.out.printf("→ 1) Word: '%s';%n", text); // "Hello"
		System.out.printf("→ 2) Word in lower case letters: '%s'.%n", text.toLowerCase()); // "hello"

	}

}
