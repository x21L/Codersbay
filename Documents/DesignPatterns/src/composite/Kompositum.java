package Composite;

// Datei: Kompositum.java
import java.util.Iterator;

public class Kompositum extends Knoten {
	public Kompositum(String name) {
		super(name);
	}

	public void hinzufuegen(Knoten komp) {
		this.kindelemente.add(komp);
	}

	public void entfernen(Knoten komp) {
		// alle Kindelemente durchlaufen
		for (Iterator<Knoten> iter = kindelemente.iterator(); iter.hasNext();) {
			Knoten f = (Knoten) iter.next();
			if (f instanceof Kompositum) {
				((Kompositum) f).entfernen(komp);
			}
		}
		kindelemente.remove(komp);
	}

	public void operation() {
		String formatString;
		// Berechnen der neuen Ausgabe-Ebene
		ebene++;
		// Berechnen des Formatstrings fuer die Ausgabe von
		// Leerzeichen entsprechend der erreichten Ebene
		formatString = "%" + (ebene * 2) + "s";
		// Ausgabe der Leerzeichen
		System.out.printf(formatString, "");
		// Ausgabe eines Pluszeichens gefolgt vom Namen der Komponente
		System.out.println("+ " + super.gibName() + "");
		// Aufruf der Operation fuer alle Kindelemente
		for (Iterator<Knoten> iter = kindelemente.iterator(); iter.hasNext();) {
			Knoten f = (Knoten) (iter.next());
			f.operation();
		}
		// Ausgabe-Ebene wieder zuruecksetzen
		--ebene;
	}
}
