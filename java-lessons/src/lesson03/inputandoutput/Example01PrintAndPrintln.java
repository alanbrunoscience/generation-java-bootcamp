package lesson03.inputandoutput;

public class Example01PrintAndPrintln {

	public static void main(String[] args) {
		
		/**
		 * Difference between print() and println()
		 * 
		 * → print(): Allows you to display a string of characters (String) on ​​the screen, without worrying 
		 * about formatting, that is, the way the String is sent, it will be displayed.
		 * 
		 * → println(): Equivalent to the print() method. The difference is that it always skips a line after 
		 * displaying the value on the screen.
		 */
		
		String name = "Alan";
		int age = 20;
		
		System.out.print("My name is " + name);
		System.out.print(" and I'm " + age + " years old.\n\n"); // My name is Alan and I'm 20 years old. (Print on the same line)
		
		System.out.println("My name is " + name);
		System.out.println("and I'm " + age + " years old.");
		// My name is Alan
		// and I'm 20 years old. (Print skipping lines)
		
	}

}
