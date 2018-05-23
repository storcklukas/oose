package aufgabe01;

import java.util.Random;
import java.util.Scanner;

public class Funktionswerteraten extends Spiel {

	public Funktionswerteraten() {
		super("Funktionswerteraten");
	}

	@Override
	int spiele() {
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		int funktionNummer = rand.nextInt(2);
		int x = rand.nextInt(50) + 1;

		Evaluierbar funktion = null;
		switch (funktionNummer) {
		case 0:
			funktion = new LineareFunktion();
			break;
		case 1:
			funktion = new Efunktion();
			break;
		}

		System.out.println("Schätze den y-Wert zu der " + funktion.getName() + " mit dem x-Wert " + x + ": ");
		int eingabe = reader.nextInt();

		if (Math.abs(eingabe - funktion.evaluate(x)) < 5) {
			System.out.println("Du hast gut geschätzt. Du bekommst deinen Einsatz + dem x-Wert zurück.");
			reader.close();
			return getEinsatz() + x;
		}
		
		System.out.println("Schade, du bist zu weit vom Ergebnis entfernt. Es war " + funktion.evaluate(x) + ".");
		
		reader.close();

		return 0;
	}
}
