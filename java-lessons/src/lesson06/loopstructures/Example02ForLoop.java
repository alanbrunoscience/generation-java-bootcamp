package lesson06.loopstructures;

import java.util.Locale;
import java.util.Scanner;

public class Example02ForLoop {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String name;

		try (Scanner input = new Scanner(System.in)) {

			for (int i = 0; i < 3; i++) {
				System.out.printf("%d) Enter the %dº name: ", i + 1, i + 1);
				name = input.nextLine();
				System.out.printf("\n→ The %dº name is: %s.\n\n", i + 1, name);
			}

		}

	}

}
