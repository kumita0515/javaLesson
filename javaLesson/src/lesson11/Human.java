package lesson11;

/*
 * Humanインターフェース
 * Creatureインターフェースを継承したインターフェース
 * Creatureインターフェースが持つ抽象メソッドを持っている
 */
public interface Human extends Creature {
	void talk();
	void watch();
	void hear();
	//さらに、親インターフェースからrun(）を継承している
}
