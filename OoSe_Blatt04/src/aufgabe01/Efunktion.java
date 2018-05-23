package aufgabe01;

public class Efunktion implements Evaluierbar {
	@Override
	public String getName() {
		return "e-Funktion f(x) = e^x";
	}

	@Override
	public int evaluate(int x) {
		return (int) Math.round(Math.exp(x)); // ab 74 nicht mehr als int darstellbar und ab 4 nicht mehr auf +/- 5 genau abschätzbar... gute Aufgabenstellung xD
	}
}
