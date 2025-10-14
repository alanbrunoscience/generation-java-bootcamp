package lesson19.auxiliaryclasses.dateandtime;

import java.util.Calendar;

public class Example02CalendarClass {

	/**
	 * Class Calendar
	 * 
	 * → The 'Calendar' Class was introduced in Java with the aim of replacing the
	 * 'Date' Class and offering Objects that, in addition to storing the date and
	 * time, would adjust to each country's calendar style.
	 * 
	 * → Syntax:
	 * 
	 * Calendar date = Calendar.getInstance();
	 * 
	 * → Through the 'getInstance()' Method, we instantiate a new Object of the
	 * 'Calendar' Class. The 'getTime()' Method returns the date and time stored in
	 * the Calendar Class Object. See the example below:
	 * 
	 */

	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();

		System.out.println("*** Calendar Class ***\n");
		System.out.printf("→ The current date is: %s.%n", date.getTime()); // Tue Oct 14 15:34:55 BRT 2025

	}

}
