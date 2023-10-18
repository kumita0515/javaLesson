package Main;
//import文でパッケージ名、クラス名をかく
import logics.Calclogic;

public class Calc {
	//p225
	public static void main(String[]args) {
		int a = 10;
		int b = 2;
		//クラスをimportすると別のパッケージのメソッドをクラス名、メソッド名で呼び出せる。
		int total = Calclogic.tasu(a,b);
		int delta = Calclogic.hiku(a,b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}