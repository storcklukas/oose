
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
	
	public Sheep cloneDeep() { // Objektkopie
		Sheep schafNeu = new Sheep(name, new Fur(fur.length));
		return schafNeu;
	}
	
	public Sheep cloneShallow() { // Referenzkopie wie clone()
		Sheep schafNichtSoWirklichNeu = this;
		return schafNichtSoWirklichNeu;
	}
	
	public void isEqual(Sheep otherSheep) {
		if (this.name == otherSheep.name && this.fur.length == otherSheep.fur.length) System.out.println("true");
		else System.out.println("false");
	}
}
