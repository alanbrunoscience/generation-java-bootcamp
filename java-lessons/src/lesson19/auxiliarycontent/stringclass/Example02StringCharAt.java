package lesson19.auxiliarycontent.stringclass;

public class Example02StringCharAt {

	/**
	 * String.charAt(index)
	 * 
	 * → Returns the character at a specific position in a String.
	 * 
	 */

	public static void main(String[] args) {

		String word = "Portugal";
		int index = 2;

		System.out.println("=== String.charAt(index) ===\n");
		System.out.printf("→ 1) Word: %s;%n", word); // Portugal
		System.out.printf("→ 2) Letter in position '%d' of the '%s': %s.%n", index, word, word.charAt(index)); // 'r'

	}

}
