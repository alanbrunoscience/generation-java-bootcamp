package lesson19.auxiliaryclasses.dateclass;

import java.util.Date;

public class Example01DateClass {

	/**
	 * Date Class
	 * 
	 * → A date in Java represents time. A Date Class Object represents a time,
	 * which is composed of year, month, day, hour, minute, seconds, among other
	 * properties that this class possesses.
	 * 
	 * → Currently, most of the methods of the Date Class are classified as
	 * DEPRECATED, meaning they are methods that are no longer used. This is why
	 * this class was REPLACED by the 'Calendar' class, to provide correct support
	 * for the internationalization of the date system. However, there are still
	 * many Classes that use Date Class Objects, and that is why it is important to
	 * have a minimal understanding of it.
	 * 
	 * Syntax:
	 * 
	 * → Date data = new Date();
	 * 
	 */

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println("=== Date Class ===\n");

		System.out.printf("→ Current date: %s;%n", date); // Sat Oct 11 16:27:04 BRT 2025
		System.out.printf("→ Current date in milliseconds: %s.%n", date.getTime()); // 1760210898724

	}

}
