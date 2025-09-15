package lesson08.twodimensionalarray;

import java.util.Arrays;

public class Example01IntegersArray2D {

	public static void main(String[] args) {

		// Two-dimensional array declaration
		int integers[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };
		
		// Print elements of the array
		System.out.println(Arrays.deepToString(integers));

		// Arrays.deepToString() → Its primary purpose is to return a string representation of the 
		// "deep contents" of a specified array, particularly designed for handling multidimensional arrays.
		
	}

}
