/*
 * Verwendung: nur ein Objekt einer Klasse (einfache Struktur zum sicherstellen eine klaren Abfolge von verschiedenen Eingaben: Netzwerkdrucken) 
 * 
 */
public class Singleton { // Aufgabe 4a
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (Singleton.instance == null) {
			Singleton.instance = new Singleton();
		}
		return Singleton.instance;
	}
}
