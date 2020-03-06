package Composite;

// Datei: Knoten.java
import java.util.ArrayList;

public abstract class Knoten {
	private String name = "";
	static int ebene = 0; // Zaehler fuer Ausgabe-Ebene
	ArrayList<Knoten> kindelemente = new ArrayList<Knoten>();

	public Knoten(String name) {
		this.name = name;
	}

	public abstract void operation();

	public void hinzufuegen(Knoten komp) {
		System.out.println("Kind-Methode nicht implementiert!");
	}

	public void entfernen(Knoten komp) {
		System.out.println("Kind-Methode nicht implementiert!");
	}

	public void gibKind() {
		System.out.println("Kind-Methode nicht implementiert!");
	}

	public String gibName() {
		return this.name;
	}
}
