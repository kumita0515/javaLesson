package lesson5;

public class Homework1 {
	public static void main(String[]args) {
		System.out.println("名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		name(name);
	}
	public static void name(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}