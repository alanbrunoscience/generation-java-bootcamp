package lesson19.auxiliaryclasses.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example03ApiJavaTime {

	/**
	 * The java.time API
	 * 
	 * → The 'java.time API' is composed of Classes that offer a very robust
	 * solution for handling dates and times in Java. The java.time API was created
	 * to solve problems we had with the 'Date' and 'Calendar' Classes, for example,
	 * thanks to its Methods, which greatly simplify date and time processing.
	 * 
	 * → The 'java.time API' offers 3 main Classes for working with date and time:
	 * 
	 * *-----------------*-------------------------------------* 
	 * |  Class          |  Description                        |
	 * *-----------------*-------------------------------------* 
	 * |  LocalDate      |  Stores only the date               |
	 * *-----------------*-------------------------------------* 
	 * |  LocalTime      |  Stores only the time               |
	 * *-----------------*-------------------------------------* 
	 * |  LocalDateTime  |  Stores both the date and the time  |
	 * *-----------------*-------------------------------------*
	 * 
	 * → There are 3 main Methods to create a new Object of the 'LocalDate',
	 * 'LocalTime', and 'LocalDateTime' Classes, as shown in the table below:
	 * 
	 * *-----------*-------------------------------------------------------------*
	 * |  Methods  |  Description                                                |
	 * *-----------*-------------------------------------------------------------*
	 * |  now()    |  Method used to return an instance of the 'LocalDate',      | 
	 * |           |  'LocalTime', or 'LocalDateTime' Classes with the system's  |
	 * |           |  current Date and/or Time.                                  |
	 * *-----------*-------------------------------------------------------------*
	 * |  of()     |  Method used to return an instance of the 'LocalDate',      | 
	 * |           |  'LocalTime', or 'LocalDateTime' Classes with specific      |
	 * |           |  values.                                                    |
	 * *-----------*-------------------------------------------------------------*
	 * |  parse()  |  Method used to convert a String into an instance of the    |
	 * |           |  'LocalDate', 'LocalTime', or 'LocalDateTime' Classes.      |
	 * *-----------*-------------------------------------------------------------*
	 * 
	 * → In the example below, we see how to instantiate the Objects of the
	 * 'LocalDate', 'LocalTime', and 'LocalDateTime' Classes, and then display them
	 * on the screen:
	 * 
	 */

	public static void main(String[] args) {

		// 'LocalDate' object with the current date
		LocalDate date = LocalDate.of(2025, 10, 14);

		// 'LocalDateTime' object with the current date and time
		LocalDateTime dateTime = LocalDateTime.now();

		// 'LocalTime' object with the current time
		LocalTime time = LocalTime.parse("16:18:10");

		// Display the objects
		System.out.println("*** The java.time API ***\n");
		System.out.printf("1) Current date: %s;%n", date); // 2025-10-14
		System.out.printf("2) Current date and time: %s;%n", dateTime); // 2025-10-14T16:18:04.930085900
		System.out.printf("3) Current time: %s.%n", time); // 16:18:10

	}

}
