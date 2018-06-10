package aufgabe03;

import java.util.ArrayList;

public class Main {
	public static ArrayList<Double> populate(ArrayList<Double> list) {
		for(int i = 0; i < 20; i++) {
			list.add(Math.exp(i) % 100);
		}
		return list;
	}
	
	public static void printArray(ArrayList<Double> list) {
		System.out.println(list);
	}
	
	public static ArrayList<Double> sortArray(ArrayList<Double> list) {
		ArrayList<Double> newList = new ArrayList<Double>();
		int länge = list.size();
		for(int i = 0; i < länge; i++) {
			double min = list.get(0);
			for(int j = 1; j < list.size(); j++) {
				if (list.get(j) < min) min = list.get(j); 
			}
			newList.add(min);
			list.remove(list.indexOf(min));
		}
		
		return newList;
	}
	
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		list = populate(list);
		printArray(list);
		list = sortArray(list);
		printArray(list);
	}

}
