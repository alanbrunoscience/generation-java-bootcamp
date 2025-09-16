package lesson09.collections;

import java.util.ArrayList;
import java.util.Locale;

public class Example01ArrayList {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/**
		 * ArrayList
		 * 
		 * → An ArrayList collection is the natural choice when you need a resizable array. It is much more 
		 * efficient for reading because it's internally implemented with arrays, making it ideal for random 
		 * access to stored data:
		 * 
		 * ArrayList<T> grades = new ArrayList<T>();
		 * 
		 * → The default no-argument constructor creates a new, empty ArrayList object.
		 * 
		 * → In Java, <T> represents a Java Generic Type. It is used to define the type of object that will be 
		 * stored in the collection. The data type must be an object, which can be a Wrapper Class or a class 
		 * created by the developer.
		 * 
		 * import java.util.ArrayList;
		 * ArrayList<String> cities = new ArrayList<String>();
		 * 
		 * ----------------------------------------------------------------------------------------------------
		 * 
		 * Main Methods of the List Interface
		 * 
		 * *------------------------------------------------------------------------------------------*
		 * | Method                                | Description                                      |
		 * *------------------------------------------------------------------------------------------*
		 * | add(Object)                           | Adds an object to the end of the list.           |
		 * *------------------------------------------------------------------------------------------*
		 * | add(Index, Object)                    | Adds an object at the specified position         |
		 * |                                       | (pushes existing elements forward).              |
		 * *------------------------------------------------------------------------------------------*
		 * | get(Index)                            | Retrieves an object by its index.                |
		 * *------------------------------------------------------------------------------------------*
		 * | indexOf(Object)                       | Searches for an object and returns the index     |
		 * |                                       | of the first occurrence.                         |
		 * *------------------------------------------------------------------------------------------*
		 * | set(Index, Object)                    | Replaces the object at the position specified    |
		 * |                                       | in the first parameter with the object passed in |
		 * |                                       | the second parameter.                            |
		 * *------------------------------------------------------------------------------------------*
		 * | remove(Index)                         | Deletes the object stored at the specified index.|
		 * *------------------------------------------------------------------------------------------*
		 * | remove(Object)                        | Deletes the object passed as a method parameter. |
		 * *------------------------------------------------------------------------------------------*
		 * | clear()                               | Clears the list.                                 |
		 * *------------------------------------------------------------------------------------------*
		 * | size()                                | Returns the size of the list (the number of      |
		 * |                                       | elements stored).                                |
		 * *------------------------------------------------------------------------------------------*
		 * | isEmpty()                             | Returns 'true' if the list is empty.             |
		 * *------------------------------------------------------------------------------------------*
		 * | contains(Object)                      | Returns 'true' if an occurrence of the element   |
		 * |                                       | exists in the list.                              |
		 * *------------------------------------------------------------------------------------------*
		 * | sort(null)                            | Sorts the list elements in ascending order.      |
		 * *------------------------------------------------------------------------------------------*
		 * | sort(Comparator.reverseOrder())       | Sorts the list elements in descending order.     |
		 * *------------------------------------------------------------------------------------------*
		 * 
		 */
		
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
		
		System.out.println("****** Working With ArrayList ******\n");
		
		// Displays grades added in 'grades'
		System.out.printf("→ Grades registered: %s;\n", grades); // [9.0, 7.0, 5.0, 4.0, 10.0, 4.0]
		
		/*
		 * Displays the position (index) of a given grade.
		 * If there are two identical grades, the position of the first grade found will be displayed.
		 */
		System.out.printf("\n→ The position of the first occurrence of '%.2f' on list is: %d;\n", 4.0, grades.indexOf(4.0)); // 3
		
		// Displays whether a given grade exists in the list
		System.out.printf("\n→ Is grade '%.2f' on the list? %b;\n", 5.0, grades.contains(5.0)); // true
		
		// Displays the registered grade in a determined position (index)
		System.out.printf("\n→ At the position '%d', the registered grade is: %.2f;\n", 4, grades.get(4)); // 10.00
		
		// Changes the grade 5.0 to 6.0 and shows that the change was made
		System.out.printf("\n→ Previous grades: %s;\n", grades); // [9.0, 7.0, 5.0, 4.0, 10.0, 4.0]
		
		grades.set(grades.indexOf(5d), 6.0d);
		System.out.printf("→ The grade '%.2f' was changed to '%.2f': %s;\n", 5d, 6.0d, grades); // [9.0, 7.0, 6.0, 4.0, 10.0, 4.0]
		
		// Remove grade '4.0' and show that the deletion was successful. Note that only the first grade '4.0' was deleted.
		grades.remove(grades.indexOf(4.0));
		System.out.printf("\n→ The grade '%.2f' was removed: %s;\n", 4.0, grades); // [9.0, 7.0, 6.0, 10.0, 4.0]
		
		// Checks if the list is empty
		System.out.printf("\n→ Is the list empty? %b;\n", grades.isEmpty()); // false
		
		// Displays the size of the list (number of elements)
		System.out.printf("\n→ The list size is: %d;\n", grades.size()); // 5
		
		// Clears the list and shows that it is empty
		grades.clear();
		System.out.printf("\n→ The list is empty: %s.\n", grades); // []
		
	}

}
