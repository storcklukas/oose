
/*
 * Als erstes ist zu sagen, dass im Aufgaben Quelltext eine "}" zu viel ist...
 * Ausgaben:
 * 1: false
 * 2: true
 * 3: 45
 * 4: 45
 * 5: 28
 * 6: 16
 * 7: 10.0
 * 
 * 1) die Werte von a und b sind nicht gleich
 * 2) b-19 = 15 und damit sind beide Seiten von "==" gleich
 * 3) 00001111 und 00100010 mit xor -> 00101101 = 32 + 8 + 4 + 1 = 45
 * 4) a wird erst nach der Zeile inkrementiert, also 3)							ab jetzt a=16
 * 5) 00000111 bitshift um zwei nach links -> 00011100 = 16 + 8 + 4 = 28		ab jetzt c=2
 * 6) Zuweisungen von rechts nach links: Hexadezimal-zahl: 16+0 = 16 Wert der Zuweisung (siehe Aufgabe 2 f))
 * 7) Exponentenschreibweise: 10^1 = 10
 * 
 */
public class Operatoren {
	public static void main(String[] args) {
		int a = 15;
		int b = 34;
		int c = 1;
		System.out.println("1: " + (a == b));
		System.out.println("2: " + (a == b - 19));
		System.out.println("3: " + (a ^ b));
		System.out.println("4: " + (a++ ^ b));
		System.out.println("5: " + (7 << ++c));
		System.out.println("6: " + (a = b = c = 0x10));
		System.out.println("7: " + (1e1));
	}
}
