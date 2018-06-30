package aufgabe02;

public class TNode {
	private int wert = 0;
	private TNode links = null;
	private TNode rechts = null;

	TNode(int wert) {
		this.wert = wert;
	}
	
	TNode(int wert, TNode links, TNode rechts) {
		this.wert = wert;
		this.links = links;
		this.rechts = rechts;
	}
	
	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}

	public TNode getLinks() {
		return links;
	}

	public void setLinks(TNode links) {
		this.links = links;
	}

	public TNode getRechts() {
		return rechts;
	}

	public void setRechts(TNode rechts) {
		this.rechts = rechts;
	}
}
