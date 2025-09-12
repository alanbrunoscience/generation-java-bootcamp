package lesson02.variablesandconstants;

public class Example02InitializedVariables {

	public static void main(String[] args) {
		

		// Variables declaration
		
		// Integer Types
		byte bits = 127;
		short value = 254;
		int quantity = 1000;
		long identifier = 10000l; // For a long type variable, the lowercase letter 'l' must be added 
		// at the end of the value.
		
		// Real Types
		float height = 25.4f; // For a float type variable, the decimal places must be informed, 
		// even if it is zero (e.g.: 10.0) and at the end the lowercase letter 'f' must be added.
		double area = 45.4567;
		
		// Non-numerical types
		char character = 'A';
		boolean answer = true;
		
		
		// Printing Variables
		System.out.printf("1) Value of variable of type 'byte': %d;%n", bits); // 127
		System.out.printf("2) Value of variable of type 'short': %d;%n", value); // 254
		System.out.printf("3) Value of variable of type 'int': %d;%n", quantity); // 1000
		System.out.printf("4) Value of variable of type 'long': %d;%n", identifier); // 10000
		System.out.printf("5) Value of variable of type 'float': %f;%n", height); // 25.400000
		System.out.printf("6) Value of variable of type 'double': %f;%n", area); // 45.456700
		System.out.printf("7) Value of variable of type 'char': %c;%n", character); // A
		System.out.printf("8) Value of variable of type 'boolean': %b.%n", answer); // true

	}

}
