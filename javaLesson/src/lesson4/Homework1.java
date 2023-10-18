package lesson4;

public class Homework1 {
	public static void main(String[]args) {
		System.out.println("数字を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		boolean flag = false;
		
		if(num % 4 == 0) {
		
		if(num % 100 == 0 && num % 400 != 0) {
			flag = false;
		} else {
			flag = true;
		}
		
		} else {
			flag = false;
		}
		
		if(flag == true) {
		System.out.println("うるう年です。");
		} else {
		System.out.println("うるう年ではありません。");
				}
		}
	}