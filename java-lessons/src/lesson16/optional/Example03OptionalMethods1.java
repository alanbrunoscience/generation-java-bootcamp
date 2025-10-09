package lesson16.optional;

import java.util.Optional;

public class Example03OptionalMethods1 {

	public static void main(String[] args) {

		String[] phrases = new String[5];

		phrases[2] = "Hello! My name is Alan and my favourite sport is Karate.";

		Optional<String> optionalEmpty = Optional.empty();
		System.out.printf("→ Displays the content of 'optionalEmpty': %s;%n", optionalEmpty); // Optional.empty;
		System.out.printf("%n→ Is the 'optionalEmpty' empty? %b;%n", optionalEmpty.isEmpty()); // true;

		Optional<String> valueOfIndex2 = Optional.of(phrases[2]);
		System.out.printf("%n→ Displays the content of 'valueOfIndex2': %s;%n", valueOfIndex2); // Optional[Hello! My
																								// name is Alan and my
																								// favourite sport is
																								// Karate.]
		System.out.printf("%n→ Gets the content of 'valueOfIndex2': '%s';%n", valueOfIndex2.get()); // 'Hello! My name
																									// is
																									// Alan and my
																									// favourite sport
																									// is Karate.'
		System.out.printf("%n→ Is the 'valueOfIndex2' present? %b.%n", valueOfIndex2.isPresent()); // true.

	}

}
