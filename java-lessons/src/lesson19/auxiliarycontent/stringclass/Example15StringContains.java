package lesson19.auxiliarycontent.stringclass;

public class Example15StringContains {

	/**
	 * String.contains(String)
	 * 
	 * → Checks if a String contains the String passed as a parameter.
	 * 
	 */

	public static void main(String[] args) {

		String text = "Hello";
		String partialText = "lo";

		System.out.println("=== String.contains(String) ===\n");
		System.out.printf("→ 1) Does '%s' contain '%s' in its name? '%b'.%n", text, partialText,
				text.contains(partialText)); // true

	}

}
