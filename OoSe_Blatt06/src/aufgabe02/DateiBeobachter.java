package aufgabe02;

import java.io.File;

public class DateiBeobachter implements Runnable{
	File file;
	
	DateiBeobachter(String string) {
		file = new File(string);
	}
	
	DateiBeobachter(java.io.File file) {
		this.file = file; 
	}

	@Override
	public void run() {
		int LAUFZEITLÄNGE_DES_PROGRAMMS = 20; // in Sekunden
		
		long startTime = System.nanoTime();
		long actTime = System.nanoTime();
		double difference = (actTime - startTime) / 1e6;
		long last = file.lastModified();
		long lastName = startTime;
		String name = file.getName();
		
		if(!file.exists()) {
			System.out.println("File doesn't exist.");
			return;
		}
		do {
			if ((actTime - lastName)/1e6 > 500) { // alle 0.5 Sekunden
				System.out.println("Filename: " + name);
				lastName = System.nanoTime();
			}
			
			if (last != file.lastModified()) {
				System.out.println("The file " + name + " has been modified.");
				last = file.lastModified();
			}
			
//			System.out.println("startTime: " + startTime + "\nactTime:   " + actTime + "\ndifference: " + difference + "\nname: " + name + "\n last: " + last + "\n");
			
			actTime = System.nanoTime();
			difference = (actTime - startTime) / 1e6;
		} while (difference < LAUFZEITLÄNGE_DES_PROGRAMMS * 1000);
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new DateiBeobachter("D:\\Data\\Programms\\GitHub repositorys\\oose\\OoSe_Blatt06\\src\\aufgabe02\\test.txt"));
		t1.start();
	}

}
