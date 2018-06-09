package aufgabe02;

public class Quader extends Körper {
	double breite, höhe, tiefe;
	
	public Quader(double p1, double p2, double p3, double breite, double höhe, double tiefe) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.breite = breite;
		this.höhe = höhe;
		this.tiefe = tiefe;
	}

	@Override
	public void skaliere(double a) {
		breite *= a;
		höhe *= a;
		tiefe *= a;
	}

	@Override
	public double volumen() {
		return breite*höhe*tiefe;
	}

	@Override
	public String art() {
		return "Quader";
	}

}
