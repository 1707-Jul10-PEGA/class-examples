package inheritance_overloading;

public class Overloading implements Interface2, Interface1 {

	public static void main(String[] args) {
		test(1);

	}

	public static void test(double i) {
		System.out.println("1");
	}

	@Override
	public void someMethod() {
		// TODO Auto-generated method stub

	}

	// public static void test(long l) {
	// System.out.println("3");
	// }

}
