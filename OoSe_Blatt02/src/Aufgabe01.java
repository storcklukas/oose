/*
 * Hinweis: Je nach implementation, können auch schon bei recht kleinen Zahlen fehlerhafte Ergebnisse auftreten. Woran liegt das?
 */
public class Aufgabe01 {
	public static long fak(long n) { // Fakultätsfunktion
		if (n > 1)
			return (n * (fak(n - 1)));
		else if (n == 1)
			return 1;
		else {
			System.out.println("n ist kleiner 1. Nicht definiert.");
			return 0;
		}
	}

	public static long bin(long n, long k) { // Binominalkoeffizient
		long rück = 0;
		if ((0 <= k) && (k <= n)) {
			rück = fak(n) / (fak(k) * fak(n - k));
		}
		return rück;
	}

	public static long lotto(long n, long k) { // modifiziertes Lottoproblem
		return (bin(n, k) * fak(k));
	}

	public static void main(String[] args) {
		System.out.println(fak(3)); // a
		System.out.println(bin(6, 4)); // b
		System.out.println(lotto(6, 4)); // c
	}
}
