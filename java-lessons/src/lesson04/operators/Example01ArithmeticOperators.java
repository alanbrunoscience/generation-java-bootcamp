package lesson04.operators;

public class Example01ArithmeticOperators {

	public static void main(String[] args) {
		
		/**
		 * Arithmetic Operators
		 * 
		 * *----------------------------------------------------------------------------------------*
		 * |  Operator   |  Operation              |  Example                                       |
		 * *----------------------------------------------------------------------------------------*
		 * |      +      |  Addition               |  a + b                                         |
		 * *----------------------------------------------------------------------------------------*
		 * |      -      |  Subtraction            |  a - b                                         |
		 * *----------------------------------------------------------------------------------------*
		 * |      *      |  Multiplication         |  a * b                                         |
		 * *----------------------------------------------------------------------------------------*
		 * |      /      |  Division               |  a / b                                         |
		 * *----------------------------------------------------------------------------------------*
		 * |             |                         |  x % 2                                         |
		 * |      %      |  Modulus or Remainder   |  If there is a remainder in the division, the  |
		 * |             |                         |  result is 1. If there is no remainder, the    |
		 * |             |                         |  result is 0.                                  |
		 * *----------------------------------------------------------------------------------------*                                
		 * 
		 * Arithmetic Operators follow common mathematical rules:
		 * 
		 * → Expressions within parentheses are always resolved before expressions outside the parentheses;
		 * 
		 * → When a parenthesis is within another, the solution always starts from the innermost parenthesis 
		 * to the outermost (from inside to outside);
		 * 
		 * → When two or more expressions have the same priority, the solution always starts from the leftmost
		 * expression to the rightmost.
		 * 
		 * *----------------------------------------------------*
		 * |  Operator   |  Operation              |  Priority  |
		 * *----------------------------------------------------*
		 * |      /      |  Division               |  2         |
		 * *----------------------------------------------------*
		 * |      *      |  Multiplication         |  2         |
		 * *----------------------------------------------------*
		 * |      +      |  Addition               |  3         |
		 * *----------------------------------------------------*
		 * |      -      |  Subtraction            |  3         |
		 * *----------------------------------------------------*
		 *  
	 	 **/
		
		// Variables declaration
		int x = 4;
		int y = 2;
		int z = 3;
		int w = -5;
		
		// Processing and data output
		System.out.println("*** Mathematical Operations ***\n");
		System.out.printf("1) %d + %d = %d;\n", x, y, (x + y));
		System.out.printf("2) %d + (%d) = %d;\n", x, w, (x + w));
		System.out.printf("3) %d - %d = %d;\n", x, y, (x - y));
		System.out.printf("4) %d * %d = %d;\n", x, y, (x * y));
		System.out.printf("5) %d / %d = %d;\n", x, y, (x / y));
		System.out.printf("6) %d %% 2 = %d;\n", x, (x % 2));
		System.out.printf("7) %d %% 2 = %d.\n", z, (z % 2));
		
	}

}