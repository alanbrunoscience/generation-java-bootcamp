package lesson10.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Example03Stack {

	public static void main(String[] args) {

		/**
		 * Stack
		 * 
		 * → A stack is a LIFO data structure: "The last element inserted into the stack
		 * is the first element to be removed from it." (Last In - First Out). The
		 * fundamental idea of ​​a stack is that we can only insert or remove an element
		 * from the top of the stack. This data structure is called a "stack" because it
		 * resembles a real-world stack, such as a stack of dishes, where the last dish
		 * inserted is the first to be removed.
		 * 
		 * → The two basic operations that can be performed on a stack are pushing an
		 * element onto the stack and popping an element from the stack.
		 * 
		 * - PUSH inserts an element onto the top of the stack; 
		 * 
		 * - POP removes the element from the top of the stack (returning it or not).
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * The Deque Collection as a Stack
		 * 
		 * → To implement the Stack data structure in Java, we use the 'Deque' (Double-Ended Queue) collection, which 
		 * allows manipulation of elements at both ends of the structure. By using 'Deque' as a stack, we follow the 
		 * 'LIFO (Last-In, First-Out)' principle, where the LAST ELEMENT INSERTED IS THE FIRST TO BE REMOVED.
		 * 
		 * Syntax:
		 * 
		 * Deque<T> stack = new ArrayDeque<T>();
		 * 
		 * → The above constructor creates an empty 'ArrayDeque' class object.
		 * 
		 * → The <T> item represents a generic type in Java (Java Generics), allowing you to define the type of object 
		 * that will be stored on the stack. This type must be a class — it can be a wrapper class (such as 'Integer', 
		 * 'Double', or 'String') or a custom class created by the developer.
		 * 
		 * 💡 Tip
		 * 
		 * → Although the class name is 'ArrayDeque', when used with the appropriate methods ('push', 'pop', 'peek'), 
		 * it behaves like a modern and efficient stack.
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * Why use the 'ArrayDeque' class?
		 * 
		 * → The 'ArrayDeque' class is a modern alternative to the old 'Stack' class, which is considered legacy 
		 * (obsolete for new projects). It is implemented internally with a resizable array, offering superior 
		 * performance in most scenarios.
		 * 
		 * → Unlike the 'Stack', which inherits from Vector (a synchronized and heavier structure), the 'ArrayDeque'
		 * is UNSYNCHRONIZED and therefore LIGHTER and FASTER in 'single-threaded' execution contexts (when accessed
		 * by a single thread).
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * ⚠️ Note
		 * 
		 * → 'Single-threaded' means that the program executes one task at a time, in a single thread;
		 * 
		 * → 'Multi-threaded' means that the program can execute more than one task simultaneously, in multiple threads.
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * → Furthermore, the 'ArrayDeque' is versatile: it can be used as a 'queue' or a 'stack', depending on the 
		 * methods we choose to use.
		 * 
		 * → The 'ArrayDeque' collection doesn't offer index access like the 'ArrayList' collection, as it doesn't 
		 * implement the 'List' interface, but rather the 'Deque' interface. Therefore, the 'get(index)' method isn't 
		 * directly available on the ArrayDeque.
		 * 
		 * → If you need to access elements by index, you must first convert the structure to an array using the
		 * 'toArray()' method, or to a list by creating a new 'ArrayList' instance from the 'deque' 
		 * ('new ArrayList<>(deque)'). It's worth noting that these conversions create a copy of the elements, 
		 * which can impact efficiency depending on the use case.
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * Main Methods of the Collection 'Deque' (Stack Mode)
		 * 
		 * *---------------------------------------------------------------------------------------------------*
		 * | Method             | Description                                                                  |
		 * *---------------------------------------------------------------------------------------------------*
		 * | push(element)      | Adds a new element to the top of the stack.                                  |
		 * *---------------------------------------------------------------------------------------------------*
		 * | pop()              | Removes and returns the top element of the stack.                            |
		 * *---------------------------------------------------------------------------------------------------*
		 * | peek()             | Returns, without removing, the top element of the stack.                     |
		 * *---------------------------------------------------------------------------------------------------*
		 * | size()             | Returns the total number of elements of the stack.                           |
		 * *---------------------------------------------------------------------------------------------------*
		 * | clear()            | Removes all elements of the stack.                                           |
		 * *---------------------------------------------------------------------------------------------------*
		 * | isEmpty()          | Checks if the stack is empty.                                                |
		 * *---------------------------------------------------------------------------------------------------*
		 * | contains(element)  | Checks if the stack contains the specified element.                          |
		 * *---------------------------------------------------------------------------------------------------*
		 * | toArray()          | Returns an array with all the elements of the stack (useful for iteration).  |
		 * *---------------------------------------------------------------------------------------------------*
		 * 
		 */

		// Declaring the Stack Collection
		Deque<String> stack = new ArrayDeque<>();
		
		// Variable to identify the position of the element in the stack
		int count = 0;

		// Add elements to the top of the stack
		stack.push("Green Dish");
		stack.push("Blue Dish");
		stack.push("White Dish");
		stack.push("Yellow Dish");
		stack.push("Red Dish");

		System.out.println("*** Working With Stack ***");

		// Displays elements added to the stack from top to bottom
		System.out.println("\n1) Stack's Elements (top → bottom):\n");
		count = stack.size();
		
		for (String dish : stack) {
			System.out.printf("→ %dº dish: %s%n", count, dish);
			count--;
		}
		
		// Removes the element from the top of the stack
		System.out.printf("\n2) Remove the element: %s;\n", stack.pop());

		// Displays the stack's elements after removal
		System.out.println("\n3) Current Stack Elements (top → bottom):\n");
		count = stack.size();
		
		for (String dish : stack) {
			System.out.printf("→ %dº dish: %s%n", count, dish);
			count--;
		}
		
		// Removes one more element from the top of the stack
		System.out.printf("\n4) Remove the element: %s;\n", stack.pop());
		
		// Displays the stack's elements after new removal
		System.out.println("\n5) Current Stack Elements (top → bottom):\n");
		count = stack.size();
		
		for (String dish : stack) {
			System.out.printf("→ %dº dish: %s%n", count, dish);
			count--;
		}
		
		// Pops the current top element of the stack without removing it
		System.out.printf("\n6) Element at the top of the stack: %s;\n", stack.peek());
		
		// Adds a new element at the top of the stack
		System.out.printf("\n7) Add a new element in the stack: %s;\n", "Purple Dish");
		stack.push("Purple Dish");
		
		// Displays the stack's elements after updating it
		System.out.println("\n8) Updated Stack (top → bottom):\n");
		count = stack.size();
		
		for (String dish : stack) {
			System.out.printf("→ %dº dish: %s%n", count, dish);
			count--;
		}
		
		// Displays the current size of the stack
		System.out.printf("\n9) Size of the stack (total number of elements inserted): %d;\n", stack.size());
		
		// Checks if the stack contains a specific element
		System.out.printf("\n10) Is there a 'Green Dish' in the stack? %b;\n", stack.contains("Green Dish"));
		
		// Displays all stack elements per iteration
		Iterator<String> iDishes = stack.iterator();
		count = stack.size();

		System.out.println("\n11) Displays All Stack Elements Per Iteration:\n");
		while (iDishes.hasNext()) {
		    String dish = iDishes.next();
		    System.out.printf("→ %dº dish: %s%n", count, dish);
		    count--; 
		}
		
		// Clear all the elements from the stack
		System.out.printf("\n12) Cleaning the stack...\n");
		stack.clear();
		
		// Checks if the stack is empty
		System.out.printf("\n13) Is the Stack empty? %b.\n", stack.isEmpty());			
		
	}

}
