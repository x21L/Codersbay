package Visitor;

// Datei: Mitarbeiter.java
abstract class Mitarbeiter {
	protected int personalnummer;
	private static int anzahlMitarbeiter = 0;
	protected String name;
	protected String vorname;

	Mitarbeiter(String vorname, String name) {
		this.personalnummer = anzahlMitarbeiter++;
		this.vorname = vorname;
		this.name = name;
	}

	public int getPersonalnummer() {
		return personalnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String toString() {
		return ("PersonalNr." + this.personalnummer + "Name:" + this.vorname + " " + this.name);
	}

	public abstract void akzeptieren(MitarbeiterBesucher v);
}
