package lesson02.variablesandconstants;

public class Example04Constants {

	public static void main(String[] args) {
		
		// Constants declaration (final + data type + identifier = value)
		
		// Integer Types
		final byte BIT = 127;
		final short VALUE = 254;
		final int QUANTITY = 1000;
		final long IDENTIFIER = 10000l;
		
		// Real Types
		final float HEIGHT = 25.4f;
		final double AREA = 45.4567;
		
		// Non-numerical types
		final char CHARACTER = 'A';
		final boolean ANSWER = true;
		
		/*
		 * Final Keyword
		 * 
		 * - In Java, we can use final keyword with variables, methods, and classes. When the final keyword is 
		 * used with a variable, the value of the variable cannot be changed.
		 * 
		 * So, the following statement is not possible, for example:
		 * 
		 * QUANTITY = 128; // ❌
		 * 
		 * Error: The final local variable QUANTITY cannot be assigned. It must be blank and not 
		 * using a compound assignment.
		 * 
		 */
	
		// Printing Constants Value
		System.out.printf("1) Value of constant of type 'byte': %d;%n", BIT); // 127
		System.out.printf("2) Value of constant of type 'short': %d;%n", VALUE); // 254
		System.out.printf("3) Value of constant of type 'int': %d;%n", QUANTITY); // 1000
		System.out.printf("4) Value of constant of type 'long': %d;%n", IDENTIFIER); // 10000
		System.out.printf("5) Value of constant of type 'float': %f;%n", HEIGHT); // 25.400000
		System.out.printf("6) Value of constant of type 'double': %f;%n", AREA); // 45.456700
		System.out.printf("7) Value of constant of type 'char': %c;%n", CHARACTER); // A
		System.out.printf("8) Value of constant of type 'boolean': %b.%n", ANSWER); // true
		
	}

}
