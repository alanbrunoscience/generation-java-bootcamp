package lesson04.operators;

public class Example04AssignmentOperators {

	public static void main(String[] args) {
		
		/**
		 * Assignment Operators
		 * 
		 * → Assignment Operators return a value assigned according to the indicated operation. The operation 
		 * is performed between two operands, with the result being assigned to the first.
		 * 
		 *
		 * *------------------------------------------------------------------*
		 * | Operator | Description                    | Example | Equivalent |
		 * *------------------------------------------------------------------*
		 * | =        | Simple Assignment              | x = y   | N/A        |
		 * | +=       | Assignment with Addition       | x += y  | x = x + y  |
		 * | -=       | Assignment with Subtraction    | x -= y  | x = x - y  |
		 * | *=       | Assignment with Multiplication | x *= y  | x = x * y  |
		 * | /=       | Assignment with Division       | x /= y  | x = x / y  |
		 * | %=       | Assignment with Modulus        | x %= y  | x = x % y  |
		 * *------------------------------------------------------------------*
		 *  
	 	 **/
		
		// Variables declaration
		int x = 4;
		int y = 2;
		int z = 1;
		
		System.out.println("*** Variables Information ***\n");
		System.out.printf("-> x = %d;\n", x);
		System.out.printf("-> y = %d;\n", y);
		System.out.printf("-> z = %d.\n", z);
		
		System.out.println("\n*** Examples With Assignment Operators ***");
		
		System.out.printf("\n1) Simple Assignment: z = y → y = %d → z = %d;\n", y, (z = y)); // z = 2
		System.out.printf("2) Assignment with sum: x = x + y → x = %d + %d → x = %d;\n", x, y, (x += y)); // x = 6
		System.out.printf("3) Assignment with subtraction: x = x - z → x = %d - %d → x = %d;\n", x, z, (x -= z)); // x = 4;
		System.out.printf("4) Assignment with multiplication: x = x * y → x = %d * %d → x = %d;\n", x, y, (x *= y)); // x = 8;
		System.out.printf("5) Assignment with division: x = x / y → x = %d / %d → x = %d;\n", x, y, (x /= y)); // x = 4;
		System.out.printf("6) Assignment with modulus: x = x %% y → x = %d %% %d → x = %d.\n", x, y, (x %= y));	// x = 0.

	}

}
