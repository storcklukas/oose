package aufgabe03;

public class Hauptprogramm {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Apfel");
		System.out.println(stack.toString());
		stack.push("Orange");
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.push("Erdbeere");
		System.out.println(stack.toString());
		stack.push("Kiwi");
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
	}

}
