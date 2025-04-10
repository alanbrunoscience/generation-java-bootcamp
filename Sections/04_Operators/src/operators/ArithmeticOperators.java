package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int x = 4, w = -5, y = 2, z = 3;
		
		System.out.printf("%d + %d = %d\n", x, y, (x + y));
		System.out.printf("%d + %d = %d\n", x, y, (x + w));
		System.out.printf("%d - %d = %d\n", x, y, (x - y));
		System.out.printf("%d * %d = %d\n", x, y, (x * y));
		System.out.printf("%d / %d = %d\n", x, y, (x / y));
		System.out.printf("%d %% %d = %d\n", x, 2, (x % 2));
		System.out.printf("%d %% %d = %d\n", x, 2, (z % 2));

	}

}
