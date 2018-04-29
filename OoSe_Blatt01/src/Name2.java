
public class Name2 {
	public static void main(String[] args) {
		System.out.println("Hallo " + args[0] + "!");
		
		try {
			int a = Integer.valueOf(args[1]);
			int b = Integer.valueOf(args[2]);
			int c = Integer.valueOf(args[3]);
			int d = 0;
			switch (c) {
				case 0: d = a+b;
						break;
				case 1: d = a-b;
						break;
				case 2: d = a*b;
						break;
				case 3: d = a/b;
						break;
				default: System.out.println("Input not {0,1,2,3}.");
						break;
			}
			System.out.println(a + " " + c + " " + b + " " + d);
		} catch(Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}