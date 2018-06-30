package aufgabe03;

public class NumberTooBigException extends RuntimeException {
	NumberTooBigException() {
		super("Zahl zu groﬂ!");
	}
}
