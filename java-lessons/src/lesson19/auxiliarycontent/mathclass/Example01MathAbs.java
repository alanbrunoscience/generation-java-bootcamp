package lesson19.auxiliarycontent.mathclass;

public class Example01MathAbs {
	
	/**
	 * Math.abs(x)
	 * 
	 * → Returns the absolute value of a 'float', 'int', 'long', or 'double' argument.
	 * 
	 */

	public static void main(String[] args) {
		
		int n1 = 0, n2 = -1, n3 = 1;
		
		System.out.println("=== Math.abs(x) ===\n");
		System.out.printf("→ 1) Absolute value of '%d' = %d;%n", n1, Math.abs(n1)); // 0
		System.out.printf("→ 2) Absolute value of '%d' = %d;%n", n2, Math.abs(n2)); // 1
		System.out.printf("→ 3) Absolute value of '%d' = %d.%n", n3, Math.abs(n3)); // 1
		
	}

}
