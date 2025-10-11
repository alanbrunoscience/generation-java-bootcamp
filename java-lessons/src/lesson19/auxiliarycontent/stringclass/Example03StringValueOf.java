package lesson19.auxiliarycontent.stringclass;

public class Example03StringValueOf {

	/**
	 * String.valueOf()
	 * 
	 * → Converts various data types to String.
	 * 
	 */

	public static void main(String[] args) {

		int number = 11;
		String numberAsString = String.valueOf(number);

		System.out.println("=== String.valueOf() ===\n");
		
		System.out.printf("→ 1) Number: %d;%n", number); // 11
		
		System.out.printf("→ 2) Type of the variable 'number' ('%d'): %s;%n", number,
				((Object) number).getClass().getSimpleName()); // Integer
		
		System.out.printf("→ 3) Number '%d' transformed into a string: '%s';%n", number, numberAsString); // "11"
		
		System.out.printf("→ 4) Type of the variable 'numberAsString' ('%s'): %s.%n", numberAsString,
				numberAsString.getClass().getSimpleName()); // String

	}

}
