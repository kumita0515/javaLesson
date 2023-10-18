package lesson8;
//p343
public class Main2 {
	public static void main(String[]args) {

		//剣をインスタンス化
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		//勇者をインスタンス化
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;

		//フィールドのswordにインスタンス化した剣を代入する
		h.sword = s;

		//↓のように県のフィールドの変数を使うことができる
		System.out.println("現在の武器は" + h.sword.name);


		//勇者ミナトを生み出す
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;

		//勇者アサカを生み出す
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;

		//魔法使いがスガワラを生み出す
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;

		//魔法使いのhealメソッドで引数に入れた勇者インスタンスのHPを回復
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}
