package Assignment1;


public class Main {

public static void main(String[] args) {
	//Warriorクラスをインスタンス化して初期値をセット
	Warrior war = new Warrior();
	war.setAp(100);
	war.setDp(10);
	war.setHp(1000);
	war.setMp(20);
	war.setName("戦士");
	war.setLuck(50);

	//Grapplerクラスをインスタンス化して初期値をセット
	Grappler gra = new Grappler();
	gra.setAp(150);
	gra.setDp(20);
	gra.setHp(2000);
	gra.setMp(100);
	gra.setName("格闘家");
}