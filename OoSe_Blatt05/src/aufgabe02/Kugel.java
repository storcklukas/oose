package aufgabe02;

public class Kugel extends Körper {
	double radius;
	
	public Kugel(double p1, double p2, double p3, double radius) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.radius = radius;
	}

	@Override
	public void skaliere(double a) {
		radius *= a;
	}

	@Override
	public double volumen() {
		return 4/3*Math.PI*Math.pow(radius, 3);
	}
	
	@Override
	public String art() {
		return "Kugel";
	}
}
