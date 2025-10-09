package lesson16.optional.optionalmethods2.model;

public class Collaborator {

	private Long id;
	private String name;
	private Float salary;

	public Collaborator(Long id, String name, Float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return this.salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
