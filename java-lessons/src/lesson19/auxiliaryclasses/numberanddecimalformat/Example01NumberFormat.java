package lesson19.auxiliaryclasses.numberanddecimalformat;

public class Example01NumberFormat {

	/**
	 * NumberFormat
	 * 
	 * → The 'NumberFormat' Class is part of the 'java.text' package and allows
	 * formatting numbers according to the geographical locale defined in your
	 * Operating System. The class distinguishes between the point, thousands, and
	 * decimal signs, and also identifies the position of the number's sign and
	 * identifies the prefix, which indicates the currency in case of monetary
	 * values.
	 * 
	 * → The 'NumberFormat' Class has 4 main Methods:
	 * 
	 * *-------------------------*-------------------------------------------*
	 * |  Methods                |  Description                              |
	 * *-------------------------*-------------------------------------------*
	 * |  getNumberInstance()    |  Returns an object instance based on the  |
	 * |                         |  default locale format. It is used for    |
	 * |                         |  numbers.                                 |
	 * *-------------------------*-------------------------------------------*
	 * |  getCurrencyInstance()  |  Used to format currencies. This Method   |
	 * |                         |  identifies the locale (country) from the |
	 * |                         |  Operating System.                        |
	 * *-------------------------*-------------------------------------------*
	 * |  getIntegerInstance()   |  Used to format numbers, ignoring decimal |
	 * |                         |  places.                                  |
	 * *-------------------------*-------------------------------------------*
	 * |  getPercentInstance()   |  Used to format fractions, for example,   |
	 * |                         |  0.15 is formatted and shown as 15%.      |
	 * *-------------------------*-------------------------------------------*
	 * 
	 * → To apply formatting to a Real number or a variable of type 'float' or 
	 * 'double', we will use the '.format()' Method.
	 * 
	 * -----------------------------------------------------------------------
	 * 
	 * Syntax:
	 * 
	 * → Create the NumberFormat Class Object:
	 * 
	 * • NumberFormat object_name = NumberFormat.method();
	 * 
	 * → Where: 'method' is one of the 4 Methods described in the table above.
	 * 
	 * -----------------------------------------------------------------------
	 * 
	 * → Apply the formatting: 'object_name.format(real_number)'
	 * 
	 * → Where: 'real_number' can be a number or a variable of type 'float' or 
	 * 'double'.
	 * 
	 */

	public static void main(String[] args) {

	}

}
