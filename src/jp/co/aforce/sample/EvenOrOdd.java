package jp.co.aforce.sample;

public class EvenOrOdd {
	public static void main(String[] args) {
		//問３変数 num に整数 7 を代入し、その整数が偶数か奇数かを判定するプログラムを作成してください。
		System.out.println("問3");
		int num = 7;
		if (num % 2 == 0) {
			System.out.println(num + "は偶数です");
		} else {
			System.out.println(num + "は奇数です");
		}
		//問4.変数 num に小数 4.5 を代入し、その値を半分にして表示するプログラムを作成してください。
		System.out.println("問4");
		double num4 = 4.5;
		System.out.println(num4 / 2);
		//問5.変数 num に小数 7.8 を代入し、その値を整数部分と小数部分に分けて表示するプログラムを作成してください。
		System.out.println("問5");
		double num5 = 7.8;
		double integerPart = Math.floor(num5);
		double decimalPart = num5 - integerPart;
		System.out.println("整数部分" + (int)integerPart);
		System.out.println("小数部分" + decimalPart);
//問6.変数 num に小数 3.2 を代入し、その値を10倍にして表示するプログラムを作成してください。
		System.out.println("問6");
		double num6 =3.2;
		System.out.println(num6*10);
//問7.変数 num に整数 0 を代入し、その値が0かどうかを判定するプログラムを作成してください。	
		System.out.println("問7");
		int num7 = 0;
        if (num7 == 0) {
        	System.out.println(num7 + "は0です");
        }else {
        	System.out.println(num7 + "は0ではありません");
        }
//問8.変数 num に整数 -5 を代入し、その値が負の数かどうかを判定するプログラムを作成してください。
        System.out.println("問8");
        int num8 =-5;
        if (num8 < 0) {
        	System.out.println(num8+"は負の数です");
        }else {
        	System.out.println(num8+"は正の数です");
        }
//        問9.変数 num に整数 15 を代入し、その値が5の倍数かどうかを判定するプログラムを作成してください。  	
        System.out.println("問9");
	int num9 = 15;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}












