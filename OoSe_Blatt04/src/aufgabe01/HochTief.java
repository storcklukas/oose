package aufgabe01;

import java.util.Random;
import java.util.Scanner;

public class HochTief extends Spiel {
	HochTief() {
		super("HochTief");
	}

	@Override
	int spiele() {
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		int zahl = rand.nextInt(101);
		int versuche = 0;
		int eingabe = -1;

		while (zahl != eingabe && versuche < 5) {
			System.out.println("Errate die Zahl: ");
			eingabe = reader.nextInt();

			if (zahl == eingabe) {
				System.out.println("Du hast die Zahl erraten! Du erhältst den doppelten Einsatz zurück!");
				reader.close();
				return getEinsatz() * 2;
			} else if (zahl > eingabe) {
				System.out.println("Deine Zahl war zu klein.");
				versuche++;
			} else {
				System.out.println("Deine Zahl war zu groß.");
				versuche++;
			}
		}

		reader.close();

		System.out.println("Schade, du hast die Zahl nicht erraten. Sie war " + zahl + ".");

		return 0;
	}

}
