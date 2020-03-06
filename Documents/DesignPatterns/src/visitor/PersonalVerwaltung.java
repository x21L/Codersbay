package Visitor;


// Datei: PersonalVerwaltung.java
import java.util.List;

public class PersonalVerwaltung {
	public static void main(String[] args) {
		// Initialisierungen vornehmen
		Gesellschaft firma = new Gesellschaft();
		List<Mitarbeiter> belegschaft = firma.getPersonal();

		// Besucher-Objekt fuer die Liste erzeugen
		Gehaltsdrucker besucher = new Gehaltsdrucker();

		// Ueber die Liste iterieren und Besuche durchfuehren
		for (Mitarbeiter arbeiter : belegschaft) {
			arbeiter.akzeptieren(besucher);
		}
	}
}
