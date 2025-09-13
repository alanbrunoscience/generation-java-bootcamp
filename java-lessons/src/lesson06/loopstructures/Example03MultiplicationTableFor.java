package lesson06.loopstructures;

import java.util.Locale;
import java.util.Scanner;

public class Example03MultiplicationTableFor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int num;

		try (Scanner input = new Scanner(System.in)) {

			System.out.print("→ Enter the number of the multiplication table you want to view: ");
			num = input.nextInt();

			System.out.printf("\n*** Multiplication Table of %d ***\n\n", num);

			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d * %d = %d\n", num, i, (num * i));
			}

		}

	}
}
