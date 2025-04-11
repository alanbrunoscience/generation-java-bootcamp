/**
 * Operadores Relacionais
 * 
 * - Os Operadores Relacionais são utilizados para comparar valores entre variáveis e expressões do mesmo tipo e criar declarações 
 * condicionais. Esses operadores são usados com o intuito de criar expressões do tipo verdadeiro (TRUE) ou falso (FALSE), fundamentais 
 * para as declarações condicionais. O retorno da comparação é sempre um valor do tipo Lógico.
 * 
 * >: Maior do que;
 * 
 * >=: Maior do que ou igual;
 * 
 * <: Menor do que;
 * 
 * <=: Menor do que ou igual;
 * 
 * ==: Igual;
 * 
 * !=: Diferente.
 */

package operators;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 20;
		int d = 5;
		boolean resposta;
		
		System.out.println("*** VALORES DAS VARIÁVEIS ***\n");
		System.out.printf("-> Valor de 'a': %d;\n", a);
		System.out.printf("-> Valor de 'b': %d;\n", b);
		System.out.printf("-> Valor de 'c': %d;\n", c);
		System.out.printf("-> Valor de 'd': %d.\n", d);
		
		System.out.printf("\n*** TESTANDO OS OPERADORES RELACIONAIS ***\n");
		
		resposta = a > b;
		System.out.printf("\n-> a > b -> %d > %d? %s;\n", a, b, resposta);
		
		resposta = c >= b;
		System.out.printf("\n-> c >= b -> %d >= %d? %s;\n", c, b, resposta);
		
		resposta = a < c;
		System.out.printf("\n-> a < c -> %d < %d? %s;\n", a, c, resposta);
		
		resposta = c <= d;
		System.out.printf("\n-> c <= d -> %d <= %d? %s;\n", c, d, resposta);
		
		resposta = a == c;
		System.out.printf("\n-> a == c -> %d == %d? %s;\n", a, c, resposta);
		
		resposta = c != d;
		System.out.printf("\n-> c != d -> %d != %d? %s.\n", c, d, resposta);
		
	}

}
