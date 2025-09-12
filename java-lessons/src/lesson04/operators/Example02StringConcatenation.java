package lesson04.operators;

public class Example02StringConcatenation {

	public static void main(String[] args) {
		
		// Variables declaration
		String text01 = "Generation";
		String text02 = "Brazil";
		String text03 = " ";
		
		// Data output
		System.out.printf("text01 = %s\n", text01); // text01 = Generation
		System.out.printf("text02 = %s\n", text02); // text02 = Brazil
		System.out.printf("text03 = '%s'\n", text03); // text03 = ' '
		System.out.println("\n1) Concatenate 'text01' with 'text02': " + text01 + text02); // 1) Concatenate 'text01' with 'text02': GenerationBrasil 
		System.out.println("2) Concatenate 'text02' with 'text01': " + text02 + text01); // 2) Concatenate 'text02' with 'text01': BrasilGeneration
		System.out.println("3) Concatenate 'text01', 'text03' and 'text02': " + text01 + text03 + text02); // 3) Concatenate 'text01', 'text03' and 'text02': Generation Brazil

	}

}
