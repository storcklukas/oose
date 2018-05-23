package aufgabe01;

import java.util.Scanner;

public class Spielemanager {
	private int kapital;

	public Spielemanager(int kapital) {
		this.kapital = kapital;
	}

	public void starteSpiel(Spiel sp) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Wie viel möchtest du setzten?");
		int eingabe = reader.nextInt();

		while (!(eingabe <= getKapital() && eingabe > 0)) {
			System.out.println("Dein Einsatz muss größer als Null sind und darf dein Kapital von " + getKapital()
					+ " nicht übersteigen.");
			eingabe = reader.nextInt();
		}

		sp.setEinsatz(eingabe);
		kapital -= eingabe;
		System.out.println("Deine Kapital beträgt nun " + getKapital() + ".");
		int gewinn = sp.spiele();
		kapital += gewinn;
		System.out.println("Deine Kapital beträgt nun " + getKapital() + ".");
		reader.close();
	}

	public int getKapital() {
		return kapital;
	}
}
