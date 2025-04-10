/* Método printf()
 * 
 * Sintaxe:
 * 
 * -> System.out.printf(expressão_de_controle, argumento1, argumento2, ...);
 * 
 * Códigos de Controle:
 * 
 * %c: Caractere simples (char);
 * %s: Cadeia de caracteres (String);
 * %d: Inteiro (int ou long);
 * %f: Real com ponto flutuante (float ou double);
 * %.2f: Real com ponto flutuante (float ou double), delimitando o número de dígitos que serão exibidos nas casas decimais. No exemplo ao lado,
 * serão exibidos 2 dígitos depois do ponto (separador de casas decimais).
 * %e: Número real em notação científica com o “e” minúsculo (float ou double);
 * %E: Número real em notação científica com o “E” maiúsculo (float ou double);
 * %%: Imprimir o próprio caractere %.
 */

package dataInput;

public class PrintF {
	
	public static void main(String[] args) {
			
		int quantidade = 1000;
		long identificador = 10000l;
		float altura = 25.4f; 
		double area = 45.4567;
		double tamanho = 650000000.00;
		char tipo = 'A';
		String palavra = "Generation";
		 
		System.out.printf("Variável quantidade = %d\n", quantidade);
		System.out.printf("Variável identificador = %d\n", identificador);
		System.out.printf("Variável altura = %.2f\n", altura);
		System.out.printf("Variável area = %.2f\n", area);
		System.out.printf("Variável tamanho = %e\n", tamanho);
		System.out.printf("Variável tamanho = %E\n", tamanho);
		System.out.printf("Variável tipo = %c\n", tipo);
		System.out.printf("Variável palavra = %s\n", palavra);
		
	}

}

/*
 * Caracteres de Escape
 * 
 * \n: Nova linha;
 * \t: Tabulação horizontal (o mesmo que pressionar a tecla Tab);
 * \r: "Retorno do carro". É um escape de controle, que move o cursor do Terminal para o inicio da linha;
 * \b: Backspace. Faz o papel da tecla Backspace do seu teclado: move o cursor uma posição ou excluí um único caractere 
 * a esquerda da linha;
 * \': Aspas simples;
 * \”: Aspas dupla;
 * \\: Barra invertida.
 * */
