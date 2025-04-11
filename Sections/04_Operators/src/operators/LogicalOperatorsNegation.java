/**
 * Operadores Lógicos - Negação
 * 
 * - Os Operadores Lógicos são utilizados para realizar comparações e validações, criando expressões condicionais complexas.
 *  
 * -> Negação (NÃO lógico) (!): Inverte o valor, o que é verdadeiro passa a ser falso, o que é falso passa a ser verdadeiro. É a 
 * negação de uma sentença. É escrito com a palavra nao antes da proposição.
 */

package operators;

public class LogicalOperatorsNegation {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		boolean proposition01;
		boolean proposition02;
		boolean answer;
		
		proposition01 = x > y;
		System.out.printf("1) %d > %d? %s;\n", x, y, proposition01);
		
		proposition02 = x < y;
		System.out.printf("2) %d < %d? %s.\n", x, y, proposition02);
		
		System.out.println("\n*** Negation ***\n");
		
		answer = !proposition01;
		System.out.printf("1) !(%d > %d) = %s;\n", x, y, answer);
		
		answer = !proposition02;
		System.out.printf("2) !(%d < %d) = %s.\n", x, y, answer);
	}

}
