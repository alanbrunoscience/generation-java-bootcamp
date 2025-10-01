package lesson11.methods;

import java.util.Scanner;

public class Example02MethodWithoutReturn {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int n1, n2;

			System.out.println("*** Sum Calculator ***\n");

			System.out.print("1) Enter the first integer: ");
			n1 = input.nextInt();

			System.out.print("\n2) Enter the second integer: ");
			n2 = input.nextInt();

			sum(n1, n2);

		}

	}

	public static void sum(int n1, int n2) {
		System.out.printf("\n→ %d + %d = %d.\n", n1, n2, n1 + n2);
	}

}
