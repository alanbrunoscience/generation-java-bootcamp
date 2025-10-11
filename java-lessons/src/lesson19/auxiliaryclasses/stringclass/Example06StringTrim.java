package lesson19.auxiliaryclasses.stringclass;

public class Example06StringTrim {

	/**
	 * String.trim()
	 * 
	 * → Returns the String without all whitespace that appears at the beginning and
	 * end of the String.
	 * 
	 */

	public static void main(String[] args) {

		String word = " Trim test ";

		System.out.println("=== String.trim() ===\n");
		System.out.printf("→ 1) Word: '%s';%n", word); // " Trim test "
		System.out.printf("→ 2) Removes whitespaces at the beginning and end of the String: '%s'.%n", word.trim()); // "Trim
																													// test"

	}

}
