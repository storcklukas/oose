/*
 * f�r Aufgabe 4
 */
public class Schiff {
	private String name;
	private String kennzeichen;
	private double l�nge;

	public Schiff(String input_name, double input_l�nge) {
		name = input_name;
		l�nge = input_l�nge;
	}

	void setKennzeichen(String input_kennzeichen) {
		kennzeichen = input_kennzeichen;
	}

	void empfangeNachricht(String msg) {
		System.out.println();
		System.out.println("Empfangen von " + name + "/" + kennzeichen + ": " + msg);
	}
}
