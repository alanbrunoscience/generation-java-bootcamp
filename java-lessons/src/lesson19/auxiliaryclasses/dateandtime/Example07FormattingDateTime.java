package lesson19.auxiliaryclasses.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example07FormattingDateTime {

	/**
	 * Formatting the Date and Time
	 * 
	 * → Observe in previous examples that the date and time were displayed in the
	 * American standard format. Through the 'DateTimeFormatter' Class, it is
	 * possible to format the output on the console.
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 * ⚠️ Important
	 * 
	 * → The 'DateTimeFormatter' Class only formats the display on the screen; the
	 * American standard format will be maintained in the Object or in the Database.
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 * Formatting Patterns
	 * 
	 * → To format the date and time, the 'DateTimeFormatter' Class uses several
	 * formatting codes, called patterns, which are combined to create the desired
	 * output standard. In the table below, we have the list of codes:
	 * 
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |  Symbol  |  Description                |  Format       |  Notes                                      |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    y     |  Standard Year              |  Number       |  Standard year field (e.g., 2025)           |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    Y     |  Week Year                  |  Number       |  Year based on the week number (ISO 8601).  | 
	 * |          |                             |               |  Use y for standard years.                  |
	 * |          |                             |               |                                             |
	 * |          |                             |               |  → Example: 2026-01-03. This day belongs to |
	 * |          |                             |               |  Week 53 of 2025 in the ISO system, so the  |
	 * |          |                             |               |  week year is 2025.                         |
	 * |		  | 						    |				|                                             |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    d     |  Day of the month           |  Number       |  (1-31)                                     |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    D     |  Day of the year            |  Number       |  (1-366)                                    |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    M     |  Month of the year          |  Number/Text  |  M=9, MM=09, MMM=Sep, MMMM=September        |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    L     |  Standalone Month           |  Number/Text  |  Used when the month stands alone, not as   |
	 * |          |                             |               |  part of a date.                            |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    E     |  Day of the week            |  Text         |  EEE=Wed, EEEE=Wednesday                    |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    a     |  AM PM marker               |  Text         |  Displays AM or PM                          |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    h     |  Hour (1-12, AM/PM)         |  Number       |  Hour in AM/PM clock (e.g., 3 PM is 3)      |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    H     |  Hour (0-23, 24h)           |  Number       |  Hour in 24-hour clock (e.g., 3 PM is 15)   |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    k     |  Hour (1-24, 24h)           |  Number       |  Hour in 24-hour clock (rarely used over H) |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    m     |  Minutes                    |  Number       |                                             |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    s     |  Seconds                    |  Number       |                                             |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    n     |  Nanoseconds                |  Number       |  The precise fractional second. Use 'S' for |
	 * |          |                             |               |  milliseconds.                              |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * |    S     |  Fraction of second         |  Number       |  Milliseconds/microsecond component         |
	 * |          |                             |               |  (e.g., SSS for milliseconds)               |
	 * *----------*-----------------------------*---------------*---------------------------------------------*
	 * 
	 * → See the application of some common formatting patterns in the example below:
	 * 
	 */

	public static void main(String[] args) {
		
		// 'LocalDate', 'LocalDateTime', and 'LocalTime' objects with current values
		LocalDate date = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.now();
		LocalTime time = LocalTime.now();
		
		// Display the formatted object of the 'LocalDate' class
		System.out.println("*** Formatted Object Of The 'LocalDate' Class ***\n");
		System.out.printf("1) Date in Brazilian format: %s;%n", date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // 15/10/2025
		System.out.printf("2) Date with the month in full: %s;%n", date.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy"))); // 15/outubro/2025
		System.out.printf("3) Date with day of the week: %s.%n", date.format(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy"))); // quarta-feira, 15/10/2025
		
		// Display the formatted object of the 'LocalTime' class
		System.out.println("\n*** Formatted Object Of The 'LocalTime' Class ***\n");
		System.out.printf("1) Time in Brazilian format: %s;%n", time.format(DateTimeFormatter.ofPattern("hh:mm:ss"))); // 11:41:57
		System.out.printf("2) Time with milliseconds: %s;%n", time.format(DateTimeFormatter.ofPattern("hh:mm:ss.n"))); // 11:41:57.318615200
		System.out.printf("3) Time in AM/PM format: %s.%n", time.format(DateTimeFormatter.ofPattern("hh:mm:ss a"))); // 11:41:57 PM
		
		// Display the formatted object of the 'LocalDateTime' class
		System.out.println("\n*** Formatted Object Of The 'LocalDateTime' Class ***\n");
		System.out.printf("1) Date and Time in Brazilian format: %s.%n", dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))); // 15/10/2025 23:41:57

	}

}