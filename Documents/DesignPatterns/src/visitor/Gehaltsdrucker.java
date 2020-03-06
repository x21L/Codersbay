package Visitor;

// Datei: Gehaltsdrucker.java
class Gehaltsdrucker extends MitarbeiterBesucher {
	public Gehaltsdrucker() {
		System.out.print("***************************************");
		System.out.println("***************************");
		System.out.println("                        Gehaltsliste");
		System.out.print("Position" + "\t" + "Vorname" + "\t" + "\t" + "Name" + "\t" + "\t");
		System.out.println("Gehalt" + "\t" + "  Praemie");
		System.out.print("***************************************");
		System.out.println("***************************");
	}

	public void besuchen(Teamleiter t) {
		String vorname;
		String name;
		if (t.getVorname().length() < 8)
			vorname = t.getVorname().concat("\t");
		else
			vorname = t.getVorname();

		if (t.getName().length() < 8)
			name = t.getName().concat("\t");
		else
			name = t.getName();

		System.out.print("Leiter " + t.getTeambezeichnung() + "\t" + vorname + "\t" + name + "\t");
		System.out.printf("%7.2f", t.getGrundgehalt());
		System.out.printf("%3.2f", t.getPraemie());
		System.out.println();
	}

	public void besuchen(Sachbearbeiter s) {
		String vorname;
		String name;
		if (s.getVorname().length() < 8)
			vorname = s.getVorname().concat("\t");
		else
			vorname = s.getVorname();

		if (s.getName().length() < 8)
			name = s.getName().concat("\t");
		else
			name = s.getName();

		System.out.print("Sachbearbeiter" + "\t" + vorname + "\t" + name + "\t");
		System.out.printf("%7.2f", s.getGehalt());
		System.out.println("  ---");
	}
}
