package Visitor;

// Datei: MitarbeiterBesucher.java
abstract class MitarbeiterBesucher {
	public abstract void besuchen(Teamleiter t);

	public abstract void besuchen(Sachbearbeiter s);
}
