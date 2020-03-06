package Adapter;

// Datei: Person.java
public class Person {
	private String nachname;
	private String vorname;

	public Person(String nachname, String vorname) {
		this.nachname = nachname;
		this.vorname = vorname;
	}

	public void print() {
		System.out.println(vorname + " " + nachname);
	}
}
