package lesson14.interfaces;

public class AthleteApp {

	public static void main(String[] args) {

		Triathlete triathlete = new Triathlete("Alan");

		System.out.printf("→ %s is a great triathlete and is preparing to "
				+ "participate in another marathon.%nWe will monitor his performance "
				+ "in marathon races:%n%n", triathlete.getName());

		System.out.print("1º step: ");
		triathlete.warmUp();
		
		System.out.print("2º step: ");
		triathlete.swim();
		
		System.out.print("3º step: ");
		triathlete.pedal();
		
		System.out.print("4º step: ");
		triathlete.run();
		
		System.out.print("5º step: ");
		triathlete.isTired();

	}

}