package jp.co.aforce.sample;

public class Bookinfo {
	String title;
	String author;
	int uretakazu;
	int price;

	
	
	/**
	 * 
	 * @param title 書籍名
	 * @param author 著者
	 * @param uretakazu 販売数
	 * @param price 価格
	 */
	public Bookinfo(String title, String author, int uretakazu, int price) {
		super();
		this.title = title;
		this.author = author;
		this.uretakazu = uretakazu;
		this.price = price;
	}

}
