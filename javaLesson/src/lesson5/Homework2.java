package lesson5;

public class Homework2 {
	public static void main(String[]args) {
		int bottom = 10;
		int high = 5;
		num(bottom, high);
	}
	public static void num(int bottom, int high) {
		int ans = bottom * high / 2;
		System.out.println("底辺" + bottom + "高さ" + high 
				+ "の三角形の面積は" + ans + "です");
		int volume = 2;
		Volume(ans, volume);
	}
	public static void Volume(int area, int volume) {
		int ans = area * volume;
		System.out.println("三角柱の体積は" + ans + "です");
	}
}