
public class SheepClone implements Cloneable {
	public String name;
	public Fur fur;

	public SheepClone(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}

	public void shear() {
		fur.length = 0;
	}

	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}
	
	public Object clone() throws CloneNotSupportedException { // Override mit "@Override" ??
		return super.clone();
	}
	
	public void isEqual(SheepClone otherSheep) {
		if (this.name == otherSheep.name && this.fur.length == otherSheep.fur.length) System.out.println("true");
		else System.out.println("false");
	}
}
