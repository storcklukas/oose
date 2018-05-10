
public class Sheep {
	public String name;
	public Fur fur;

	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}

	public void shear() {
		fur.length = 0;
	}

	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}

	public Sheep clone() {
		return this;
	}
}
