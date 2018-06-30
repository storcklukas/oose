package aufgabe01;

public class DoubleNode {
	private double wert = 0;
	private DoubleNode nachfolger = null;

	DoubleNode() {
	}

	DoubleNode(double wert) {
		setWert(wert);
	}

	public double getWert() {
		return wert;
	}

	public void setWert(double wert) {
		this.wert = wert;
	}

	public DoubleNode getNachfolger() {
		return nachfolger;
	}

	public void setNachfolger(DoubleNode nachfolger) {
		this.nachfolger = nachfolger;
	}
}
