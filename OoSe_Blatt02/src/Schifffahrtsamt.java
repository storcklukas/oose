/*
 * für Aufgabe 4
 */
public class Schifffahrtsamt {
	static Schiff[] schiffliste;
	static int anzahlSchiffe = 0; 
	
	public Schifffahrtsamt() {
		schiffliste = new Schiff[50];
	}
	
	void registriereSchiff(Schiff name) {
		if (anzahlSchiffe < 50) {
			schiffliste[anzahlSchiffe] = name;
			anzahlSchiffe++;
		} else
			System.out.println("Schiffliste ist leider voll. Das Schiff wurde nicht aufgenommen!");
	}

	void meldung(String nachricht, int dringlichkeit) {
		if (dringlichkeit == 1) {
			for (int i = 0; i < anzahlSchiffe; i++)
				schiffliste[i].empfangeNachricht(nachricht);
		}
	}

	public static String getKennzeichen() {
		java.util.Random rnd = new java.util.Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append((char) ((rnd.nextInt(25) + 65)));
		}
		return sb.toString();
	}
}
