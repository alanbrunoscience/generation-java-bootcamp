package lesson07.arraysvectors;

import java.util.Locale;
import java.util.Scanner;

public class Example02StringsVector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Vector declaration
			String dogs[] = { "Golden Retriever", "Bulldog", "Chihuahua", "Poodle", "Yorkshire Terrier" };

			System.out.println("********** Dogs's List **********\n");
			for (int i = 0; i < dogs.length; i++) {
				if (i != dogs.length - 1)
					System.out.printf("→ %dº dog: %s;\n", (i + 1), dogs[i]);
				else
					System.out.printf("→ %dº dog: %s.\n", (i + 1), dogs[i]);
			}

		}

	}

}
