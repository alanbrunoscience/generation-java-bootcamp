package lesson20.stream;

import java.util.Arrays;
import java.util.List;

public class Example09TerminalMethodAllMatch {

	/**
	 * AllMatch
	 * 
	 * → The 'allMatch()' terminal operation checks whether all elements in the
	 * Stream meet a given condition. In the example below, we'll check whether all
	 * states in the list contain the word "Rio":
	 * 
	 */

	public static void main(String[] args) {

		List<String> states = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("=== Terminal Method 'AllMatch()' Example ===");

		boolean allStatesRio = states.stream()
				.allMatch(x -> x.contains("Rio")); // The 'contains()' method belongs to the String class

		System.out
				.println("\n→ Do all the states on the list contain the word \"Rio\" in their names? " + allStatesRio); // false

	}

}
