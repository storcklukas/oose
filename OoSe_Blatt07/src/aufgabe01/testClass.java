package aufgabe01;

public class testClass {

	public static void main(String[] args) {
		DoubleList l = new DoubleList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.insertFirst(4);
		l.insertFirst(5);
		l.remove(2);
		l.remove(0);
		l.remove(2);
		System.out.println(l.get(0));
		System.out.println(l.toString());
	}
}
