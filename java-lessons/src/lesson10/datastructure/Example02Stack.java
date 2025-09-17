package lesson10.datastructure;

import java.util.Iterator;
import java.util.Stack;

public class Example02Stack {

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
		 * - PUSH inserts an element onto the top of the stack; - POP removes the
		 * element from the top of the stack (returning it or not).
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * Stack Collection
		 * 
		 * → To implement the Stack data structure, we'll use the Collection Stack, a
		 * class that models and implements the Stack data structure, following the
		 * 'Last In - First Out' principle. Furthermore, the Stack class provides the
		 * basic push and pop operations and methods for emptying, searching, and
		 * querying the stack.
		 * 
		 * Syntax:
		 * 
		 * Stack<T> stack = new Stack<T>();
		 * 
		 * → The default no-argument constructor creates a new, empty Stack object.
		 * 
		 * → The <T> element in Java represents a Java Generic Type. It is used to
		 * define the type of object that will be stored in the Collection. The data
		 * type must be an object, which can be a wrapper class or a class created by
		 * the developer.
		 * 
		 * -------------------------------------------------------------------------------------------------------------
		 * 
		 * Main Methods of the Stack Class
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
		System.out.printf("\n→ Stack's elements: %s;\n", stack);

		// Removes an element from the stack
		System.out.printf("\n→ Removing an element from the top of the stack: %s;\n", stack.pop());

		// Displays the remaining elements in the stack after removal
		System.out.printf("\n→ Stack's elements: %s;\n", stack);

		// Removes an element from the stack
		System.out.printf("\n→ Removing an element from the top of the stack: %s;\n", stack.pop());

		// Displays the remaining elements in the stack after removal
		System.out.printf("\n→ Stack's elements: %s;\n", stack);

		// Displays the element at the top of the stack
		System.out.printf("\n→ Element at the top of the stack: %s;\n", stack.peek());

		// Add a new dish to the stack
		System.out.printf("\n→ Add a new dish to the stack: %s;\n", stack.push("Purple Dish"));

		// Displays elements of the current stack
		System.out.printf("\n→ Displays elements of the current stack: %s;\n", stack);

		// Displays the size of the queue
		System.out.printf("\n→ Stack's size: %s;\n", stack.size());

		// Finds an element in the stack
		System.out.printf("\n→ Does the 'Green Dish' exist in the stack? %b;\n", stack.contains("Green Dish"));

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
		System.out.printf("\n→ Is the stack empty? %b.\n", stack.isEmpty());

		// Displays the remaining elements on the stack after clearing
		System.out.printf("\n→ Current stack: %s.\n", stack);

	}

}
