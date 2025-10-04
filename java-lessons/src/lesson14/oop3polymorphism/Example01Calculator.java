package lesson14.oop3polymorphism;

public class Example01Calculator {

	/**
	 * Overloading
	 * 
	 * → Overloading occurs when MULTIPLE METHODS IN THE SAME CLASSE have the SAME
	 * NAME but DIFFERENT PARAMETERS (different number or type of arguments). The
	 * compiler decides which method to call based on the arguments provided.
	 * 
	 * → Example: 'add' method with different signatures.
	 * 
	 */

	/**
	 * Adds two integers. This is the first version of the add method.
	 * 
	 * @param a The first integer.
	 * @param b The second integer.
	 * @return The sum of the two integers.
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * Adds three integers. This is an overloaded version of the add method
	 * (different number of parameters).
	 * 
	 * @param a The first integer.
	 * @param b The second integer.
	 * @param c The third integer.
	 * @return The sum of the three integers.
	 */
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	/**
	 * Adds two doubles. This is another overloaded version (different type of
	 * parameters).
	 * 
	 * @param a The first double.
	 * @param b The second double.
	 * @return The sum of the two doubles.
	 */
	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {

		Example01Calculator calc = new Example01Calculator();

		// The compiler determines which 'add' method to call based on the arguments.
		System.out.println("Adding two integers: " + calc.add(10, 5));
		System.out.println("Adding three integers: " + calc.add(10, 5, 2));
		System.out.println("Adding two doubles: " + calc.add(10.5, 5.3));

	}

}
