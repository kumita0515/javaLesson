package lesson3;

public class Main8 {
	public static void main(String[]args) {
		for (int i = 9;i > 0; i--) {
			//○×○の前
			for (int j =9;j > 0; j--) {
				//○×○の後
				System.out.print(i*j);;//掛け算の結果を出力
				System.out.print(" ");//空白を出力
			}
			System.out.println("");//改行を出力
		}
	}

}