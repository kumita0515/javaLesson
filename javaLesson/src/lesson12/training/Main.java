package lesson12.training;

public class Main {
	public static void main(String[]args) {

		A a = new A();
		B b = new B();

		Y[] array = new Y[2];

		array[0] = new A();
		array[1] = new B();

		for(int i = 0; i< array.length; i++) {
			array[i].b();
		}
	}
}