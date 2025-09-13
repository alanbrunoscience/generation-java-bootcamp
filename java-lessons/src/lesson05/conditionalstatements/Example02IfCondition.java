package lesson05.conditionalstatements;

public class Example02IfCondition {

	public static void main(String[] args) {

		int n1 = 4, n2 = 3, n3 = 4;

		if (n1 < 5) {
			System.out.printf("→ %d is less than 5.\n", n1);
		}
		
		if (n1 < n2) {
			System.out.printf("→ %d is less than %d.\n", n1, n2);
		}
		
		if (n1 == n3) // if block with only one statement to be executed, no need for curly braces ({})
			System.out.printf("→ %d and %d are equal.\n", n1, n3);
		
	}

}
