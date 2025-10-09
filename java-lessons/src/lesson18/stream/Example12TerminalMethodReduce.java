package lesson18.stream;

import java.util.Arrays;
import java.util.List;

public class Example12TerminalMethodReduce {

	/**
	 * Reduce
	 * 
	 * → The 'reduce()' method combines all the elements of the Stream into a SINGLE
	 * VALUE, such as sum, multiplication, or concatenation.
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("=== Terminal Method 'reduce()' Example ===");

		int sum = numbers.stream()
				.reduce(0, Integer::sum);
//				.reduce(0, (a, b) -> a + b);

		/**
		 * Explanation:
		 * 
		 * → '0' is the initial value (identity) of the accumulator. If the Stream is
		 * empty, '0' will be the result;
		 * 
		 * • 'Integer::sum' is a Method Reference (shortcut) for the Lambda '(a, b) -> a
		 * + b'. It is used to accumulate the sum: 'a' is the partial result and 'b' is
		 * the next Stream element;
		 * 
		 * • '.reduce(0, (a, b) -> a + b);'
		 * 
		 * → This line is the complete Lambda Expression, equivalent to 'Integer::sum'.
		 * 'a' (accumulator) and 'b' (current element) define the summing operation.
		 * 
		 */

		System.out.println("\n→ Sum of all numbers in the list: " + sum);

	}

}
