package lesson08.twodimensionalarray;

public class Example06ForEachLoop {

	public static void main(String[] args) {

		/**
		 * For Each Loop
		 * 
		 * → There is also a "for-each" loop, which is used exclusively to loop through
		 * elements in an array (or other data structures):
		 * 
		 * Syntax:
		 * 
		 * for (type variableName : arrayName) { // code block to be executed }
		 * 
		 * → The for-each loop is simpler and more readable than a regular for loop,
		 * since you don't need a counter (like i < array.length). The following example
		 * prints all elements in the cars array:
		 * 
		 * String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		 * 
		 * for (String car : cars) { System.out.println(car); }
		 * 
		 */

		// Version without For...Each
		System.out.println("*** Version Without For...Each ***\n");
		String students[] = { "Felipe", "Jonas", "Julia", "Marcos" };

		for (int i = 0; i < students.length; i++) {
			System.out.printf("→ %dº student: %s\n", (i + 1), students[i]);
		}

		// Version With For...Each
		System.out.println("\n*** Version With For...Each ***\n");
		String cars[] = { "Volvo", "BMW", "Ford", "Mazda" };
		int count = 0;

		for (String car : cars) {
			System.out.printf("→ %dº car: %s\n", (count + 1), car);
			count++;
		}

	}

}
