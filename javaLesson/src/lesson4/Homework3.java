package lesson4;

public class Homework3 {
	public static void main(String[]args) {
		System.out.println("数字を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		if (num > 0) {
			System.out.println("正の整数です");
		}else {
			System.out.println("正の数ではありません");
		}
	}
}
