package aufgabe04;

import java.util.ArrayList;

public class Primfaktorzerlegung {
	void zerhackeAlleZahlen(int a, int b) {
		for (int i = a; i <= b; i++) {
			ArrayList<Integer> list = zerhackeDieZahl(i);
//			System.out.println(i + ": " + list.toString());
		}
	}
	
	ArrayList<Integer> zerhackeDieZahl(int n) {
		if (n < 2) {
			System.out.println("Zahl zu klein");
			return null;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 2;
		while (n > 1) {
			if(n%i == 0) {
				list.add(i);
				n /= i;
				i = 2;
			} else i++;
		}
		return list;
	}
}
