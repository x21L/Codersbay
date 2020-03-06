package Visitor;


// Datei: Gesellschaft.java
import java.util.ArrayList;
import java.util.List;

// Diese Klasse repraesentiert eine Firma und enthaelt ihre 
// Mitarbeiter
class Gesellschaft {
	private List<Mitarbeiter> personal;

	public Gesellschaft() {
		this.personal = new ArrayList<Mitarbeiter>();
		initialisiereBeispieldaten();
	}

	private void initialisiereBeispieldaten() {
		// Sachbearbeiter Team 1
		ArrayList<Mitarbeiter> team1 = new ArrayList<Mitarbeiter>();

		team1.add(new Sachbearbeiter("Markus", "Mueller ", 48200.0f));
		team1.add(new Sachbearbeiter("Silvia", "Neustedt", 45500.0f));

		// Sachbearbeiter Team 2
		ArrayList<Mitarbeiter> team2 = new ArrayList<Mitarbeiter>();

		team2.add(new Sachbearbeiter("Alexandra", "Weiss", 37120.0f));
		team2.add(new Sachbearbeiter("Michael", "Kienzle", 35500.0f));

		// Teamleiter
		Teamleiter chef1, chef2;

		chef1 = new Teamleiter("Frank", "Hirschle", 40000.0f, 400.0f, "Team 1");
		chef2 = new Teamleiter("Corinna", "Steib", 35000.0f, 350.0f, "Team 2");

		// alle Personen in die Personalliste
		this.personal.add(chef1);
		this.personal.add(chef2);
		this.personal.addAll(team1);
		this.personal.addAll(team2);
	}

	public List<Mitarbeiter> getPersonal() {
		return personal;
	}
}
