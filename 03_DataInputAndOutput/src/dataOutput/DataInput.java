/**
 * Lendo as Instruções
 * 
 * - String next(): Faz a leitura, via teclado, de uma cadeia de caracteres simples, ou seja, que não usa o caractere
 * espaço em branco;
 * 
 * - next().charAt(0): Faz a leitura, via teclado, de um único caractere simples, exceto o caractere espaço em branco;
 * 
 * - String nextLine(): Faz a leitura, via teclado, de uma cadeia de caracteres, incluindo o caractere espaço em branco;
 * 
 * - int nextInt(): Faz a leitura, via teclado, de um número inteiro de 32 bits;
 * 
 * - long nextLong(): Faz a leitura, via teclado, de um número inteiro de 64 bits;
 * 
 * - float nextFloat(): Faz a leitura, via teclado, de um número em notação de ponto flutuante normalizada em precisão 
 * dupla de 32 bits (usado para receber valores reais);
 * 
 * - double nextDouble(): Faz a leitura, via teclado, de um número em notação de ponto flutuante normalizada em precisão 
 * dupla de 64 bits (usado para receber valores reais ou científicos);
 * 
 * - boolean nextBoolean(): Faz a leitura, via teclado, de um valor boolean (true ou false).
 */

package dataOutput;

import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int quantidade;
		long identificador;
		float altura;
		double area;
		char tipo;
		String frase;
		boolean ativo;
		
		System.out.print("Digite um valor para a variável quantidade (int): ");
		quantidade = input.nextInt();
		
		System.out.print("\nDigite um valor para a variável identificador (long): ");
		identificador = input.nextLong();
		
		System.out.print("\nDigite um valor para a variável altura (float): ");
		altura = input.nextFloat();
		
		System.out.print("\nDigite um valor para a variável area (double): ");
		area = input.nextDouble();
		
		System.out.print("\nDigite um valor para a variável tipo (char): ");
		tipo = input.next().charAt(0);
		
		System.out.print("\nDigite um valor para a variável frase (String): ");
		input.skip("\\R?"); // Se tiver uma quebra de linha no buffer, pule ela antes de continuar
		frase = input.nextLine();
		
		System.out.print("\nDigite um valor para a variável ativo (boolean): ");
		ativo = input.nextBoolean();
		
		System.out.println("\n\n*** Dados recebidos via teclado ***\n");
		
		System.out.println("Variável quantidade = " + quantidade);
		System.out.println("Variável identificador = " + identificador);
		System.out.println("Variável altura = " + altura);
		System.out.println("Variável area = " + area);
		System.out.println("Variável tipo = " + tipo);
		System.out.println("Variável palavra = " + frase);
		System.out.println("Variável tamanho = " + ativo);

	}

}
