package lesson18.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example04Distinct {

	/**
	 * Distinct
	 * 
	 * → The 'distinct()' method is used to remove DUPLICATE ITEMS FROM A STREAM,
	 * ensuring that the resulting Collection will not contain duplicate elements.
	 * 
	 * → See the example below, where we'll list the state names without duplication
	 * using the 'distinct()' method:
	 * 
	 */

	public static void main(String[] args) {

		List<String> states = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		System.out.println("=== Method 'distinct()' Example ===");
		
		List<String> distinctStates = states.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("\n→ States: " + states);
		System.out.println("→ Distinct states: " + distinctStates);
		
		

	}

}
