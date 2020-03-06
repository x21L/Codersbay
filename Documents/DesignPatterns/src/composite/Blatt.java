package Composite;

// Datei: Blatt.java
public class Blatt extends Knoten {
	public Blatt(String name) {
		super(name);
	}

	public void operation() {
		String formatString;
		// Berechnen des Formatstrings fuer die Ausgabe von
		// Leerzeichen entsprechend der erreichten Ebene
		formatString = "%" + (ebene * 2) + "s";
		// Ausgabe der Leerzeichen
		System.out.printf(formatString, "");
		// Ausgabe eines Minuszeichens gefolgt vom Namen des Knotens
		System.out.println(" - " + super.gibName());
	}
}
