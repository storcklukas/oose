package aufgabe01;

public class DoubleList {
	DoubleNode head = null;

	void add(double d) {
		if (head == null) {
			head = new DoubleNode(d);
			return;
		}

		DoubleNode tmp = head;
		while (tmp.getNachfolger() != null) {
			tmp = tmp.getNachfolger();
		}
		tmp.setNachfolger(new DoubleNode(d));
	}

	void insertFirst(double d) {
		DoubleNode tmp = new DoubleNode(d);
		tmp.setNachfolger(head);
		head = tmp;
	}

	double get(int i) {
		if (i < 0) {
			System.out.println("i ist zu klein und ich habe keine Lust von hinten anzufangen zu zählen");
			return 0;
		}

		DoubleNode tmp = head;
		for (int j = 0; j < i; j++) {
			if (tmp == null) {
				System.out.println("i ist zu groß gewählt");
				return 0;
			}
			tmp = tmp.getNachfolger();
		}
		if (tmp == null) {
			System.out.println("i ist zu groß gewählt");
			return 0;
		}
		return tmp.getWert();
	}

	public String toString() {
		String str = "DoubleList: ";
		DoubleNode tmp = head;
		while (tmp != null) {
			str += tmp.getWert() + "; ";
			tmp = tmp.getNachfolger();
		}

		return str;
	}

	void remove(int i) {
		if (i < 0) {
			System.out.println("i ist zu klein und ich habe keine Lust von hinten anzufangen zu zählen");
			return;
		}

		if (i == 0) {
			if (head == null) {
				System.out.println("i ist zu groß gewählt");
				return;
			}
			head = head.getNachfolger();
			return;
		}

		DoubleNode last = head;
		if (head == null) {
			System.out.println("i ist zu groß gewählt");
			return;
		}
		DoubleNode cursor = head.getNachfolger();

		for (int j = 1; j < i; j++) {
			if (cursor == null) {
				System.out.println("i ist zu groß gewählt");
				return;
			}
			last = cursor;
			cursor = cursor.getNachfolger();
		}

		if (cursor == null) {
			System.out.println("i ist zu groß gewählt");
			return;
		}

		last.setNachfolger(cursor.getNachfolger());
	}
}
