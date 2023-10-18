package lesson4;

public class Main2 {
	public static void main(String[]args) {
		
		//配列の宣言
		int[] scores;
		
		//要素の代入
		scores = new int [5];
		
		//配列の2番目の要素に30を代入する
		scores[1] = 30;
		System.out.println(scores[1]);
		
		//省略方法
		int[] scores2 = {20, 30, 40, 50, 80};
		
		System.out.println(scores2.length);
		
		
		//配列の要素数はあとから変えられない
		
	}
}
