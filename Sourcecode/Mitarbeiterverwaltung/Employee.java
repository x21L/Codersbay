package src;

public class Employee {

	final String firstName;
	final String lastName;
	final int id;
	final Department dept;

	public Employee(String firstName, String lastName, int id, Department dept) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.dept = dept;

	}

	public Employee() {

		this.firstName = "Max";
		this.lastName = "Mustermann";
		this.id = 123;
		this.dept = new Department();

	}

	public void print() {

		System.out.println("Der Mitarbeiter \t" + id + "\t" + firstName + "\t" + lastName + "\t arbeitet in der Abteilung " + dept.name
				+ " in " + dept.city);

	}
	
	public boolean isEquals(Employee other) {

		return this.id == other.id;
	}

}
