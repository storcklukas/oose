
public class Aufgabe02und03 {
	public static void main(String[] args) {
		/*
		 * Aufgabe 2) Zahl x mit einem f dran, stell diese als float in IEEE da.
		 * Ansonsten wird sie als double dargestell, insofern es keine Ganzzahl ist. 6.5
		 * ist in IEEE durch 6 + 0.5 auch mit wenigen Bits darstellbar. 6.4 ist nicht
		 * genau darstellbar, sondern nur näherungsweise. Da in Java float IEEE mit 32
		 * mit ist und double 64 bit, sind die Zahlen (float)6.4 und (double)6.5 nicht
		 * gleich.
		 */
		System.out.println(6.5f == 6.5);
		System.out.println(6.4f == 6.4);

		System.out.println(ggT(66, 385)); // Aufgabe 3 Euklidischer Algorithmus
	}

	public static long ggT(long a, long b) {
		if (a == 0)
			return b;
		else {
			while (b != 0) {
				if (a > b)
					a -= b;
				else
					b -= a;
			}
			return a;
		}
	}
}
