package lesson13.oop2inheritance;

public class Car extends LandTransport {

	private String color;
	private int numberOfDoors;
	private String registrationPlate;
	private int gear;

	public Car(int capacity, int numberOfWheels, float speed, String color, int numberOfDoors, String registrationPlate,
			int gear) {
		super(capacity, numberOfWheels, speed);
		this.setColor(color);
		this.setNumberOfDoors(numberOfDoors);
		this.setRegistrationPlate(registrationPlate);
		this.setGear(gear);
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfDoors() {
		return this.numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		if (numberOfDoors <= 0) {
			throw new IllegalArgumentException("\n-> Invalid number of doors! The number of doors must be greater than 0.");
		}
		this.numberOfDoors = numberOfDoors;
	}

	public String getRegistrationPlate() {
		return this.registrationPlate;
	}

	public void setRegistrationPlate(String registrationPlate) {
		this.registrationPlate = registrationPlate;
	}

	public int getGear() {
		return this.gear;
	}

	public void setGear(int gear) {
		if (gear < 0) {
			throw new IllegalArgumentException("\n-> Invalid gear! The gear must be greater than or equal to 0.");
		}
		this.gear = gear;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.printf("→ Color: %s%n", this.color);
		System.out.printf("→ Number of Doors: %d%n", this.numberOfDoors);
		System.out.printf("→ Vehicle Registration Plate: %s%n", this.registrationPlate);
		System.out.printf("→ Gear: %d%n", this.gear);
	}
	
}
