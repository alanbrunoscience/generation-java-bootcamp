package lesson19.auxiliaryclasses.dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Example06PeriodAndDurationClasses {

	/**
	 * The 'Period' and 'Duration' Classes
	 * 
	 * → The 'Period' class represents a quantity of time in terms of years, months,
	 * and days. The 'Period' class is widely used to modify the values of a
	 * specific date or to get the difference between two dates.
	 * 
	 * → The 'Duration' class represents a quantity of time in terms of seconds and
	 * nanoseconds (or milliseconds, depending on the context). The 'Duration' class
	 * is widely used to modify the values of a specific time or to get the
	 * difference between two times.
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 * ⚠️ Important
	 * 
	 * → Pay Attention to Detail when working with the 'Period' and 'Duration'
	 * Classes. The 'Period' and 'Duration' Classes do not accept 'LocalDateTime'
	 * Class Objects.
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 * → In the example below, we will see how to use the 'Period' and 'Duration'
	 * Classes to find the difference between two dates in years and two times in
	 * seconds:
	 * 
	 */

	public static void main(String[] args) {

		// 'LocalDate' object with a specific date
		LocalDate date = LocalDate.of(2019, 11, 25);

		// 'LocalTime' object with a specific time
		LocalTime time = LocalTime.of(6, 30, 0);

		// Compare a specific date with the current date
		System.out.printf("→ Difference in years: %d;%n", Period.between(date, LocalDate.now()).getYears());

		// Compare a specific time with the current time
		System.out.printf("\n→ Difference in seconds: %d.%n", Duration.between(time, LocalTime.now()).getSeconds());

	}

}
