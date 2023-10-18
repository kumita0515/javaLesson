package lesson8Training;

public class GrapeFarmer {
	//名前の宣言
	String name; 

	//HPの宣言
	int hp; 
	//眠る+HPを100にするメソッド
	public void sleep() {
		this.hp = 100;
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
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("５のダメージ！");
	}

	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終ＨＰは" + this.hp + "でした"); 
	}
	
	public GrapeFarmer(String name) {
		this.hp = 100;
		this.name =  name;
	}
	public GrapeFarmer() {
		this("サーヤ");
	}
}