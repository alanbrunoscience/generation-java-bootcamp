package lesson18.stream;

import java.util.Arrays;
import java.util.List;

public class Example11TerminalMethodForEach {

	/**
	 * ForEach
	 * 
	 * → The 'forEach()' method is used to ITERATE OVER THE STREAM'S RESULTING
	 * Collection, similar to a traditional 'for' loop.
	 * 
	 * → See the example below, where, instead of storing the data in a new
	 * Collection, we simply display the elements directly to the console:
	 * 
	 */

	public static void main(String[] args) {

		List<String> states = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo",
				"Rio Grande do Sul", "Santa Catarina", "Paraná");

		System.out.println("=== Terminal Method 'forEach()' Example ===\n");

		states.stream()
		.filter(x -> x.startsWith("S"))
		.forEach(x -> System.out.println("→ " + x)); // Lambda Expression
		// .forEach(System.out::println); // Call 'println' directly on the object (x)

	}

}
