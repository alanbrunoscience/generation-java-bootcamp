package lesson19.auxiliarycontent.stringclass;

public class Example11StringEquals {

	/**
	 * String.equals(String)
	 * 
	 * → Compare two strings to check if they are equal, including whether the
	 * letters are upper case or lower case.
	 * 
	 */

	public static void main(String[] args) {

		String text1 = "hello";
		String text2 = "HELLO";
		String text3 = "hello";

		System.out.println("=== String.equals(String) ===\n");
		System.out.printf("→ 1) Is '%s' equal to '%s'? '%b';%n", text1, text2, text1.equals(text2));
		System.out.printf("→ 2) Is '%s' equal to '%s'? '%b'.%n", text1, text3, text1.equals(text3));

	}

}
