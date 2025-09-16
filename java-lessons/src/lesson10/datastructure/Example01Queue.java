package lesson10.datastructure;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Example01Queue {

	public static void main(String[] args) {
		
		/**
		 * Queue
		 * 
		 * → A Queue is a FIFO data structure: "first in, first out." The fundamental idea of ​​a queue is that we 
		 * can only INSERT A NEW ELEMENT AT THE END of the queue and only REMOVE AN ELEMENT FROM THE BEGINNING.
		 * 
		 * → Therefore, the Queue allows manipulation at both ends: at the beginning (front) and at the end (tail). 
		 * Insertions are made at the tail and Removals are made at the front.
		 * 
		 * → To implement the Queue data structure, we will use the Collection 'Queue', which is an ordered list of objects,
		 * where it is only possible to insert elements at the end of the list and delete elements from the beginning of 
		 * the list, that is, it follows the FIFO (First-In-First-Out) principle.
		 * 
		 * Syntax:
		 * 
		 * Queue<T> queueElements = new LinkedList<T>();
		 * 
		 * → The default no-argument constructor creates a new, empty LinkedList object.
		 * 
		 * → The <T> element in Java represents a Java Generic Type. It is used to define the type of object that will 
		 * be stored in the Collection. The data type must be an object, which can be a wrapper class or a class created
		 * by the developer.
		 * 
		 * → Because we need to know the first and last elements of the list for deletions and insertions, respectively, 
		 * the best class to use for this process is 'LinkedList', which implements the data structure called a 'Doubly 
		 * Linked List'.
		 * 
		 * → In a Doubly Linked List, we have two pointers: one that points to the previous element and the other to the 
		 * next:
		 * 
		 * HEAD ⇌ element1 ⇌ element2 ⇌ NULL
		 * 
		 * --------------------------------------------------------------------------------------------------------------
		 * 
		 * Main Methods of the Queue Interface
		 * 
		 * *--------------------------------------------------------------------------------------------*
		 * | Method                                | Description                                        |
		 * *--------------------------------------------------------------------------------------------*
		 * | add(element)                          | This method is used to add an element to the end   |
		 * |                                       | of the queue.                                      |
		 * *--------------------------------------------------------------------------------------------*
		 * | size()                                | This method is used to return the size of the      |
		 * |                                       | queue.                                             |
		 * *--------------------------------------------------------------------------------------------*
		 * | clear()                               | This method is used to remove all elements from    |
		 * |                                       | the queue.                                         |
		 * *--------------------------------------------------------------------------------------------*
		 * | remove()                              | This method is used to remove and return the first |
		 * |                                       | element of the queue.                              |
		 * *--------------------------------------------------------------------------------------------*
		 * | isEmpty()                             | This method is used to check if the queue is empty |
		 * |                                       | or not. It returns 'true' if the queue is empty,   |
		 * |                                       | otherwise 'false'.                                 |
		 * *--------------------------------------------------------------------------------------------*
		 * | contains(element)                     | This method is used to check if the queue contains |
		 * |                                       | the given element or not. It returns 'true' if the |
		 * |                                       | queue contains the element.                        |
		 * *--------------------------------------------------------------------------------------------*
		 * | peek()                                | This method is used to retrieve, but NOT REMOVE,   |
		 * |                                       | the element at the HEAD of this queue (the first   |
		 * |                                       | element), or return null if the queue is empty.    |
		 * *--------------------------------------------------------------------------------------------*
		 * | poll()                                | This method is used to RETRIEVE and REMOVE the     |
		 * |                                       | element at the HEAD of this queue (the first       |
		 * |                                       | element), or return null if the queue is empty.    |
		 * *--------------------------------------------------------------------------------------------*
		 * 
		 */
		
		// Declaring the Queue Collection
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// Insert elements into the queue
		try(Scanner input = new Scanner(System.in)) {
			
			int numberOfElem;
			
			System.out.println("*** Working With Queue ***\n");
			System.out.print("1) How many elements do you want to queue? ");
			numberOfElem = input.nextInt();
			
			System.out.println("\n*** Inserting Elements ***\n");
			int num;			
			for (int i = 0; i < numberOfElem; i++) {
				System.out.printf("→ Enter the %dº element: ", i + 1);
				num = input.nextInt();
				queue.add(num);
			}
			
			// Displays numbers added to the queue
			System.out.printf("\n→ Queue's elements: %s;\n", queue);
			
			// Removing an element from the beginning of the queue
			System.out.printf("\n→ Removed element: %d;\n", queue.remove());
			
			// Displays the remaining numbers in the queue after removal
			System.out.printf("\n→ Remaining elements in the queue: %s;\n", queue);
			
			// Add a new element to the queue
			System.out.printf("\nEnter the new element that you want to insert: ");
			num = input.nextInt();
			queue.add(num);
			System.out.printf("→ Updated queue: %s;\n", queue);
			
			// Displays the first element of the queue
			System.out.printf("\n→ Displays the first element of the queue: %d;\n", queue.peek());
			
			// Displays the size of the queue
			System.out.printf("\n→ Size of the queue: %d;\n", queue.size());
			
			// Checks if the number 4 exists in the queue
			System.out.printf("\n→ Checks if the number '4' exists in the queue: %b;\n", queue.contains(4));
			
			// Displays and removes the first element from the list (HEAD)
			System.out.printf("\n→ Displays and removes from the queue the first element (HEAD): %d;\n", queue.poll());
			
			// Displays the remaining numbers in the queue after removal
			System.out.printf("\n→ Updated queue: %s;\n", queue);
			
			// Displays all queue elements per iteration
			Iterator<Integer> iNumbers = queue.iterator();
			int count = 1;
			
			System.out.println("\n*** Displays All Queue Elements Per Iteration ***\n");
			while (iNumbers.hasNext()) {
				num = iNumbers.next();
				System.out.printf("→ %dº element: %d\n", count, num);
				count++;
			}
			
			// Clear the queue
			System.out.printf("\n→ Clearing the queue...\n");
			queue.clear();
			
			// Checking if the queue is empty
			System.out.printf("\n→ Is the queue empty? %b.\n", queue.isEmpty());
			
			// Displays the remaining numbers in the queue after clearing the list
			System.out.printf("\n→ Current queue: %s.\n", queue);
			
		}
		
	}

}
