package lesson08.twodimensionalarray;

public class Example07TraversingAMatrixWithForEach {

	public static void main(String[] args) {

		// Two-dimensional array declaration
		String students[][] = { { "Felipe", "Jonas", "Julia" }, { "Mariana", "Carlos", "Juliana" },
				{ "Augusto", "Sabrina", "Julius" } };

		int count = 0;

		System.out.println("****** Students ******\n");
		for (String[] row : students) {
			for (String student : row) {
				System.out.printf("→ %dº student: %s\n", (count + 1), student);
				count++;
			}
		}

	}

}
