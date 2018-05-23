package aufgabe03;

public class Student {
	public void eat(Food food) {
		System.out.println("I like " + food.getMeal());
	}

	public void eat(Cauliflower Cauliflower) {
		System.out.println("I don't like " + Cauliflower.getMeal());
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		Cauliflower essen1 = new Cauliflower();
		student.eat(essen1);
		
		Spaghetti essen2 = new Spaghetti();
		student.eat(essen2);
		
		Food essen = new Cauliflower();
		student.eat(essen);
	}
}
