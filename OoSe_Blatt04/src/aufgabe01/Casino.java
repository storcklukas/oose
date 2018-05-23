package aufgabe01;

import java.util.Scanner;

public class Casino {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Spielemanager smgr = new Spielemanager(50);
		System.out.println("Was möchtest du spielen? Funktionswerteraten(1) oder HochTief(2)?");
		int eingabe = reader.nextInt();
		Spiel spiel = null;

		switch (eingabe) {
		case 1:
			spiel = new Funktionswerteraten();
			break;
		case 2:
			spiel = new HochTief();
			break;
		}
		smgr.starteSpiel(spiel);
		reader.close();
	}
}
