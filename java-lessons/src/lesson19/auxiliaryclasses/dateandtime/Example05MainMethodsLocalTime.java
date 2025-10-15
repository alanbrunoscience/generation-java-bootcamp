package lesson19.auxiliaryclasses.dateandtime;

import java.time.LocalTime;

public class Example05MainMethodsLocalTime {

	/**
	 * Main Methods of the 'LocalTime' Class
	 * 
	 * *-----------------------------*-------------------------------------------*
	 * |  Methods                    |  Description                              |
	 * *-----------------------------*-------------------------------------------*
	 * |  compareTo(LocalTime time)  |  This method compares two times. If they  |
	 * |                             |  are equal, '0' is returned; if it is     |
	 * |                             |  greater, '1' is returned; and if it is   |
	 * |                             |  smaller, '-1' is returned.               |
	 * *-----------------------------*-------------------------------------------*
	 * |  equals(LocalTime time)     |  This method checks if one time is equal  |
	 * |                             |  to another time. If they are equal,      |
	 * |                             |  'true' is returned, otherwise 'false' is |
	 * |                             |  returned.                                |
	 * *-----------------------------*-------------------------------------------*
	 * |  getHour()                  |  This method gets the hour-of-day field.  |
	 * *-----------------------------*-------------------------------------------*
	 * |  getMinute()                |  This method gets the minute-of-hour      |
	 * |                             |  field.                                   |
	 * *-----------------------------*-------------------------------------------*
	 * |  getNano()                  |  This method gets the nanosecond field.   |                                    |
	 * *-----------------------------*-------------------------------------------*
	 * |  getSecond()                |  This method gets the second-of-minute    |
	 * |                             |  field.                                   |
	 * *-----------------------------*-------------------------------------------*
	 * |  isAfter(LocalTime time)    |  This method checks if this time is after |
	 * |                             |  the specified time.                      |
	 * *-----------------------------*-------------------------------------------*
	 * |  isBefore(LocalTime time)   |  This method checks if this time is       |
	 * |                             |  before  the specified time.              |
	 * *-----------------------------*-------------------------------------------*
	 * 
	 * → In the example below, we will see some uses of the 'LocalTime' Class
	 * Methods:
	 * 
	 */

	public static void main(String[] args) {

		// Instantiate a new 'LocalTime' object
		LocalTime time = LocalTime.now();

		// Get details about the time
		System.out.println("*** Main Methods of the 'LocalTime' Class ***\n");
		System.out.printf("1) Display only the hour of day: %s;%n", time.getHour()); // 19
		System.out.printf("2) Display only the minutes of the time: %s;%n", time.getMinute()); // 17
		System.out.printf("3) Display only the seconds of the time: %s;%n", time.getSecond()); // 51
		System.out.printf("4) Display only the nanoseconds of the time: %s;%n", time.getNano()); // 932281800
		
		// Instantiate 3 Objects of the 'LocalTime' Class, which will be used in the Methods for 
		// comparing times
		LocalTime minorTime = LocalTime.of(8, 30, 25);
		LocalTime sameTime = time;
		LocalTime majorTime = LocalTime.of(10, 30, 25);

		// Comparison between times
		System.out.println("\n=== Comparison Between Times ===\n");
		System.out.printf("1) Is the time '%s' the same as '%s'? %b;%n", minorTime, time, time.equals(minorTime)); // false
		System.out.printf("2) Is the time '%s' the same as '%s'? %b;%n", sameTime, time, time.equals(sameTime)); // true
		System.out.printf("3) Is the time '%s' the same as '%s'? %b;%n", majorTime, time, time.equals(majorTime)); // false

		System.out.printf("\n4) Is the time '%s' greater than '%s'? %b;%n", time, minorTime, time.compareTo(minorTime) > 0); // true
		System.out.printf("5) Is the time '%s' less than '%s'? %b;%n", time, majorTime, time.compareTo(majorTime) < 0); // false
		
		System.out.printf("\n6) Is the time '%s' later than '%s'? %b;%n", time, minorTime, time.isAfter(minorTime)); // true
		System.out.printf("7) Is the time '%s' earlier than '%s'? %b.%n", time, majorTime, time.isBefore(majorTime)); // false

	}

}
