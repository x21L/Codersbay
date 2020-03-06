package Adapter;

// Datei: IPersonenLeser.java
import java.util.Vector;

public interface IPersonenLeser {
	// hat als Rueckgabewert einen Vektor von Personen
	public Vector<Person> lesePersonen();
}
