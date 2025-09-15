package lesson08.twodimensionalarray;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Example04InsertDataMatrix {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			// Two-dimensional array declaration
			int numbers[][] = new int[3][3];

			// Insert data into the matrix
			System.out.println("*** Inserting elements into the matrix ***\n");
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers[i].length; j++) {
					System.out.printf("→ Enter the element at position [%d][%d]: ", i, j);
					numbers[i][j] = input.nextInt();
				}
			}
			
			// Print the elements of the array
			System.out.println("\n*** Two-Dimensional Array Elements ***\n");
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers[i].length; j++) {
					System.out.printf("→ Element at position [%d][%d]: %d\n", i, j, numbers[i][j]);
				}
			}
			
			// System.out.println(Arrays.deepToString(numbers));

		}

	}

}
