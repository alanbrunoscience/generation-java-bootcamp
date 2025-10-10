package lesson19.auxiliarycontent.stringclass;

public class Example04StringSubstringStart {

	/**
	 * String.substring(start)
	 * 
	 * → Returns a copy of characters from the start index to the end of the String.
	 * 
	 */

	public static void main(String[] args) {

		String word = "Courage";
		int index = 2;

		System.out.println("=== String.substring(start) ===\n");
		System.out.printf("→ 1) Word: %s;%n", word); // 11
		System.out.printf("→ 2) Characters from the index '%d' to the end of the word '%s': '%s'.%n", index, word,
				word.substring(2)); // "urage"

	}

}
