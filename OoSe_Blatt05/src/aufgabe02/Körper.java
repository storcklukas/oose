package aufgabe02;

public abstract class Körper {
	double p1, p2, p3;
	
	public void verschiebe(double p1, double p2, double p3) {
		this.p1 += p1;
		this.p2 += p2;
		this.p3 += p3;
	}
	
	public abstract void skaliere(double a);
	public abstract double volumen();
	public abstract String art();
	
	public String toString() {
		return "Art: " + this.art() + ", Volumen: " + volumen() + ", Position: " + p1 + ", " + p2 + ", " + p3;
	}
}
