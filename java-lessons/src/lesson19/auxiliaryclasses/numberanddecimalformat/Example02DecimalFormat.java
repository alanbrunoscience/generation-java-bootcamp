package lesson19.auxiliaryclasses.numberanddecimalformat;

import java.text.DecimalFormat;

public class Example02DecimalFormat {

	/**
	 * DecimalFormat
	 * 
	 * → The 'DecimalFormat' Class is also part of the 'java.text' package and
	 * allows formatting real numbers by customizing the formatting, instead of
	 * using the default formatting from your Operating System.
	 * 
	 * → You can use the 'DecimalFormat' class to format decimal numbers and control
	 * the display of digits to the left and the quantity of zeros to the right,
	 * prefixes and suffixes, and also group thousands separators and the decimal
	 * separator.
	 * 
	 * → To customize the formatting, you need to specify the formatting properties
	 * through a standard character string. The pattern determines the formatting.
	 * To create the formatting, we will use the symbol table below:
	 * 
	 * *-------------*------------------------------------------------*
	 * |  Character  |  Description                                   |
	 * *-------------*------------------------------------------------*
	 * |      0      |  A digit. If not present, adds a 0.            |
	 * *-------------*------------------------------------------------*
	 * |      #      |  A digit. If not present or if it is the zero  |
	 * |             |  digit, this digit will not be displayed.      |
	 * *-------------*------------------------------------------------*
	 * |      .      |  Decimal Separator                             |
	 * *-------------*------------------------------------------------*
	 * |      ,      |  Thousands Separator                           |
	 * *-------------*------------------------------------------------*
	 * 
	 * → To apply the formatting to a Real number or a variable of type 'float' or
	 * 'double', we will use the '.format()' Method.
	 * 
	 * --------------------------------------------------------------------------------------
	 * 
	 * Syntax:
	 * 
	 * → Create the 'DecimalFormat' Class 'Object':
	 * 
	 * • DecimalFormat object_name = new DecimalFormat(pattern);
	 * 
	 * → Where: 'pattern' is the formatting pattern, which will be created using the
	 * characters described in the table above.
	 * 
	 * --------------------------------------------------------------------------------------
	 * 
	 * → Apply the formatting: 'object_name.format(real_number)'
	 * 
	 * → Where: 'real_number' can be a number or a variable of type 'float' or
	 * 'double'.
	 * 
	 */

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,##0.00");

		/*
		 * PATTERN EXPLANATION: "###,##0.00"
		 *
		 * This pattern defines the structure of the formatted number:
		 *
		 * 1. SYMBOLS BEFORE THE DECIMAL POINT (###,##0): 
		 * 
		 * • '#' : Optional Digit. It suppresses leading zeros;
		 * • ',' : Placeholder for the Grouping Separator (e.g., thousands); 
		 * • '0' : Required Digit. Ensures at least one digit is displayed, even if the 
		 * number is less than 1 (e.g., 0.5 will show '0').
		 *
		 * 2. SYMBOLS AFTER THE DECIMAL POINT (.00): 
		 * 
		 * • '.' : Placeholder for the Decimal Separator.
		 * • '00' : Required Digits. Ensures the number is displayed with exactly two decimal 
		 * places, padding with zeros if necessary (e.g., 2.5 becomes 2.50) and rounding the 
		 * number if it has more than two decimals (e.g., 23.557 -> 23.56).
		 *
		 * ⚠️ NOTE ON OUTPUT: The actual symbols used (',' and '.') are determined by the
		 * system's Default Locale (pt-BR), not the pattern string itself.
		 * 
		 */

		// Print the formatted numbers
		System.out.println("*** Working With the 'DecimalFormat' Class ***\n");
		System.out.printf("1) Real number: %s;%n", df.format(2.5)); // 2,50
		System.out.printf("2) Monetary value: %s;%n", df.format(2750.00)); // 2.750,00
		System.out.printf("3) Percentage: %s.%n", df.format(0023.55789)); // 23,56
		
	}

}
