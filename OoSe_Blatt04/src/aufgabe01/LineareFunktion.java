package aufgabe01;

import java.lang.Math; // macht Eclipse anscheinend automatisch, wie man an Efunktion.java und Funktionswerteraten.java sieht xD

public class LineareFunktion implements Evaluierbar {
	@Override
	public String getName() {
		return "lineare Funktion f(x) = 2.2 * x";
	}

	@Override
	public int evaluate(int x) {
		return (int) Math.round(x * 2.2);
	}
}
