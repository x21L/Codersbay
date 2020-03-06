package Visitor;

// Datei: Sachbearbeiter.java
class Sachbearbeiter extends Mitarbeiter {
	private float gehalt;

	public Sachbearbeiter(String vorname, String name, float gehalt) {
		super(vorname, name);
		this.gehalt = gehalt;
	}

	public float getGehalt() {
		return gehalt;
	}

	public void akzeptieren(MitarbeiterBesucher v) {
		// sich selbst besuchen lassen
		v.besuchen(this);
	}
}
