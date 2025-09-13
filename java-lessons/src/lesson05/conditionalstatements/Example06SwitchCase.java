package lesson05.conditionalstatements;

import java.util.Locale;
import java.util.Scanner;

public class Example06SwitchCase {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int option;

		try (Scanner input = new Scanner(System.in)) {

			System.out.println("*** Options ***\n");
			System.out.println("1 - Book Recommendation;");
			System.out.println("2 - Motivational phrase;");
			System.out.print("3 - Music recommendation.\n\n→ ");
			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println("\n→ Book: 'Band of Brothers by Stephen E. Ambrose'.");
				break;
			case 2:
				System.out.println(
						"\n→ Motivational phrase: 'I never lose. Either I win, or I learn!' (Nelson Mandela).");
				break;
			case 3:
				System.out.println("\n→ Music: 'Go The Distance - One Voice Children's Choir Cover'.");
				break;
			}

		}

	}

}
