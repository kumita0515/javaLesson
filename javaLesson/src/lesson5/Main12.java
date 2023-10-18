package lesson5;
//213
public class Main12 {
	//引数に入れた大きさの配列を返すメソッド
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		//arrayの中身をすべて表示
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	public static void main(String[]args) {
		//makeArrayメソッドを引数３で呼び出し
		int[] array = makeArray(3);
		for (int i :array) {
			System.out.println(i);
		}
	}
}