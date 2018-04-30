import java.util.Scanner;

public class aufgabe2_2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben sie bitte a b für a + b an");
		try{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a + b;
			System.out.println(a + " + " + b + " = " + c );
		}catch( Exception e ){
			System.out.println("Deine Eingabe hatte nicht das richtige Format");
		}
		scanner.close();

	}
		
}
