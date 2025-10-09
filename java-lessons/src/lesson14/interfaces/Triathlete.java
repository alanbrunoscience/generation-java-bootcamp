package lesson14.interfaces;

public class Triathlete extends Person implements Swimmer, Runner, Cyclist {

	public Triathlete(String name) {
		super(name);
	}
	
	@Override
	public void warmUp() {
		System.out.println("Warming up");
	}
	
	@Override
	public void pedal() {
		System.out.println("Cycling");
	}
	
	@Override
	public void run() {
		System.out.println("Running");
	}
	
	@Override
	public void swim() {
		System.out.println("Swimming");
	}

}
