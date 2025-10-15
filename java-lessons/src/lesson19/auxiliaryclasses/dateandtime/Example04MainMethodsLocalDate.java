package lesson19.auxiliaryclasses.dateandtime;

import java.time.LocalDate;

public class Example04MainMethodsLocalDate {

	/**
	 * Main Methods of the 'LocalDate' Class
	 * 
	 * *-----------------------------*-------------------------------------------*
	 * |  Methods                    |  Description                              |
	 * *-----------------------------*-------------------------------------------*
	 * |  compareTo(LocalDate date)  |  This method checks if this date is equal | 
	 * |                             |  to another date. If they are equal, it   | 
	 * |                             |  returns '0'. If it is smaller or larger, |
	 * |                             |  it returns the difference in years (a    |
	 * |                             |  positive integer for a later date or a   |
	 * |                             |  negative integer for an earlier date).   |
	 * *-----------------------------*-------------------------------------------*
	 * |  equals(LocalDate date)     |  This method checks if this date is equal | 
	 * |                             |  to another date. If they are equal, it   |
	 * |                             |  returns 'true'; otherwise, it returns    |
	 * |                             |  'false'.                                 |
	 * *-----------------------------*-------------------------------------------*
	 * |  getDayOfMonth()            |  This method obtains the day-of-month     |
	 * |                             |  field.                                   |
	 * *-----------------------------*-------------------------------------------*
	 * |  getDayOfYear()             |  This method obtains the day-of-year      |
	 * |                             |  field.                                   |
	 * *-----------------------------*-------------------------------------------*
	 * |  getYear()                  |  This method obtains the year field of a  |
	 * |                             |  date.                                    |
	 * *-----------------------------*-------------------------------------------*
	 * |  getMonthValue()            |  This method obtains the month field,     |
	 * |                             |  from 1 to 12.                            |
	 * *-----------------------------*-------------------------------------------*
	 * |  isAfter(LocalDate date)    |  This method checks if this date is after | 
	 * |                             |  the specified date.                      |
	 * *-----------------------------*-------------------------------------------*
	 * |  isBefore(LocalDate date)   |  This method checks if this date is       |
	 * |                             |  before the specified date.               |
	 * *-----------------------------*-------------------------------------------*
	 * |  isEqual(LocalDate date)    |  This method checks if this date is equal |
	 * |                             |  to the specified date.                   |
	 * *-----------------------------*-------------------------------------------*
	 * |  isLeapYear()               |  This method checks if the year is a leap |
	 * |                             |  year.                                    |
	 * *-----------------------------*-------------------------------------------*
	 * 
	 */

	public static void main(String[] args) {

		// Instantiate a new 'LocalDate' object
		LocalDate date = LocalDate.now();

		// Get details about the date
		System.out.println("*** Main Methods of the 'LocalDate' Class ***\n");
		System.out.printf("1) Display only the day of the date: %d;%n", date.getDayOfMonth()); // 15
		System.out.printf("2) Display only the number of the day of the year of the date: %d;%n", date.getDayOfYear()); // 288
		System.out.printf("3) Display only the month of the date (1-12): %d;%n", date.getMonthValue()); // 10
		System.out.printf("4) Is '%s' a leap year? %b;%n", date.getYear(), date.isLeapYear()); // false

		System.out.printf("5) How many days does the month '%s' have? %d;%n", date.getMonth(), date.lengthOfMonth()); // 31
		System.out.printf("6) How many days does the year '%d' have? %d.%n", date.getYear(), date.lengthOfYear()); // 365

		// Instantiate three objects of the 'LocalDate' class to be used in comparing
		// dates
		LocalDate minorDate = LocalDate.of(2020, 11, 25);
		LocalDate sameDate = LocalDate.now();
		LocalDate majorDate = LocalDate.of(2025, 11, 25);

		// Comparison between dates
		System.out.println("\n=== Comparison Between Dates ===\n");
		System.out.printf("1) Is the date '%s' the same as '%s'? %b;%n", minorDate, date, date.equals(minorDate)); // false
		System.out.printf("2) Is the date '%s' the same as '%s'? %b;%n", sameDate, date, date.equals(sameDate)); // true
		System.out.printf("3) Is the date '%s' the same as '%s'? %b;%n", majorDate, date, date.equals(majorDate)); // false

		System.out.printf("\n4) Is the date '%s' greater than '%s'? %b (compareTo returns %d);%n", date, minorDate,
				date.isAfter(minorDate), date.compareTo(minorDate)); // true (compareTo returns 5)
		System.out.printf("5) Is the date '%s' less than '%s'? %b (compareTo returns %d);%n", date, majorDate,
				date.isBefore(majorDate), date.compareTo(majorDate)); // true (compareTo returns -1)

		System.out.printf("\n6) Is the date '%s' later than '%s'? %b;%n", date, minorDate, date.isAfter(minorDate)); // true
		System.out.printf("7) Is the date '%s' the same as '%s'? %b;%n", date, sameDate, date.isEqual(sameDate)); // true
		System.out.printf("8) Is the date '%s' earlier than '%s'? %b.%n", date, majorDate, date.isBefore(majorDate)); // true

	}

}
