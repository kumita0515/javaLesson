package lesson5;
//p202
public class Main7 {
	public static int add(int x, int y) {
		int ans = x + y;
		//ansを戻り値として呼び出しもとに返す
		return ans;
	}
	public static void main(String[]args) {
		int ans = add(100,10);
		System.out.println("100 + 10 =" + ans);
	}
}