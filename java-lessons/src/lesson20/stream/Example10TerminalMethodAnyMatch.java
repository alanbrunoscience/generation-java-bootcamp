package lesson20.stream;

import java.util.Arrays;
import java.util.List;

public class Example10TerminalMethodAnyMatch {

	/**
	 * AnyMatch
	 * 
	 * → Compared to the 'allMatch()' operation, the 'anyMatch()' operation checks
	 * whether AT LEAST ONE of the elements in the Stream meets a given condition.
	 * 
	 * → In the example below, we'll check whether any state in the list contains the
	 * word "Rio":
	 * 
	 */

	public static void main(String[] args) {
		
		List<String> states = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("=== Terminal Method 'anyMatch()' Example ===");
		
		boolean anyStateRio = states.stream()
				.anyMatch(x -> x.contains("Rio"));
		

		System.out
				.println("\n→ Does at least one state contain the word 'Rio' in its name? " + anyStateRio); // true

	}

}
