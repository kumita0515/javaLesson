package lesson10;
//p375
public class Main {
	public static void main(String[]args) {
		
		//ヒーロークラスをインスタンス化
		Hero h = new Hero();
		//ヒーロークラスのrun()を呼び出す
		h.run();
		
		//スーパーヒーロークラスをインスタンス化
		SuperHero sh = new SuperHero();
		
		//スーパーヒーロークラスはヒーロークラスを継承したいるのでヒーロークラスのメソッドrun()を呼び出せる
		sh.run();
		
		public static void main2(String[]args) {
			Weapon W = new Weapon();
	}
}