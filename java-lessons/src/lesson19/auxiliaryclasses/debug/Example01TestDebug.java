package lesson19.auxiliaryclasses.debug;

import java.util.Scanner;

public class Example01TestDebug {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int[] arrayIntegers = new int[5];

			System.out.println("********** Data Input **********\n");
			for (int i = 0; i < arrayIntegers.length; i++) {
				System.out.printf("%d) Enter the integer for the position [%d]: ", (i + 1), i);
				arrayIntegers[i] = input.nextInt();
			}

			System.out.println("\n\n********** Data Output **********\n");
			for (int i = 0; i < arrayIntegers.length; i++) {
				if (i != arrayIntegers.length - 1) {
					System.out.printf("%d) Element of the position [%d] = %d;%n", (i + 1), i, arrayIntegers[i]);
				} else {
					System.out.printf("%d) Element of the position [%d] = %d.%n", (i + 1), i, arrayIntegers[i]);
				}

			}

		}

	}

}
