package HomeWork11;

public class Main {
	public static void main(String[]args) {
		//本クラスをインスタンス化する
		Book b = new Book("桃太郎",100,"ピンク","桃から生まれた桃太郎");

		String returnIsbn = b.getIsbn();
		System.out.println(returnIsbn);
		
		String returnName = b.getName();
		System.out.println(returnName);
		
		int returnPrice = b.getPrice();
		System.out.println(returnPrice);
		

		//コンピューターをインスタンス化する
		Computer c = new Computer("しまじろう",100,"イエロー","虎の子");
	}
}