package lesson04.operators;

public class Example08Disjunction {

	public static void main(String[] args) {
		
		/**
		 * Disjunction Truth Table (|| - OR)
		 * 
		 * *----------------------*
		 * |  A  |  B  |  A || B  |    
		 * *----------------------*
		 * |  T  |  T  |    T     |
		 * *----------------------*
		 * |  T  |  F  |    T     | 
		 * *----------------------*
		 * |  F  |  T  |    T     |
		 * *----------------------*
		 * |  F  |  F  |    F     |
		 * *----------------------*
		 * 
		 */
		
		int a = 10;
		int b = 5;
		boolean proposition01;
		boolean proposition02;
		boolean proposition03;
		boolean proposition04;
		boolean answer;
		
		System.out.println("*** Print Variable Values ***\n");
		System.out.printf("→ a = %d;\n", a);
		System.out.printf("→ b = %d.\n", b);
		
		
		System.out.println("\n*** Working With Logical Operators ***\n");

		proposition01 = a > b;
		System.out.printf("1) The 'proposition01' (%d > %d) is: %b;\n", a, b, proposition01); // true
		
		proposition02 = a < b;
		System.out.printf("2) The 'proposition02' (%d < %d) is: %b;\n", a, b, proposition02); // false
		
		proposition03 = a != b;
		System.out.printf("3) The 'proposition03' (%d != %d) is: %b;\n", a, b, proposition03); // true
		
		proposition04 = a == b;
		System.out.printf("4) The 'proposition04' (%d == %d) is: %b;\n", a, b, proposition04); // false
		
		System.out.println("\n*** Disjunction ***\n");
		
		answer = proposition01 || proposition03;
		System.out.printf("→ 'proposition01' || 'proposition03' are true? %b;\n", answer); // true
		
		answer = proposition01 || proposition02;
		System.out.printf("→ 'proposition01' || 'proposition02' are true? %b;\n", answer); // true
		
		answer = proposition03 || proposition04;
		System.out.printf("→ 'proposition03' || 'proposition04' are true? %b;\n", answer); // true
		
		answer = proposition02 || proposition04;
		System.out.printf("→ 'proposition02' || 'proposition04' are true? %b.\n", answer); // false

	}

}
