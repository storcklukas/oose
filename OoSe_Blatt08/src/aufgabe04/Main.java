package aufgabe04;

public class Main {
	public static void main(String[] args) {
//		int a = 2, b = 100000;
		int a = 1000000000, b = 1000000010;
		
		long startTime1 = System.nanoTime();
		Primfaktorzerlegung p = new Primfaktorzerlegung();
		p.zerhackeAlleZahlen(a, b);
		long endTime1 = System.nanoTime();
		
		long startTime2 = System.nanoTime();
		Thread t1 = new Thread(new PrimThread(a, b));
		Thread t2 = new Thread(new PrimThread(a + 1, b));
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime2 = System.nanoTime();
		
		System.out.println("Zeit 1: " + (endTime1 - startTime1) / 1e9);
		System.out.println("Zeit 2: " + (endTime2 - startTime2) / 1e9);
	}
}