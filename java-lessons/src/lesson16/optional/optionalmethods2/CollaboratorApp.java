package lesson16.optional.optionalmethods2;

import java.util.Optional;

import lesson16.optional.optionalmethods2.model.Collaborator;

public class CollaboratorApp {

	public static void main(String[] args) {

		Collaborator c1 = new Collaborator(1L, "James Bond", 1000.0f);

		Optional<Collaborator> collaboratorOptional = Optional.of(c1);

		collaboratorOptional.map(response -> response.getName())
				.filter(collaboratorName -> collaboratorName.startsWith("J"))
				.orElseThrow(() -> new RuntimeException("\n→ Collaborator not found!"));
		
		System.out.printf("→ Collaborator name: %s.%n", collaboratorOptional.get().getName());

	}

}
