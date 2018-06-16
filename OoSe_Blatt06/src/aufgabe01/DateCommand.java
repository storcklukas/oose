package aufgabe01;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateCommand implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i<10;i++) {
			System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDate.now()));
			int rand = new java.util.Random().nextInt(1000);
			try {
				Thread.sleep(rand);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
