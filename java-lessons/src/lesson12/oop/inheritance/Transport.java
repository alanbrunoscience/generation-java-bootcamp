package lesson12.oop.inheritance;

public abstract class Transport {

	protected int capacity;

	public Transport(int capacity) {
		this.setCapacity(capacity);
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("\n-> Invalid capacity! The capacity must be greater than 0.");
		}
		this.capacity = capacity;
	}

	public void display() {
		System.out.println("\n**************************************************");
		System.out.println("                 Transportation Data              ");
		System.out.println("**************************************************\n");
		System.out.printf("→ Capacity: %d%n", this.capacity);
	}

}
