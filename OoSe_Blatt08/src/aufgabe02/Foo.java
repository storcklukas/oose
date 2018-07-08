package aufgabe02;

public class Foo {
	public static <T> T bar(T x, T y) {
		return x;
	}
	
	public static void main(String[] args) {
		Object o;
		R r = new R();
		E e = new E();
		B b = new B();
		G g = new G();
		U u = new U();
		R[] x;
		E[] y;
		
		r = bar(r, b);
		r = bar(b, r);
		r = bar(e, g);
		r = bar(b, g);
		e = bar(r, b);
		u = bar(u, r);
		o = bar(e, u);
		b = bar(e, g);
		x = bar(new E[2], new B[4]);
		y = bar(new E[4], new B[11]);
		o = bar(new G[8], new U[5]);
	}
}
