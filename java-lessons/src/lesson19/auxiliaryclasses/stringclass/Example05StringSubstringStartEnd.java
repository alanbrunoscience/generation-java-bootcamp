package lesson19.auxiliaryclasses.stringclass;

public class Example05StringSubstringStartEnd {

	/**
	 * String.substring(start, end)
	 * 
	 * → Returns a copy of characters from two integer indices: from the starting
	 * index to the ending index. THE ENDING INDEX CHARACTER IS IGNORED (print until
	 * it).
	 * 
	 */

	public static void main(String[] args) {

		String word = "Courage";
		int startingIndex = 0;
		int endingIndex = 2;

		System.out.println("=== String.substring(start, end) ===\n");
		System.out.printf("→ 1) Word: %s;%n", word); // Courage
		System.out.printf(
				"→ 2) Characters from the starting index '%d' to the ending index '%d' of the word '%s': '%s'.%n",
				startingIndex, endingIndex, word, word.substring(0, 2)); // "Co"

	}

}
