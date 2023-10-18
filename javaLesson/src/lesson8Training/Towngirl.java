package lesson8Training;

public class Towngirl {
	String name; 

	//HPの宣言
	int hp; 
	//眠る+HPを100にするメソッド
	public void sleep() {
		this.hp = 50;
		System.out.println(this.name + "は、眠って回復した！");
	}

	//座る+引数の秒数文HPを回復するメソッド
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが、" + sec + "ポイント回復した");
	}

	//滑るメソッド+HPから5を引く
	public void slip() {
		this.hp -= 10;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("10のダメージ！");
	}

	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終ＨＰは" + this.hp + "でした"); 
	}
}