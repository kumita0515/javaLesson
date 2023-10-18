package HomeWork11;

public class Book extends TangibleAsset {
	String isbn;


	public Book(String name,int price,String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}

	//isbnゲッター
	//フィールドのisbnを返す
	public String getIsbn() {return this.isbn;}
}