package lesson20.stream;

import java.util.Arrays;
import java.util.List;

public class Example08TerminalMethodCount {

	/**
	 * Count
	 * 
	 * → The terminal 'count()' operation returns the NUMBER OF ELEMENTS PRESENT IN
	 * THE FINAL RESULT OF THE OPERATIONS PERFORMED ON THE STREAM. 
	 * 
	 * → In the following example, we'll count how many states end with the letter "o":
	 * 
	 */

	public static void main(String[] args) {

		List<String> states = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("=== Terminal Method 'count()' Example ===");

		long numberOfStatesEndsO = states.stream()
				.filter(x -> x.endsWith("o")) // The 'endsWith()' method belongs to the String class
				.count(); // It returns a number of the 'long' type. So the 'numberOfStatesEndsO' must be
						  // the 'long' type

		System.out.println("\n→ Number of states that end with 'o': " + numberOfStatesEndsO);

	}

}
