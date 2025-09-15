package lesson08.twodimensionalarray;

public class Example03TraversingTheMatrix {

	public static void main(String[] args) {

		// Two-dimensional declaration
		int integers[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		// Print the elements of the array

		// i - rows;
		// j - columns.

		System.out.println("*** Two-Dimensional Array Elements ***\n");
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[i].length; j++) {
				System.out.printf("→ Element at position [%d][%d]: %d\n", i, j, integers[i][j]);
			}
		}
	}

}
