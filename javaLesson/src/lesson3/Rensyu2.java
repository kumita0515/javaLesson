package lesson3;

import java.util.Scanner;

public class Rensyu2 {
	public static void main(String[]args) {

		//Scannerの準備
		Scanner scanner = new Scanner(System.in);

		//メッセージの表示
		System.out.println("今日の天気を入力してください");

		//天気を入力させる
		String tenki = new java.util.Scanner(System.in).nextLine();
		if(tenki.equals("晴れ")){
			System.out.println("散歩に行く");
		}else {
			System.out.println("ゲームをする");
		}
		System.out.println("気温を入力してください");
		int kion = scanner.nextInt();
		if(kion>= 20 && kion<= 26) {
			System.out.println("過ごしやすい気温ですね");
		}else {
			System.out.println("体調に気を付けてくださいね");
		}
		scanner.close();
	}
}
