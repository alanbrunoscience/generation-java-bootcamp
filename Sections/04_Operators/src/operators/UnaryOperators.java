/**
 * Operadores Unários
 * 
 * - Os Operadores Unários são operadores aritméticos que desempenham uma ação em um único operando, ou seja, usa uma 
 * única variável.
 * 
 * -Numero: Número Negativo;
 * ++x: Pré-Incremento;
 * --x: Pré-Decremento;
 * x++: Pós-Incremento;
 * x--: Pós-Decremento;
 * 
 * - Quando escrevemos o operador ++ ou -- antes de uma variável, isso é chamado de pré-incremento e pré-decremento 
 * respectivamente. Nestes casos, o incremento ou decremento é feito primeiro e depois o novo valor incrementado ou 
 * decrementado é retornado.
 * 
 * - Quando escrevemos o operador ++ ou -- após uma variável, ele é chamado de pós-incremento e pós-decremento 
 * respectivamente. Nestes casos, o operador primeiro retorna o valor do operando e, ao final, é feito um incremento ou 
 * decremento.
 */

package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		int c = 6;
		int d = 4;
		int e = 40;
		int f = 30;
		int g = 20;
		int h = 10;
		int i = 5;
		
		System.out.printf("1) Transformar %d em número negativo = %d;\n", i, (-i));
		
		System.out.printf("\n2) Pré-Incrementar: a = ++b\n");
		System.out.printf("\n-> Valor atual de a: %d;\n", a);
		System.out.printf("-> Valor atual de b: %d;\n", b);
		a = ++b;
		System.out.printf("-> Novo valor de a: %d;\n", a);
		System.out.printf("-> Novo valor de b: %d.\n", b);
		
		System.out.printf("\n3) Pré-Decrementar: c = --d\n");
		System.out.printf("\n-> Valor atual de c: %d;\n", c);
		System.out.printf("-> Valor atual de d: %d;\n", d);
		c = --d;
		System.out.printf("-> Novo valor de c: %d;\n", c);
		System.out.printf("-> Novo valor de d: %d.\n", d);
		
		
		System.out.printf("\n4) Pós-Incrementar: e = f++\n");
		System.out.printf("\n-> Valor atual de e: %d;\n", e);
		System.out.printf("-> Valor atual de f: %d;\n", f);
		e = f++;
		System.out.printf("-> Novo valor de e: %d;\n", e);
		System.out.printf("-> Novo valor de f: %d.\n", f);
		
		System.out.printf("\n4) Pós-Decrementar: g = h--\n");
		System.out.printf("\n-> Valor atual de g: %d;\n", g);
		System.out.printf("-> Valor atual de h: %d;\n", h);
		g = h--;
		System.out.printf("-> Novo valor de g: %d;\n", g);
		System.out.printf("-> Novo valor de h: %d.\n", h);

	}

}

/**
 * Nota Importante:
 * 
 * - Observe que nos Operadores de Pré-Incremento e Pré-Decremento, a variável da direita é incrementada ou decrementada 
 * e na sequência a variável da esquerda recebe o novo valor da variável da direita, enquanto nos Pós-Incremento e 
 * Pós-Decremento a variável da esquerda recebe o valor original da variável da direita e na sequência a variável da 
 * direita é incrementada ou decrementada.
 */