package aufgabe01;

public abstract class Spiel {
	private String name;
	private int einsatz; // für Nachkommastellen (wie z.B.: 2,50 € wäre float besser)
	
	protected void setEinsatz(int einsatz) {
		this.einsatz = einsatz;
	}
	
	protected int getEinsatz() {
		return einsatz;
	}
	
	Spiel(String name) {
		this.name = name;
	}
	
	protected String getName() {
		return name;
	}
	
	abstract int spiele();
}
