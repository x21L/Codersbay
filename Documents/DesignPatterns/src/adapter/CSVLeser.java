package Adapter;

// Datei: CSVLeser.java
import java.io.*;
import java.util.Vector;

public class CSVLeser {
	// hat als Rueckgabewert einen Vektor vom Typ eines String-Arrays
	public Vector<String[]> lesePersonenDatei(String file) {
		Vector<String[]> personen = new Vector<String[]>();
		try {
			BufferedReader input = new BufferedReader(new FileReader(file));
			String strLine;

			while ((strLine = input.readLine()) != null) {
				String[] splitted = strLine.split(",");
				if (splitted.length >= 2)
					personen.add(new String[] { splitted[0], splitted[1] });
			}
			input.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return personen;
	}
}
