package Assignment1;

public class Warrior extends Character {


	//Int 型luck
	private int luck;

	//attack(オーバーライド)
	public void attack(Character character) {

		//攻撃力−引数のキャラクター型変数の防御力の値を計算する。(0未満は0とする)
		//引数のキャラクター型変数のHPから計算した値を減らす。
		//減らした結果0よりも少ない場合は引数のキャラクター型変数のHPに0を代入する。
		int attack = this.getAp() - character.getDp();

		if(attack < 0) {
			attack = 0;
		}

		int afterHp = character.getHp() - attack;

		if(afterHp < 0) {
			afterHp = 0;
		}
		//減らしたあとのHPを引数のキャラクター変数にセットする
		character.setHp(afterHp);

		//「（名前）の攻撃！」
		System.out.println(this.getName() + "の攻撃！");

		//「（引数のキャラクター型変数の名前）に（計算した値）のダメージ！」
		System.out.println(character.getName() + "に" + attack + "のダメージ！");

		//「（引数のキャラクター型変数の名前）のHP、残り（引数のキャラクター型変数のHP）。」
		System.out.println(character.getName() + "のHP、残り" + character.getHp() + "。");


	}
	//竜巻斬り
	//引数のキャラクターからHPを減らす

	public void tatsumakiSlash(Character character) {
		System.out.println(this.getName() + "の竜巻斬り！");

		//減らすHPの計算をする
		int attack =(int)(this.getAp() * 1.5);
		attack -= character.getDp();
		if(attack < 0) {
			attack = 0;
		}

		//乱数の生成
		int ranNum = random.nextInt(100) + 1;

		//乱数よりもluckが大きければさらに1.5倍
		if(this.luck > ranNum) {
			attack = (int)(attack * 1.5);
			System.out.println("クリティカルHit!");
		}

		//減らしたあとのHP計算
		int afterHp = character.getHp() - attack;
		if(afterHp < 0) {
			afterHp = 0;
		}

		//減らしたあとのHPを引数のHPにセットする
		character.setHp(afterHp);

		System.out.println(character.getName() + "に" + attack + "のダメージ！");
		System.out.println(character.getName() + "のHP、残り" + character.getHp() + "。");
	}
	/**
	 * @return luck
	 */
	public int getLuck() {
		return luck;
	}
	/**
	 * @param luck セットする luck
	 */
	public void setLuck(int luck) {
		this.luck = luck;
	}