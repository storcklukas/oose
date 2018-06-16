package aufgabe01;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new DateCommand());
		t1.start();
		Thread t2 = new Thread(new CounterCommand());
		t2.start();
	}

}
