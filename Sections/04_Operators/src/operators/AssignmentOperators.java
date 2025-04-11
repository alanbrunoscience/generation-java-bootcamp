/**
 * Operadores de Atribuição
 * 
 * - Os Operadores de Atribuição têm como função retornar um valor atribuído de acordo com a operação indicada. A 
 * operação é feita entre os dois operandos, sendo atribuído o resultado ao primeiro.
 * 
 * = (Atribuição Simples);
 * 
 * += (Atribuição com Soma): x += y	-> x = x + y;
 * 
 * -= (Atribuição com subtração): x -= y -> x = x - y;
 * 
 * *= (Atribuição com multiplicação): x *= y -> x = x * y;
 * 
 * /= (Atribuição com divisão): x /= y -> x = x / y;
 * 
 * %= (Atribuição com módulo): x %= y -> x = x % y.
 */

package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 2;
		int c = 1;
		
		System.out.println("*** VALORES INICIAIS DAS VARIÁVEIS ***\n");
		System.out.printf("-> Valor inicial de a: %d;\n", a);
		System.out.printf("-> Valor inicial de b: %d;\n", b);
		System.out.printf("-> Valor inicial de c: %d.\n", c);
		System.out.println();
		
		
		System.out.printf("1) Atribuição Simples (c = b): c = %d;\n", (c = b));
		
		System.out.printf("2) Atribuição Com Soma (a = a + b | a += b): a = %d + %d -> a = %d;\n", a, b, (a += b));
		
		System.out.printf("3) Atribuição Com Subtração (a = a - c | a -= c): a = %d - %d -> a = %d;\n", a, c, (a -= c));
		
		System.out.printf("4) Atribuição Com Multiplicação (a = a * b | a *= b): a = %d * %d -> a = %d;\n", a, b, (a *= b));
		
		System.out.printf("5) Atribuição Com Divisão (a = a / b | a /= b): a = %d / %d -> a = %d;\n", a, b, (a /= b));
		
		System.out.printf("6) Atribuição Com Módulo (a = a %% b | a %%= b): a = %d %% %d -> a = %d.\n", a, b, (a %= b));
	}

}
