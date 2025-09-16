package lesson09.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example03SetCollection {

	public static void main(String[] args) {
		
		/**
		 * Set Collection
		 * 
		 * → In this example, we'll look at a subclass of the Set Collection, the HashSet. 
		 * A HashSet is the ideal choice when the order of elements doesn't matter and you need to 
		 * ensure there are no duplicates. It uses a hash table to store the elements, which provides 
		 * very fast access but does not maintain the insertion order.
		 * 
		 * Methods of the Set Collection
		 * 
		 * *-----------------------------------------------------------------------*
		 * | Method            | Description                                       |
		 * *-----------------------------------------------------------------------*
		 * | add(Object)       | Adds an object to the Set Collection.             |
		 * *-----------------------------------------------------------------------*
		 * | remove(Object)    | Deletes the object stored in the Set Collection.  |
		 * *-----------------------------------------------------------------------*
		 * | clear()           | Clears the Set Collection.                        |
		 * *-----------------------------------------------------------------------*
		 * | size()            | Returns the size of the Set Collection            |
		 * |                   | (the number of elements stored).                  |
		 * *-----------------------------------------------------------------------*
		 * | isEmpty()         | Returns 'true' if the Set Collection is empty.    |
		 * *-----------------------------------------------------------------------*
		 * | contains(Object)  | Returns 'true' if the Object exists in the        |
		 * |                   | Set Collection.                                   |
		 * *-----------------------------------------------------------------------*
		 * | hashCode()        | Returns the HashCode of the element.              |
		 * *-----------------------------------------------------------------------*
		 * 
		 */

		// Creates a Collection Set, of type String, called setFruits
		Set<String> setFruits = new HashSet<String>();
		
		// Adds some fruits to the Collection Set
		setFruits.add("Avocado");
		setFruits.add("Banana");
		setFruits.add("Jabuticaba");
		setFruits.add("Kiwi");
		setFruits.add("Apple");
		setFruits.add("Strawberry");
		setFruits.add("Pear");
		setFruits.add("Jabuticaba");
		setFruits.add("Kiwi");
		
		System.out.println("****** Working With Set Collection ******\n");
		
		// Displays the data stored in Set Collection. Note that repeated fruits were inserted once.
		System.out.printf("→ Fruits registered: %s;\n", setFruits); // [Jabuticaba, Apple, Kiwi, Pear, Strawberry, Avocado, Banana]
		
		// Checks if an element is stored in the Collection Set
		System.out.printf("\n→ Is Kiwi on the set? %b;\n", setFruits.contains("Kiwi")); // true
		
		// Removes an element from the Collection Set
		setFruits.remove("Kiwi");
		System.out.printf("\n→ Kiwi was removed!\n");
		
		// Check after removal if the element still exists in the Collection Set
		System.out.printf("\n→ Is Kiwi on the set? %b;\n", setFruits.contains("Kiwi")); // false
		
		// List the Collection's HashCodes using the for...each loop
		System.out.printf("\n→ Listing the HashCodes of each element using the For...Each loop:\n\n");
		
		int count = 1;
		
		for (String fruit : setFruits) {
			System.out.printf("→ %dº Hashcode's fruit: %s - %h\n", count, fruit, fruit.hashCode());
			count++;
		}
		
		// List the Collection's HashCodes using the 'Iterator' Interface
		System.out.printf("\n→ Listing the HashCodes of each element using the 'Iterator' Interface:\n\n");
		
		Iterator<String> isetFruits = setFruits.iterator();
		
        int count2 = 1;
		
		while (isetFruits.hasNext()) {
			String fruit = isetFruits.next();
			System.out.printf("→ %dº Hashcode's fruit: %s - %h\n", count2, fruit, fruit.hashCode());
			count2++;
		}
		
		// Checks if the Set Collection is empty
		System.out.printf("\n→ Is the Set Collection empty? %b;\n", setFruits.isEmpty()); // false
		
		// Clear the Collection Set
		setFruits.clear();
		System.out.printf("\n→ All items were removed from the Set Collection!\n");
		
		// Check again if the Collection Set is empty
		System.out.printf("\n→ Is the Set Collection empty? %b.\n", setFruits.isEmpty()); // true
		
	}

}
