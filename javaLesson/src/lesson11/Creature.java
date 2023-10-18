package lesson11;

/*Creatureインターフェース
実装した子クラスに
インターフェースが持っているメソッドを
オーバーライドさせるよう強制させることができる
（Creatureインターフェースを実装した子クラスはすべてrunメソッドを持っていることが保障される）
 */

public interface Creature {


	/*インターフェース内のメソッドは自動的に
	public抽象クラスになる（省略可能）*/

	public abstract void run();
}
