package lesson8;
//p310
public class Hero {
	//名前の宣言
	String name; 

	//HPの宣言
	int hp; 

	//剣の宣言
	Sword sword;

	public Hero() {

	}

	//コンストラクタnewされた直後に自動的に実行される
	public Hero(String name) {
		//HPを１００で初期化
		this.hp = 100;
		this.name = name;
	}
	public Hero(String name, int hp, Sword sword) {
		//別コンストラクタをコンストラクタ内で呼び出す
		this(name);
		this.sword = sword;
	}

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



	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた");
	}
}
