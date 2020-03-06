package Adapter;


// Datei: TestAdapter.java
import java.util.Vector;

public class TestAdapter {
	public static void main(String[] args) {
		IPersonenLeser leser = new CSVLeserAdapter("Personen.csv");
		Vector<Person> personen = leser.lesePersonen();

		for (Person person : personen)
			person.print();
	}
}
