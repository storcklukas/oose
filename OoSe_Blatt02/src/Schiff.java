/*
 * für Aufgabe 4
 */
public class Schiff {
	private String name;
	private String kennzeichen;
	private double länge;

	public Schiff(String input_name, double input_länge) {
		name = input_name;
		länge = input_länge;
	}

	void setKennzeichen(String input_kennzeichen) {
		kennzeichen = input_kennzeichen;
	}

	void empfangeNachricht(String msg) {
		System.out.println();
		System.out.println("Empfangen von " + name + "/" + kennzeichen + ": " + msg);
	}
}
