package lesson04.operators;

public class Example03UnaryOperators {

	public static void main(String[] args) {
		
		/**
		 * Unary Operators
		 * 
		 * → Unary Operators are arithmetic operators that perform an action on a single operand, that is, 
		 * they use a single variable.
		 * 
		 * *---------------------------------------*
		 * |  Operator   |  Operation              |
		 * *---------------------------------------*
		 * |  -Number    |  Negative Number        |
		 * *---------------------------------------*
		 * |  ++x        |  Pre-Increment          |
		 * *---------------------------------------*
		 * |  --x        |  Pre-Decrement          |
		 * *---------------------------------------*
		 * |  x++        |  Post-Increment         |
		 * *---------------------------------------*
		 * |  x--        |  Post-Decrement         |
		 * *---------------------------------------*                               
		 * 
		 * → When we write the '++' or '--' operator before a variable, this is called 'pre-increment' and 
		 * 'pre-decrement', respectively. In these cases, the increment or decrement is performed first, 
		 * and then the newly incremented or decremented value is returned.
		 * 
		 * → When we write the '++' or '--' operator after a variable, it is called post-increment and 
		 * post-decrement, respectively. In these cases, the operator first returns the operand's value, 
		 * and then either increments or decrements it.
		 *  
	 	 **/
		
		// Variables declaration
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// Data output
		System.out.println("*** Variables Information ***\n");
		System.out.printf("-> num1 = %d;\n", num1);
		System.out.printf("-> num2 = %d;\n", num2);
		System.out.printf("-> num3 = %d;\n", num3);
		System.out.printf("-> num4 = %d;\n", num4);
		System.out.printf("-> num5 = %d.\n", num5);
		
		System.out.println("\n*** Operations ***\n");
		System.out.printf("1) Transforming '%d' ('%s') to a negative number: %d;\n", num1, "num1", (-num1)); // -1
		System.out.printf("2) Pre-increment the number '%d' ('%s'): %d (++num2);\n", num2, "num2",(++num2)); // 3
		System.out.printf("3) Pre-decrement the number '%d' ('%s'): %d (--num3);\n", num3, "num3",(--num3)); // 2
		
		int oldNum4 = num4;
		num4++;
		
		System.out.printf("4) Post-increment the number '%d' ('%s'): %d (num4++);\n", oldNum4, "num4", num4); // 5
		
		int oldNum5 = num5;
		num5--;
		
		System.out.printf("5) Post-decrement the number '%d' ('%s'): %d (num5--).\n", oldNum5, "num5", num5); // 4

	}

}
