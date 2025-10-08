package lesson20.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example07TerminalMethodCollect {

	/**
	 * Terminal Methods
	 * 
	 * → Terminal Methods or Terminal Operations are methods that complete the
	 * transformation process of a Stream and return a value or an object. After a
	 * terminal operation is executed, the Stream cannot be modified by other
	 * intermediate operations or new terminal operations.
	 * 
	 * → Before we continue, let's add the Collection below to your code:
	 * 
	 * • List<String> states = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas
	 * Gerais", "Espírito Santo", "Rio Grande do Sul", "Santa Catarina", "Paraná");
	 * 
	 * ----------------------------------------------------------------------------
	 * 
	 * Collect
	 * 
	 * → As we saw in the previous examples, the 'collect()' operation is one of the
	 * most commonly used terminal methods. It's used to collect the results of a
	 * Stream and create a new Collection (such as a list, set, or map).
	 * 
	 * → In the example below, we'll combine several intermediate operations and, at
	 * the end, collect the results into a new List:
	 * 
	 */

	public static void main(String[] args) {

		List<String> states = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("=== Terminal Method 'collect()' Example ===");

		List<String> statesR = states.stream()
				.filter(x -> x.startsWith("R")) // The 'startsWith()' method belongs to the String class
				.sorted()
				.collect(Collectors.toList());

		System.out.println("\n→ Name's states that initiates with 'R': " + statesR);

	}

}
