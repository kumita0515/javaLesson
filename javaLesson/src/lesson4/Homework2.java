package lesson4;

public class Homework2 {
public static void main(String[]args) {
	System.out.println("年齢を入力してください");
	int old = new java.util.Scanner(System.in).nextInt();
	if (old <= 19) {
		System.out.println("未成年者です");
	}else {
			System.out.println("成人です");
	}
}
}
