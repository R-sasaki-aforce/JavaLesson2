package jp.co.aforce.sample;

public class Book {
String title;
int price;

public void showInfo(String value) {
	title =value;
}
	public void showInfo(int value) {
	price = value;
}
	public void showInfo() {
		System.out.println("タイトル"+ title+"　価格"+price);
	}
	public static void main(String[] args) {
		Book book1=new Book();
		book1.title="坊ちゃん";
		book1.price=1200;
		
		book1.showInfo();
	}
}
