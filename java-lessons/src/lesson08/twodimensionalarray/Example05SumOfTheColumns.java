package lesson08.twodimensionalarray;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Example05SumOfTheColumns {

	public static void main(String[] args) {

		/**
		 * Matrices Properties
		 * 
		 * * *------------------------------------------------------------------------*
		 * | Method | Description |
		 * *--------------------------------------------------------------------------*
		 * | matriz.length | Returns the NUMBER OF ROWS of a matrix, | | | where matrix
		 * is the name of the array. |
		 * *--------------------------------------------------------------------------*
		 * | matrix[rowIndex].length | Returns the NUMBER OF COLUMNS of a | | | matrix,
		 * where matrix is the name of the | | | array and rowIndex is a variable that |
		 * | | represents the row index in the repetition | | | structure. If the matrix
		 * has the same | | | number of rows and columns, you can use the | | |
		 * matrix.length method in both repetition | | | structures. |
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

		}

	}

}
