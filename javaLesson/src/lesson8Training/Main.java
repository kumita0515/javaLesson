package lesson8Training;

public class Main {
	public static void main(String[]args) {
		//葡萄農家よ、この仮想世界に生まれよ！
		//1.葡萄農家を生成
		GrapeFarmer g = new GrapeFarmer();

		//2.フィールドに初期値をセット
		g.name = "ヒメコ";
		g.hp = 100;
		System.out.println("葡萄農家" + g.name + "を生み出しました！");

		//3.葡萄農家のメソッドを呼び出してゆく
		g.sit(5);
		g.slip();
		g.sit(25);
		g.run();

		// 町娘よ、この仮想世界に生まれよ！
		Towngirl t= new Towngirl();
		
		t.name = "サーヤ";
		t.hp = 50;

		//冒険の始まり
		t.slip();
		t.run();
		t.run();
	}
}