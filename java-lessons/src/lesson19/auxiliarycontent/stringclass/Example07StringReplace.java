package lesson19.auxiliarycontent.stringclass;

public class Example07StringReplace {

	/**
	 * String.replace('character', 'replacement')
	 * 
	 * → Replaces individual characters in the String.
	 * 
	 */

	public static void main(String[] args) {

		String word = "Lalala";

		System.out.println("=== String.replace('character', 'replacement') ===\n");
		System.out.printf("→ 1) Word: '%s';%n", word); // "Lalala"
		System.out.printf("→ 2) New string after replacing the character 'a' with 'u' in the string '%s': '%s'.%n",
				word, word.replace('a', 'u')); // "Lululu"

	}

}
