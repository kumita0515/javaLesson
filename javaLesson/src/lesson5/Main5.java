package lesson5;
//p198
public class Main5 {
	public static void main(String[]args) {
		//xとyのスコープはmainメソッドの中だけ！他メソッドで使えない
		int x = 100;
		int y = 10;
		add(x , y);
	}
	public static void add(int x , int y) {
		//addメソッドではｘとｙは宣言していないので使えない
		
		int ans = x + y;
		System.out.println(x + "+" + y + "=" +  ans);
	}
}