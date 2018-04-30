import java.util.Scanner;

public class aufgabe2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wie heiﬂen Sie?");
		String input = scanner.nextLine();
		System.out.println("Hallo " + input + "!");
		scanner.close();

	}
		
}
