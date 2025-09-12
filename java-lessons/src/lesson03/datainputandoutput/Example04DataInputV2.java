package lesson03.datainputandoutput;

import java.util.Locale;
import java.util.Scanner;

public class Example04DataInputV2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// The 'try-with-resources' ensures that the Scanner is closed automatically
		try(Scanner input = new Scanner(System.in)) {
			
			// Variables declaration
			int quantity;
			long identifier;
			float height;
			double area;
			char type;
			String phrase;
			boolean active;
			
			// Data input
			System.out.printf("1) Enter a value to the '%s' variable (int): ", "quantity");
			quantity = input.nextInt();
			
			System.out.printf("2) Enter a value to the '%s' variable (long): ", "identifier");
			identifier = input.nextLong();
			
			System.out.printf("3) Enter a value to the '%s' variable (float): ", "height");
			height = input.nextFloat();
			
			System.out.printf("4) Enter a value to the '%s' variable (Double): ", "area");
			area = input.nextDouble();

			System.out.printf("5) Enter a value to the '%s' variable (char): ", "type");
			type = input.next().charAt(0);
			
			input.nextLine(); // It consumes the line break on the terminal buffer
			
			System.out.printf("6) Enter a value to the '%s' variable (String): ", "phrase");
			// input.skip("\\R?"); // Skip the line break before using nextLine()
			phrase = input.nextLine();
			
			System.out.printf("7) Enter a value to the '%s' variable (boolean): ", "active");
			active = input.nextBoolean();
			
			// Data output
			System.out.println("\n*** Received Data From Keyboard ***\n");
			System.out.printf("1) Value of '%s' variable: %d;\n", "quantity", quantity);
			System.out.printf("2) Value of '%s' variable: %d;\n", "identifier", identifier);
			System.out.printf("3) Value of '%s' variable: %.2f;\n", "height", height);
			System.out.printf("4) Value of '%s' variable: %.2f;\n", "area", area);
			System.out.printf("5) Value of '%s' variable: %c;\n", "type", type);
			System.out.printf("6) Value of '%s' variable: %s;\n", "phrase", phrase);
			System.out.printf("7) Value of '%s' variable: %b.\n", "active", active);
			
		}

	}

}
