package lesson5;
//p188
public class Main2 {
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[]args) {
		methodA();
	}
}