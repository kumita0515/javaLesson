package lesson8;
//p345
public class Wizard {
	String name;
	int hp;

	//引数の勇者インスタンスのhpを１０増やすメソッド
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを１０回復した！");
	}
}
