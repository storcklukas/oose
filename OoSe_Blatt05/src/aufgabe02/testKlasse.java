package aufgabe02;

import java.util.ArrayList;

public class testKlasse {

	public static void main(String[] args) {
		ArrayList<Körper> list = new ArrayList<>();
		list.add(new Kugel(3,2,4,4));
		list.add(new Kugel(3,2,4,4));
		list.add(new Quader(1,1,1,1,1,1));
		list.add(new Kugel(2,2,2,2));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
