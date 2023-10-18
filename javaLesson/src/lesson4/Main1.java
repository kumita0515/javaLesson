package lesson4;
//p150
public class Main1 {
	public static void main(String[]args){
		int[] scores;
		scores = new int[5];
		/*int[] scores = new int[5];*/
		//↑一行にまとめることもできる
		int num = scores.length;
		System.out.println("要素の数:" + num);
	}
}