package lesson13.oop2inheritance;

public abstract class LandTransport extends Transport {
	
	protected int numberOfWheels;
	protected float speed;
	
	public LandTransport(int capacity, int numberOfWheels, float speed) {
		super(capacity);
		this.setNumberOfWheels(numberOfWheels);
		this.setSpeed(speed);
	}
	
	public int getNumberOfWheels() {
		return this.numberOfWheels;
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		if (numberOfWheels <= 0) {
			throw new IllegalArgumentException("\n-> Invalid number of wheels! The number of wheels must be greater than 0.");
		}
		this.numberOfWheels = numberOfWheels;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(float speed) {
		if (speed < 0.00f) {
			throw new IllegalArgumentException("\n-> Invalid speed! The speed must be greater than or equal to 0.");
		}
		this.speed = speed;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.printf("→ Number of Wheels: %d%n", this.numberOfWheels);
		System.out.printf("→ Speed: %.2f%n", this.speed);
	}

}
