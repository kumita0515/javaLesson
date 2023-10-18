package lesson5;
//212
public class Main11 {
	//int型配列を受け取り、配列内の要素すべてに１を加えるメソッド
	//仮引数のarrayを変更した場合、実引数に入れた配列も変更される
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[]args) {
		int[] array = {1,2,3};
		//配列はメソッドの引数に入れた場合呼び出し元の配列と
		//メソッドの配列は同じ扱いになってしまう。
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}