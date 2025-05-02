package jp.co.aforce.sample;

import java.util.Scanner;

public class Toi9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("商品の単価を入力してください:");
		int tanka = sc.nextInt();
		System.out.println("購入個数を入力してください: ");
		int kosu =sc.nextInt();

		//割引前の合計金額
		double total=tanka*kosu;
		
		double kingakuwari=0;
		int kosuwari=0;
		
		
		
		System.out.println("割引前の合計金額："+((int)total));
//		個数割引
		if(3<=kosu&&kosu<=4) {
			kosuwari=(kosu*50);
		}else if(5<=kosu) {
			kosuwari=(kosu*100);
		}
		
		
//		金額割引
		if(5000<=total&&total<10000) {
			kingakuwari=0.05;
		}else if(10000<=total) {
			kingakuwari=0.1;
		}
		
		
		double goukeiwari=(kingakuwari*total)+kosuwari;
		
		
		System.out.println("割引額:"+goukeiwari);
		
		System.out.println("割引後の価格:"+(int)(total-goukeiwari));
		
		System.out.println("消費税額:"+(int)((total-goukeiwari)*0.1));
		
		System.out.println("税込み価格"+(int)((total-goukeiwari)*1.1));
		
		sc.close();
	}
}
