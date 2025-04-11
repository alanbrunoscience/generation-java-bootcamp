/**
 * Operadores Lógicos - Disjunção
 * 
 * - Os Operadores Lógicos são utilizados para realizar comparações e validações, criando expressões condicionais complexas.
 * 
 * -> Disjunção (OU lógico) (||): Valida se um dos dois dados apresentados são verdadeiros, ou se os dois são verdadeiros. É escrito 
 * com palavra ou entre as duas proposições.
 */

package operators;

public class LogicalOperatorsDisjunction {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		boolean proposition01;
		boolean proposition02;
		boolean proposition03;
		boolean proposition04;
		boolean answer;
		
		System.out.println("*** Propositions ***\n");
		
		proposition01 = x > y;
		System.out.printf("1) %d > %d? %s;\n", x, y, proposition01);
		
		proposition02 = x < y;
		System.out.printf("2) %d < %d? %s;\n", x, y, proposition02);
		
		proposition03 = x != y;
		System.out.printf("3) %d != %d? %s;\n", x, y, proposition03);
		
		proposition04 = x == y;
		System.out.printf("4) %d == %d? %s.\n", x, y, proposition04);
		
		System.out.println("\n*** Disjunction ***\n");
		
		answer = proposition01 || proposition03;
		System.out.printf("1) Are propositions 01 and 03 true? %s;\n", answer);
		
		answer = proposition01 || proposition02;
		System.out.printf("2) Are propositions 01 and 02 true? %s;\n", answer);

		answer = proposition03 || proposition04;
		System.out.printf("3) Are propositions 03 and 04 true? %s;\n", answer);
		
		answer = proposition02 || proposition04;
		System.out.printf("4) Are propositions 02 and 04 true? %s.\n", answer);

	}

}
