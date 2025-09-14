package lesson07.arraysvectors;

import java.util.Arrays;

public class Example07EqualsMethod {

	public static void main(String[] args) {
		
		String namesA[] = { "Amanda", "Elen", "Vinicius" };
		String namesB[] = { "Samantha", "Letícia", "Alan" };
		
		System.out.println("Are the arrays equal?");
		
		if (Arrays.equals(namesA, namesB)) {
			System.out.println("\n→ Yes, they are!");
		} else {
			System.out.println("\n→ No, they aren't!");
		}
		
		// Output: → No, they aren't!

	}

}
