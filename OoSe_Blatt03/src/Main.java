
public class Main {
	public static void main(String[] args) {
		System.out.println("Aufgabenteil a)"); // Aufgabenteil a)
		
		Sheep schaf01 = new Sheep("Schaf 01", new Fur(10));
		Sheep schaf02 = schaf01.clone();
		
		System.out.println(schaf01.toString());
		System.out.println(schaf02.toString());
		
		schaf02.name = "Schaf 02";
		schaf02.shear();
		
		System.out.println(schaf01.toString());
		System.out.println(schaf02.toString());
		
		System.out.println("Aufgabenteil b)"); // Aufgabenteil b)
		
		Sheep schaf03 = new Sheep("Schaf 03", new Fur(10));
		Sheep schaf04 = schaf03.cloneShallow();
		Sheep schaf05 = schaf03.cloneDeep();
		
		schaf04.name = "Schaf 04";
		schaf04.shear();
		schaf05.name = "Schaf 05";
		schaf05.shear();
		
		System.out.println(schaf03.toString());
		System.out.println(schaf04.toString());
		System.out.println(schaf05.toString());
		
		System.out.println("Aufgabenteil c)"); // Aufgabenteil c)
		
		schaf01.isEqual(schaf02);
		schaf04.isEqual(schaf05);
		
		/*
		 * Aufgabenteil d)
		 * mit Interface Cloneable kann Objekte einfach Clonen (Objekt.clone())
		 */
		System.out.println("Aufgabenteil d)");
		
		SheepClone schaf06 = new SheepClone("Schaf 06", new Fur(10));
		SheepClone schaf07;
		try {
			schaf07 = (SheepClone) schaf06.clone();
			schaf06.isEqual(schaf07);
			
			schaf06.shear();
			schaf07.name = "Schaf07";
			
			System.out.println(schaf06.toString());
			System.out.println(schaf07.toString());
			schaf06.isEqual(schaf07);
		} catch (CloneNotSupportedException e) {
			System.out.println("This object cannot be cloned.");
		}
	}
}
