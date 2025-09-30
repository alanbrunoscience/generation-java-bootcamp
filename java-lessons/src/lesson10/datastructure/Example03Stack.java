package lesson10.datastructure;

import java.util.Iterator;
import java.util.Stack;

public class Example03Stack {

	public static void main(String[] args) {

		/**
		 * Stack
		 * 
		 * → A stack is a LIFO data structure: "The last element inserted into the stack
		 * is the first element to be removed from it." (Last In - First Out). The
		 * fundamental idea of ​​a stack is that we can only insert or remove an element
		 * from the top of the stack. This data structure is called a "stack" because it
		 * resembles a real-world stack, such as a stack of plates, where the last plate
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
		 * that will be stored on the stack. This type must be a class—it can be a wrapper class (such as 'Integer', 
		 * 'Double', or 'String') or a custom class created by the developer.
		 * 
		 * 💡 Tip
		 * 
		 * → Although the class name is 'ArrayDeque', when used with the appropriate methods ('push', 'pop', 'peek'), 
		 * it behaves like a modern and efficient stack.
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * Why use the ArrayDeque class?
		 * 
		 * → The ArrayDeque class is a modern alternative to the old Stack class, which is considered legacy 
		 * (obsolete for new projects). It is implemented internally with a resizable array, offering superior 
		 * performance in most scenarios.
		 * 
		 * → Unlike the 'Stack', which inherits from 'Vector' (a synchronized and heavier structure), the 'ArrayDeque' 
		 * is ASYNCHRONOUS and therefore LIGHTER and FASTER in 'single-threaded' execution contexts, such as Java.
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
		 * → Furthermore, the 'ArrayDeque' is versatile: it can be used as a queue or a stack, depending on the methods 
		 * we choose to use.
		 * 
		 * → The 'ArrayDeque' collection doesn't offer index access like the 'ArrayList' collection, as it doesn't 
		 * implement the 'List' interface, but rather the 'Deque' interface. Therefore, the 'get(index)' method isn't 
		 * directly available on the 'ArrayDeque'.
		 * 
		 * → If you need to access elements by index, you must first convert the structure to an array using the
		 * 'toArray()' method, or to a list by creating a new 'ArrayList' instance from the 'deque' 
		 * ('new ArrayList<>(deque)'). It's worth noting that these conversions create a copy of the elements, 
		 * which can impact efficiency depending on the use case.
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * Main Methods of the Collection Deque (Stack Mode)
		 * 
		 * *--------------------------------------------------------------------------------------------*
		 * | Method            | Description                                                            |
		 * *--------------------------------------------------------------------------------------------*
		 * | push()            | This method is used to add an element to the top of the stack.         |
		 * *--------------------------------------------------------------------------------------------*
		 * | size()            | This method is used to return the size of the stack.                   |
		 * *--------------------------------------------------------------------------------------------*
		 * | clear()           | This method is used to remove all elements from the stack.             |
		 * *--------------------------------------------------------------------------------------------*
		 * | pop()             | This method is used to remove and return the element at the top of the |  
		 * |                   | stack.                                                                 |
		 * *--------------------------------------------------------------------------------------------*
		 * | isEmpty()         | This method is used to check if the stack is empty or not. It returns  |
		 * |                   | 'true' if the stack is empty, otherwise 'false'.                       |
		 * *--------------------------------------------------------------------------------------------*
		 * | contains(element) | This method is used to check if the stack contains the given element   | 
		 * |                   | or not. It returns 'true' if the stack contains the element, otherwise |
		 * |                   | 'false'.                                                               |
		 * *--------------------------------------------------------------------------------------------*
		 * | peek()            | This method is used to retrieve, without removing, the element at the  | 
		 * |                   | top of the stack, or return null if the stack is empty.                |
		 * *--------------------------------------------------------------------------------------------*
		 * 
		 */

		// Declaring the Stack Collection
		Stack<String> stack = new Stack<String>();

		// Add elements to the stack
		stack.push("Green Dish");
		stack.push("Blue Dish");
		stack.push("White Dish");
		stack.push("Yellow Dish");
		stack.push("Red Dish");

		System.out.println("*** Working With Stack ***");

		// Displays elements added to the stack
		System.out.printf("\n→ Stack's elements: %s;\n", stack); // [Green Dish, Blue Dish, White Dish, Yellow Dish, Red Dish]

		// Removes an element from the stack
		System.out.printf("\n→ Removing an element from the top of the stack: %s;\n", stack.pop()); // Red Dish

		// Displays the remaining elements in the stack after removal
		System.out.printf("\n→ Stack's elements: %s;\n", stack); // [Green Dish, Blue Dish, White Dish, Yellow Dish]

		// Removes an element from the stack
		System.out.printf("\n→ Removing an element from the top of the stack: %s;\n", stack.pop()); // Yellow Dish

		// Displays the remaining elements in the stack after removal
		System.out.printf("\n→ Stack's elements: %s;\n", stack); // [Green Dish, Blue Dish, White Dish]

		// Displays the element at the top of the stack
		System.out.printf("\n→ Element at the top of the stack: %s;\n", stack.peek()); // White Dish

		// Add a new dish to the stack
		System.out.printf("\n→ Add a new dish to the stack: %s;\n", stack.push("Purple Dish")); // Purple Dish

		// Displays elements of the current stack
		System.out.printf("\n→ Displays elements of the current stack: %s;\n", stack); // [Green Dish, Blue Dish, White Dish, Purple Dish]

		// Displays the size of the queue
		System.out.printf("\n→ Stack's size: %s;\n", stack.size()); // 4

		// Finds an element in the stack
		System.out.printf("\n→ Does the 'Green Dish' exist in the stack? %b;\n", stack.contains("Green Dish")); // true

		// Displays all queue elements per iteration
		Iterator<String> iStack = stack.iterator();
		int count = 1;

		System.out.println("\n*** Displays All Stack Elements Per Iteration ***\n");
		while (iStack.hasNext()) {
			String dishName = iStack.next();
			System.out.printf("→ %dº element: %s\n", count, dishName);
			count++;
		}

		// Clear the stack
		System.out.printf("\n→ Clearing the stack...\n");
		stack.clear();

		// Checking if the stack is empty
		System.out.printf("\n→ Is the stack empty? %b.\n", stack.isEmpty()); // true

		// Displays the remaining elements on the stack after clearing
		System.out.printf("\n→ Current stack: %s.\n", stack); // []

	}

}
