package lesson04.operators;

public class Example05RelationalOperators {

	public static void main(String[] args) {
		
		/**
		 * Relational Operators
		 * 
		 * → Relational Operators are used to compare values ​​between variables and expressions of the same type
		 * and to create conditional statements. These operators are used to create expressions of the type 'true'
		 * or 'false', essential for conditional statements. The return value of the comparison is always a value 
		 * of the logical type.
		 * 
		 * *-------------------------------------------*
		 * | Operator | Description                    |
		 * *-------------------------------------------*
		 * | >        | Greater than                   |
		 * | >=       | Greater than or equal to       |
		 * | <        | Less than                      |
		 * | <=       | Less than or equal to          |
		 * | ==       | Equal to                       |
		 * | !=       | Not equal to                   |
		 * *-------------------------------------------*
		 * 
		 */
		
		// Variables declaration
		int w = 5;
		int x = 10;
		int y = 5;
		int z = 20;
		boolean answer;
		
		// Data output
		System.out.println("*** Print Variable Values ***\n");
		System.out.printf("→ w = %d;\n", w);
		System.out.printf("→ x = %d;\n", x);
		System.out.printf("→ w = %d;\n", y);
		System.out.printf("→ z = %d.\n", z);
		
		System.out.println("\n*** Working With Relational Operators ***\n");
		
		answer = x > y;
		System.out.printf("1) %d > %d? %b;\n", x, y, answer); // 10 > 5? true;

		answer = z >= y;
		System.out.printf("2) %d >= %d? %b;\n", z, y, answer); // 20 >= 5? true;
		
		answer = x < z;
		System.out.printf("3) %d < %d? %b;\n", x, z, answer); // 10 < 20? true;
		
		answer = z <= w;
		System.out.printf("4) %d <= %d? %b;\n", z, w, answer); // 20 <= 5? false;
		
		answer = x == z;
		System.out.printf("5) %d == %d? %b;\n", x, z, answer); // 10 == 20? false;
		
		answer = z != w;
		System.out.printf("6) %d != %d? %b.\n", z, w, answer); // 20 != 5? true.
		
	}

}
