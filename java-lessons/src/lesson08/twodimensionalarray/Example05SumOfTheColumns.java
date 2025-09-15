package lesson08.twodimensionalarray;

import java.util.Locale;
import java.util.Scanner;

public class Example05SumOfTheColumns {

	public static void main(String[] args) {

		/**
		 * Matrices Properties
		 * 
		 * * *------------------------------------------------------------------------*
		 * | Method                  | Description                                    |
		 * *--------------------------------------------------------------------------*
		 * | matriz.length           | Counts the number of arrays (rows) that the    |
		 * |                         | main matrix contains. Returns the NUMBER OF    |
		 * |                         | ROWS of a matrix.                              |
		 * *--------------------------------------------------------------------------*
		 * | matrix[rowIndex].length | Accesses the first array (the first row) and   | 
		 * |                         | counts the number of elements (columns) it     |
		 * |                         | contains. Returns the NUMBER OF COLUMNS of a   |
		 * |                         | matrix.                                        |
		 * *--------------------------------------------------------------------------*
		 */

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			int sum = 0;
			int numOfRows = 5;
			int numOfCols = 4;
			int columnSums[] = new int[numOfCols];
			int numbers[][] = new int[numOfRows][numOfCols];

			// Insert data into the matrix
			System.out.println("*** Inserting elements into the matrix ***\n");
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers[i].length; j++) {
					System.out.printf("→ Enter the element at position [%d][%d]: ", i, j);
					numbers[i][j] = input.nextInt();
				}
			}

			// Sum of the elements in columns
			for (int j = 0; j < numbers[0].length; j++) {
				for (int i = 0; i < numbers.length; i++) {
					sum += numbers[i][j];
				}
				columnSums[j] = sum;
				sum = 0;
			}

			// Print the elements of the array
			System.out.println("\n*** Two-Dimensional Array Elements ***\n");
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers[i].length; j++) {
					System.out.printf("→ Element at position [%d][%d]: %d\n", i, j, numbers[i][j]);
				}
			}

			// Print the sum of all elements in each column
			System.out.println("\n*** Sum Of All Elements In Each Column ***\n");
			for (int i = 0; i < numOfCols; i++) {
				System.out.printf("→ Sum of column '%d': %d\n", (i + 1), columnSums[i]);
			}
			
			// Print the number of matrix rows and columns
			System.out.println("\n*** Matrix Rows and Columns ***\n");
			System.out.printf("→ The matrix has %d rows and %d columns. "
					+ "So, the matrix is %d x %d.\n", numbers.length, numbers[0].length, 
					numbers.length, numbers[0].length);
		
		}

	}

}
