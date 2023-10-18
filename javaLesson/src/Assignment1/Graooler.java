package Assignment1;

public class Grappler extends Character {

	//引数のキャラクタークラスに攻撃してHPを減らすメソッド
	public void attack(Character character) {

	}
	//減らす値は攻撃力から引数の防御力を減らした値
	int attack = this.getAp() - character.getDp();

	//０未満は０
	if(attack < 0) {
		attack = 0;
	}

	//減らしたあとのHPを計算する
	int afterHp = character.getHp() - attack;

	//０未満は０
	if(afterHp < 0) {
		afterHp = 0;

	}
	//減らしたあとのHPを引数のキャラクター変数にセットする
	character.setHp(afterHp);

	System.out.println(this.getName() + "の攻撃！");
	System.out.println(character.getName() + "に" + attack + "のダメージ！");
	System.out.println(character.getName() + "のHP、残り" + character.getHp() + "。");
}