package shadowing;

public class Launcher {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.name);
		b.name = "John";
		System.out.println(b.name);
		System.out.println(((A) b).name);
	}
}
