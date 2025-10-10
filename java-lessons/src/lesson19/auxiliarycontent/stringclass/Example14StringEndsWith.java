package lesson19.auxiliarycontent.stringclass;

public class Example14StringEndsWith {

	/**
	 * String.endsWith(String)
	 * 
	 * → Checks if a String ends with the String passed as a parameter.
	 * 
	 */

	public static void main(String[] args) {

		String text = "Hello";
		char lastChar = text.charAt(text.length() - 1);
		String lastCharAsString = String.valueOf(lastChar);

		System.out.println("=== String.endsWith(String) ===\n");
		System.out.printf("→ 1) Does '%s' end with '%c'? '%b';%n", text, lastChar, text.endsWith(lastCharAsString)); // true

		char upperO = 'O';
		System.out.printf("→ 2) Does '%s' end with '%c'? '%b'.%n", text, upperO, text.endsWith("O")); // false

	}

}
