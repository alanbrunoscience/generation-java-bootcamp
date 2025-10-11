package lesson19.auxiliaryclasses.stringclass;

public class Example08StringConcat {

	/**
	 * String.concat()
	 * 
	 * → Concatenates two Strings and returns a new String object.
	 * 
	 */

	public static void main(String[] args) {

		String text1 = "Hello";
		String text2 = " World!";

		System.out.println("=== String.concat() ===\n");
		System.out.printf("→ 1) First word: '%s';%n", text1); // "Hello"
		System.out.printf("→ 2) Second word: '%s';%n", text2); // " World!"
		System.out.printf("→ 3) Resulting string after concatenation of '%s' with '%s': '%s'.%n", text1, text2,
				text1.concat(text2)); // "Hello World!"

	}

}
