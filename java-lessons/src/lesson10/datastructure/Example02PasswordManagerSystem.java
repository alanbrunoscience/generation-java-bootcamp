package lesson10.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Example02PasswordManagerSystem {

	public static void main(String[] args) {

		// Declaring the Queue Collection
		Queue<Integer> passwords = new LinkedList<Integer>();

		System.out.println("********** PASSWORD MANAGER SYSTEM **********\n");

		// Add passwords from 0 to 10
		System.out.println("1) Adding passwords from 0 to 10 (including) in the queue...");
		for (int i = 0; i <= 10; i++) {
			passwords.add(i);
		}
		System.out.printf("\n→ Current queue: %s.\n", passwords);

		// Remove the first element
		System.out.printf("\n2) Calling the first password (remove): %s;\n", passwords.remove());

		System.out.printf("\n→ Current queue: %s.\n", passwords);

		// Add a new element (11)
		System.out.printf("\n3) Adding a new password (11): %b;\n", passwords.add(11));

		System.out.printf("\n→ Current queue: %s.\n", passwords);

		// Display the first element (without removing)
		System.out.printf("\n4) Next password to be called (peek): %d;\n", passwords.peek());

		// Display the queue size
		System.out.printf("\n5) Quantity of remaining passwords in the queue: %d;\n", passwords.size());

		// Check if the password 4 is in the queue
		System.out.printf("\n6) Is the password '4' in the queue? %b;\n", passwords.contains(4));

		// Display and remove the first element
		System.out.printf("\n7) Calling and removing the next password (poll): %d;\n", passwords.poll());

		System.out.printf("\n→ Current queue: %s.\n", passwords);

		// Iteration over the remaining elements
		System.out.printf("\n8) Remaining passwords in the queue (iterating):\n\n");

		int count = 0;

		Iterator<Integer> iterator = passwords.iterator();

		while (iterator.hasNext()) {
			System.out.printf("→ %dº Password: %d\n", count + 1, iterator.next());
			count++;
		}
		
		// Clear the list
		System.out.printf("\n9) Cleaning all passwords from the queue...\n");
		passwords.clear();
		
		// Check if the queue is empty
		System.out.printf("\n10) Is the queue empty? %b.\n", passwords.isEmpty());
		
		System.out.println("\n\n→ Finishing the program...\n");
		
	}

}
