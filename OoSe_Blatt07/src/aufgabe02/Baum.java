package aufgabe02;

import java.util.LinkedList;

public class Baum {
	TNode wurzel = null;
	
	Baum() {
		createExample();
	}
	
	void createExample() {
		TNode n1 = new TNode(13);
		TNode n2 = new TNode(15, n1, null);
		TNode n3 = new TNode(12, null, n2);
		TNode n4 = new TNode(4);
		TNode n5 = new TNode(3, null, n4);
		TNode n6 = new TNode(7);
		TNode n7 = new TNode(5, n5, n6);
		wurzel = new TNode(10, n7, n3);
	}
	
	void printPreorder() {
		printPreorder(wurzel);
		System.out.println("");
	}	
	void printPreorder(TNode cursor) {
		if (cursor == null) return;
		System.out.print(cursor.getWert() + " ");
		printPreorder(cursor.getLinks());
		printPreorder(cursor.getRechts());
	}
	
	void printPostorder() {
		printPostorder(wurzel);
		System.out.println("");
	}
	void printPostorder(TNode cursor) {
		if (cursor == null) return;
		printPostorder(cursor.getLinks());
		printPostorder(cursor.getRechts());
		System.out.print(cursor.getWert() + " ");
	}
	
	void printInorder() {
		printInorder(wurzel);
		System.out.println("");
	}
	void printInorder(TNode cursor) {
		if (cursor == null) return;
		printInorder(cursor.getLinks());
		System.out.print(cursor.getWert() + " ");
		printInorder(cursor.getRechts());
	}
	
	void printLevelorder() {
		LinkedList<TNode> list = new LinkedList<TNode>();
		list.add(wurzel);
		
		while (!list.isEmpty()) {
			TNode cursor = list.pollLast();
			if (cursor != null) {
				list.addFirst(cursor.getLinks());
				list.addFirst(cursor.getRechts());
				System.out.print(cursor.getWert() + " ");
			}
		}
	}
}
