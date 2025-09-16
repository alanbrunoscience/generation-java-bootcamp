package lesson09.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Example02ArrayListAndIterator {

	public static void main(String[] args) {
		
		/**
		 * Iterator Interface
		 * 
		 * → An Iterator is an interface used to iterate through elements of a collection (List, Set, Queue, etc.) 
		 * uniformly, without needing to know the collection's internal implementation.
		 * 
		 * → It's like a "cursor" that navigates element by element.
		 * 
		 * Main Methods of the Iterator
		 * 
		 * *--------------------------------------------------------------------------*
		 * | Method     | Description                                                 |
		 * *--------------------------------------------------------------------------*
		 * | hasNext()  | Returns 'true' if there are still elements to iterate over. |
		 * *--------------------------------------------------------------------------*
		 * | next()     | Returns the next element in the collection. It throws a     |
		 * |            | 'NoSuchElementException' if no other element is present.    |
		 * *--------------------------------------------------------------------------*
		 * | remove()   | Removes the last element returned by next().                |
		 * *--------------------------------------------------------------------------*
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		
		// Creates the Collection ArrayList, of type Double, called 'grades'
		ArrayList<Double> grades = new ArrayList<Double>();

		// Creates an Object of the Double Wrapper Class
		Double y = Double.valueOf(9);
		
		// Insert grades into ArrayList 'grades'
		grades.add(y);
		grades.add(7.0);
		grades.add(5.0);
		grades.add(4.0);
		grades.add(10.0);
		grades.add(4.0);
		
		// Display grades added in 'grades' through the For... Each loop
		System.out.println("*** Display Registered Grades - For... Each ***\n");
		int count = 1;
		for (Double grade : grades) {
			System.out.printf("→ %dº grade: %.2f\n", count, grade);
			count++;
		}
		
		// Display grades added in 'grades' through the For... Each loop
		System.out.println("\n*** Display Registered Grades - Iterator Interface ***\n");
		
		Iterator<Double> iGrades = grades.iterator();
		
		int count2 = 1;
		
		while (iGrades.hasNext()) {
			System.out.printf("→ %dº grade: %.2f\n", count2, iGrades.next());
			count2++;
		}
		
		/**
		 * .next() Method - 'Iterator' Interface
		 * 
		 * *----------------------*
		 * |  Position  |  Value  |
		 * *----------------------*
		 * |    [0]     |   9.0   |
		 * *----------------------*
		 * |    [1]     |   7.0   |
		 * *----------------------*
		 * |    [2]     |   5.0   |
		 * *----------------------*
		 * |    [3]     |   4.0   |
		 * *----------------------*
		 * |    [4]     |   10.0  |
		 * *----------------------*
		 * |    [5]     |   4.0   |
		 * *----------------------*
		 * 
		 * → The Iterator works like an index pointer that moves from drawer to drawer.
		 * 
		 * 1. Start: The Iterator points to position '-1' (before the first drawer);
		 * 2. hasNext(): It checks if the next drawer (index 0) exists. Yes, it does;
		 * 3. next(): It advances to drawer '0' and returns the value '9.0';
		 * 4. hasNext(): It checks if the next drawer (index 1) exists. Yes, it does;
		 * 5. next(): It advances to drawer '1' and returns the value '7.0';
		 * 6. And so on, until you reach the end of the list, when the next position no longer exists.
		 * 
		 */
		
	}

}
