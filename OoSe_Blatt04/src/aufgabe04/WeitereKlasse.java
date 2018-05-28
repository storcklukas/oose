package aufgabe04;

public class WeitereKlasse {
	public static Comparable findMin(Comparable[] x) {
		
		Comparable result = null;
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i].compareTo(x[i+1])<0){
				result = x[i];
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// Testprogramm
		Person[] testarray = {new Person(),new Person(),new Person(),new Person()};
		Person result = (Person)findMin(testarray);
	}
}
