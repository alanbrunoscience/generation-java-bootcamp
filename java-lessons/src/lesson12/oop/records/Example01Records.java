package lesson12.oop.records;

public class Example01Records {

	/*
	 * Record
	 * 
	 * → Records were introduced in Java 14 and became a definitive feature starting
	 * in Java 16. They represent a special kind of immutable class, designed to
	 * store data simply and without the need for much repetitive (boilerplate)
	 * code.
	 * 
	 * → Just like traditional classes, which we just studied, records are used to
	 * create objects, but with specific characteristics that differentiate them:
	 * 
	 * • Fixed and immutable structure; • Automatically generated constructor; •
	 * Focus on representing data, not complex behaviors.
	 * 
	 * → While traditional classes can be designed for multiple behaviors and
	 * mutable states, records prioritize simplicity and immutability.
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 * What is a Record?
	 * 
	 * → A record in Java:
	 * 
	 * • Is a special way to declare an immutable class; • All fields defined in the
	 * header are final and must be initialized at the time of creation; • Can
	 * implement interfaces; • Cannot extend other classes; • Can contain additional
	 * methods and constructors, but cannot have fields outside the main header.
	 * 
	 * Syntax:
	 * 
	 * → public record RecordName(FieldType1 field1, FieldType2 field2) {}
	 * 
	 * -----------------------------------------------------------------------------
	 * 
	 * Why Use Records?
	 * 
	 * → Records are useful when we need to create classes to store simple data
	 * quickly, avoiding the code repetition we would normally write in traditional
	 * classes, such as:
	 * 
	 * • Private attributes; • Constructor that initializes all attributes; • Getter
	 * methods.
	 * 
	 * → Main advantages:
	 * 
	 * • Less code: the compiler automatically generates essential methods; •
	 * Immutability: data cannot be changed after creation; • Easy reading: the
	 * definition is clear and concise; • Perfect for DTOs (Data Transfer Objects)
	 * and API responses.
	 * 
	 */

	public static void main(String[] args) {

		Person p1 = new Person("Renata Lima", 25);
		
		System.out.println("*** Person's Data ***\n");
		System.out.printf("→ Name: %s;%n", p1.name());
		System.out.printf("→ Age: %d;%n", p1.age());
		System.out.printf("→ Person's object data: %s.%n", p1);
		
		// In the example above the compiler created the constructor and the methods 
		// 'name()' and 'age()' (equivalent to getters).

	}

	public record Person(String name, int age) {}

}
