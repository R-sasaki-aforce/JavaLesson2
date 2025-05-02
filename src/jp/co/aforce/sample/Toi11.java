package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Toi11 {
	public static void main(String[] args) {

		//		System.out.println((double)1500/(double)2500);

		Bookinfo book1 = new Bookinfo("「Python入門」", "山田太郎", 1500, 2500);
		Bookinfo book2 = new Bookinfo("「データ分析の基礎」", "鈴木花子", 1200, 3000);
		Bookinfo book3 = new Bookinfo("「AI技術最前線」", "佐藤一郎", 800, 4000);
		Bookinfo book4 = new Bookinfo("「Webデザイン講座」", "田中美咲", 2000, 2000);
		Bookinfo book5 = new Bookinfo("「はじめての機械学習」", "中村健一", 900, 3500);

		List<Bookinfo> bookdate = new ArrayList<Bookinfo>();
		bookdate.add(book1);
		bookdate.add(book2);
		bookdate.add(book3);
		bookdate.add(book4);
		bookdate.add(book5);

		int sum = 0;

		for (Bookinfo bookdates : bookdate) {
			sum += (bookdates.uretakazu * bookdates.price);
		}
		System.out.println("全書籍の総売り上げ：" + sum + "円");

		System.out.println("\n販売数が1000冊を越える書籍");
		for (Bookinfo bookdates : bookdate) {
			if (bookdates.uretakazu > 1000) {
				System.out.println(bookdates.title);
			}
		}

		double maxraito = 0.0;
		String maxbook = null;

		System.out.println("\n販売効率が最も良い物");
		for (Bookinfo bookdates : bookdate) {
			double raito = ((double) bookdates.uretakazu / (double) bookdates.price);

//						System.out.println(raito);
			//System.out.println(bookdates.title);
			
			
			if (raito > maxraito) {
				maxraito = (double)raito;
				//System.out.println(bookdates.title);
//				System.out.println(maxraito);
//				System.out.println(bookdates.title);
				maxbook=bookdates.title;
			}
			
		}
//		System.out.println(maxraito);
System.out.println(maxbook);
	}
}
