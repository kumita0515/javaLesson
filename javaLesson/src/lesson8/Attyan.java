package lesson8;

public class Attyan extends Hero {
	boolean flying;
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");

		super.attack();
		if(this.flying) {
			super.attack();
		}
	}
}