package aufgabe02;

public class Quader extends K�rper {
	double breite, h�he, tiefe;
	
	public Quader(double p1, double p2, double p3, double breite, double h�he, double tiefe) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.breite = breite;
		this.h�he = h�he;
		this.tiefe = tiefe;
	}

	@Override
	public void skaliere(double a) {
		breite *= a;
		h�he *= a;
		tiefe *= a;
	}

	@Override
	public double volumen() {
		return breite*h�he*tiefe;
	}

	@Override
	public String art() {
		return "Quader";
	}

}
