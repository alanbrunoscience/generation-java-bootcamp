package lesson17.lambdaexpressions;

@FunctionalInterface
interface Action {
	void execute(String message);
}

public class Example04LambdaExpressionWithoutReturn {

	public static void main(String[] args) {

		String phrase = "Hello! I'm Bill Gates.";
		
		Action action = msg -> {
			System.out.println("Action: " + msg);
		};
		
		action.execute(phrase);
		
		System.out.println("\n→ Execution finished.");
		
	}

}
