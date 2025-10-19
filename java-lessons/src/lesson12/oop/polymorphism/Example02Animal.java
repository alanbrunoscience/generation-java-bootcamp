package lesson12.oop.polymorphism;

public class Example02Animal {

	/**
	 * Overriding
	 *
	 * → Overriding occurs when a subclass (child class) has the same
	 * method signature (same name, same parameters, same return type) as a method
	 * in its superclass (parent class). This allows a subclass to provide a
	 * specific implementation for a method that is already defined in its
	 * superclass. This is a form of Runtime Polymorphism.
	 *
	 */

	// Parent class (Superclass)
	public static class Animal {

		/**
		 * A generic method representing the action of making a sound.
		 */
		public void makeSound() {
			System.out.println("The animal makes a generic sound.");
		}
	}

	// Child class (Subclass) that inherits from Animal
	public static class Cat extends Animal {

		/**
		 * Overriding Example: The Cat class provides a specific implementation for the
		 * 'makeSound' method inherited from Animal.
		 */
		@Override
		public void makeSound() {
			// Specific implementation for Cat
			System.out.println("The cat meows.");
		}
	}

	/**
	 * Another child class for comparison.
	 */
	public static class Dog extends Animal {
		@Override
		public void makeSound() {
			System.out.println("The dog barks.");
		}
	}

	public static void main(String[] args) {
		// Runtime Polymorphism in action:

		// 1. Reference type is Animal, Object type is Animal
		Animal genericAnimal = new Animal();
		genericAnimal.makeSound(); // Output: The animal makes a generic sound.

		// 2. Reference type is Animal, Object type is Cat
		// The *actual* method called is determined at runtime based on the object's
		// type (Cat).
		Animal myCat = new Cat();
		myCat.makeSound(); // Output: The cat meows. (Overridden method is executed)

		// 3. Reference type is Animal, Object type is Dog
		Animal myDog = new Dog();
		myDog.makeSound(); // Output: The dog barks. (Overridden method is executed)
	}

}
