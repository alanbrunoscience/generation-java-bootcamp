package lesson04.operators;

public class Example06LogicalOperators {

	public static void main(String[] args) {
		
		/**
		 * Logical Operators
		 * 
		 * → Logical Operators are used to perform comparisons and validations, creating complex conditional expressions.
		 * 
		 * → These operators are used to create expressions of the type 'true' or 'false', but their operation is a little more complex.
		 * 
		 * *-----------------------------------------------------------------------------------------------------*
		 * |  Logical Operation          |  Operator  |  Description                                             |       
		 * *-----------------------------------------------------------------------------------------------------*
		 * |  Conjunction (Logical AND)  |     &&     |  Checks if both conditions are 'true'.                   |
		 * *-----------------------------------------------------------------------------------------------------*
		 * |  Disjunction (Logical OR)   |     ||     |  Checks if at least one of the two conditions is 'true'. |
		 * *-----------------------------------------------------------------------------------------------------*
		 * |  Negation (Logical          |     !      |  Inverts the value; what is 'true' becomes 'false', and  | 
		 * |  NOT)                       |            |  what is 'false' becomes 'true'.                         |
		 * *-----------------------------------------------------------------------------------------------------*
		 * 
		 */
		
		/**
		 * Logical Operators - Negation (! - NOT)
		 * 
		 * Negation Truth Table
		 * 
		 * *-----------*
		 * |  A  |  !A |       
		 * *-----------*
		 * |  T  |  F  |
		 * *-----------*
		 * |  F  |  T  | 
		 * *-----------*
		 * 
		 */
		
		int a = 10;
		int b = 5;
		boolean proposition01;
		boolean proposition02;
		boolean answer;
		
		System.out.println("*** Print Variable Values ***\n");
		System.out.printf("→ a = %d;\n", a);
		System.out.printf("→ b = %d.\n", b);
		
		
		System.out.println("\n*** Working With Logical Operators ***\n");

		proposition01 = a > b;
		System.out.printf("1) The 'proposition01' (%d > %d) is: %b;\n", a, b, proposition01); // true
		
		proposition02 = a < b;
		System.out.printf("2) The 'proposition02' (%d < %d) is: %b;\n", a, b, proposition02); // false
		
		answer = !proposition01;
		System.out.printf("3) The negation of 'proposition01' is: %b;\n", answer); // false
		
		answer = !proposition02;
		System.out.printf("4) The negation of 'proposition02' is: %b.\n", answer); // true

	}

}
