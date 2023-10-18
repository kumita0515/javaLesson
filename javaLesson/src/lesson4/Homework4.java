package lesson4;

public class Homework4 {
	public static void main(String[]args) {
		int fortune = new java.util.Random().nextInt(101);
		System.out.println(fortune);
		if (fortune >= 90){
			System.out.println("優秀");
		}else if (fortune >= 80 && fortune < 90) {
			System.out.println("良い");
		}else if (fortune >= 70 && fortune < 80) {
			System.out.println("ふつう");
		}else if (fortune >= 60 && fortune < 70) {
			System.out.println("可");
		}else if (fortune < 60) {
			System.out.println("不可");
		}
	}
}