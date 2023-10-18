package lesson4;
//p160
public class Main7 {
public static void main(String[]args) {
	//要素数が１０
	int [] seq = new int[10];
	
	//塩基配列をランダムに生成
	for (int i =0; i < seq.length; i++) {
		//0～3までの乱数
		seq[i] = new java.util.Random().nextInt(4);
	}
	  //生成した塩基配列の記号を表示
	//使わなくても読めるように
	for (int i = 0; i < seq.length; i++) {
		char[] base = {'A','T','G','C'};
		
		System.out.print(base[seq[i]] + "");
		/*
		 switch (seq[i]){
		case 0:
			System.out.println("A");
			break;
		case 1:
		System.out.println("T");
		break;
		case 2:
		System.out.println("G");
		break;
		case 3:
		System.out.println("C");
			break;
			*/
			
		}
		
	}
}