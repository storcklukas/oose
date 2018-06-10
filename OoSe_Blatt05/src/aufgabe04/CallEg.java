package aufgabe04;

public class CallEg {
	public void methodA() throws ArithmeticException {
//		int a = 1/0;
//		methodB();
		try {
			methodB();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}
	public void methodB() throws ArithmeticException {
//		methodC();
		try {
			methodC();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}
	public void methodC() throws ArithmeticException {
//		int a = 1/0;
		try {
			int a = 1/0;
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}
	}
}
