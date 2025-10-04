package lesson15.abstractclasses;

import java.util.Locale;

public class Example01AbstractClassAndMethods {

	// Abstract Class: Cannot be instantiated directly (e.g., new Shape() is
	// forbidden).
	// It serves as a blueprint for concrete subclasses.
	public static abstract class Shape {

		protected String name;

		public Shape(String name) {
			this.name = name;
		}

		/**
		 * Abstract Method: Must be declared without an implementation (no method body,
		 * ends with a semicolon). Any concrete subclass must provide an implementation
		 * for this method (Overriding). This enforces a contract: every Shape MUST know
		 * how to calculate its area. Abstract methods can only be declared in abstract
		 * classes.
		 * 
		 * @return The area of the shape.
		 */
		public abstract double calculateArea();

		/**
		 * Concrete Method: Has a full implementation and can be inherited and used
		 * directly. This method provides common functionality for all Shapes.
		 */
		public void displayInfo() {
			System.out.println("\n--- " + this.name + " ---\n");
			// We can call the abstract method here, relying on the subclass to implement
			// it.
			System.out.printf("→ Area: %.2f%n", calculateArea());
		}
	}

	// Concrete Subclass 1
	public static class Circle extends Shape {

		private double radius;

		public Circle(double radius) {
			super("Circle"); // Calls the abstract class constructor
			this.radius = radius;
		}

		/**
		 * Mandatory Overriding: Provides the specific implementation for the abstract
		 * method defined in the parent class (Shape).
		 */
		@Override
		public double calculateArea() {
			return Math.PI * radius * radius;
		}
	}

	// Concrete Subclass 2
	public static class Rectangle extends Shape {

		private double width;
		private double height;

		public Rectangle(double width, double height) {
			super("Rectangle"); // Calls the abstract class constructor
			this.width = width;
			this.height = height;
		}

		/**
		 * Mandatory Overriding: Provides the specific implementation for the abstract
		 * method defined in the parent class (Shape).
		 */
		@Override
		public double calculateArea() {
			return width * height;
		}
	}

	// Main class to demonstrate usage
	public static class AbstractDemo {
		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);

			// Polymorphism with Abstract Classes:
			// Reference type is the abstract class (Shape), but object type is the concrete
			// class.
			Shape circle = new Circle(5.0);
			Shape rectangle = new Rectangle(4.0, 6.0);

			// We call the concrete method 'displayInfo', which internally calls the
			// specific 'calculateArea' method determined at runtime (Runtime Polymorphism).
			System.out.println("Demonstrating Abstract Methods:");

			// Output will show Circle's specific area calculation
			circle.displayInfo();

			// Output will show Rectangle's specific area calculation
			rectangle.displayInfo();
		}
	}
}