package lesson10;
//p374
public class SuperHero  extends Hero{

	//Heroクラスを継承しているので書いてないけどname.hpを持っている
	boolean flying;

	//Heroクラスを継承したいるので書いてないけどrun()とattack()メソッドを持っている
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	//オーバーライド（再定義）同じ名前、引数のメソッドを再定義する
	@Override
	public void run() {
		System.out.println(this.name + "は撤退した");

		//slip()はHeroクラスでfinalがついているのでオーバーライドできない
		//public void slip(){
	}
}