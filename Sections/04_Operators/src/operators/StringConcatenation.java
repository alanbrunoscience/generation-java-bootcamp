package operators;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String text01 = "Generation";
		String text02 = "Brasil";
		String text03 = " ";
		
		System.out.println("Concatenate text01 and text02: " + text01 + text02);
		System.out.println("Concatenate text02 and text01: " + text02 + text01);
		System.out.println("Concatenate text01, text03 and text02: " + text01 + text03 + text02);

	}

}
