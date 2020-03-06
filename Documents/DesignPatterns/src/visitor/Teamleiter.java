package Visitor;

// Datei: Teamleiter.java
class Teamleiter extends Mitarbeiter {
	private String teambezeichnung;
	private float grundgehalt;
	private float praemie;

	public Teamleiter(String vorname, String name, float grundgehalt, float praemie, String teambezeichnung) {
		super(vorname, name);
		this.grundgehalt = grundgehalt;
		this.praemie = praemie;
		this.teambezeichnung = teambezeichnung;
	}

	public String getTeambezeichnung() {
		return teambezeichnung;
	}

	public void setTeambezeichnung(String teambezeichnung) {
		this.teambezeichnung = teambezeichnung;
	}

	public float getGrundgehalt() {
		return this.grundgehalt;
	}

	public void setGrundgehalt(float grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	public float getPraemie() {
		return this.praemie;
	}

	public void setPraemie(float praemie) {
		this.praemie = praemie;
	}

	public void akzeptieren(MitarbeiterBesucher v) {
		// sich selbst besuchen lassen
		v.besuchen(this);
	}
}
