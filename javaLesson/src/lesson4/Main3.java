package lesson4;

public class Main3 {
	public static void main(String[]args) {
		int[] scores = {20,30,40,50,80};
		int sum = scores[1] + scores[2]
				+ scores[3] + scores[4] + scores[5];//本来は０～４
		int avg = sum / scores.length;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);
		
		
		/*↓これが出たら配列の存在しない要素番号を使用しようとしている
		 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		at lesson4.Main3.main(Main3.java:7)*/

	}
}
