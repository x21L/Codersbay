package src;

public class Department {
	
	final String name;
	final int deptno;
	final String country;
	final String city;

	public Department(String name, int deptno, String country, String city) {

		this.name = name;
		this.deptno = deptno;
		this.country = country;
		this.city = city;

	}
	
	public Department() {
		
		this.name = "Test";
		this.deptno = 123;
		this.country = "Neverland";
		this.city = "Gotham";
		
	}
	
	
	public boolean isEquals(Department other) {
		
		return this.deptno == other.deptno;
	}
}
