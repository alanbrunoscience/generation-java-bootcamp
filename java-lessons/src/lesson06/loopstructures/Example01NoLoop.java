package lesson06.loopstructures;

import java.util.Locale;
import java.util.Scanner;

public class Example01NoLoop {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String name1, name2, name3;

		try (Scanner input = new Scanner(System.in)) {

			System.out.print("1) Enter the first name: ");
			name1 = input.nextLine();
			System.out.printf("\n→ The first name is: %s.\n", name1);

			System.out.print("\n2) Enter the second name: ");
			name2 = input.nextLine();
			System.out.printf("\n→ The second name is: %s.\n", name2);

			System.out.print("\n3) Enter the third name: ");
			name3 = input.nextLine();
			System.out.printf("\n→ The third name is: %s.\n", name3);

		}

	}

}
