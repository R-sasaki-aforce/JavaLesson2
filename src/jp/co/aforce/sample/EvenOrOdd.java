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
		System.out.println("整数部分" + (int) integerPart);
		System.out.println("小数部分" + decimalPart);
		//問6.変数 num に小数 3.2 を代入し、その値を10倍にして表示するプログラムを作成してください。
		System.out.println("問6");
		double num6 = 3.2;
		System.out.println(num6 * 10);
		//問7.変数 num に整数 0 を代入し、その値が0かどうかを判定するプログラムを作成してください。	
		System.out.println("問7");
		int num7 = 0;
		if (num7 == 0) {
			System.out.println(num7 + "は0です");
		} else {
			System.out.println(num7 + "は0ではありません");
		}
		//問8.変数 num に整数 -5 を代入し、その値が負の数かどうかを判定するプログラムを作成してください。
		System.out.println("問8");
		int num8 = -5;
		if (num8 < 0) {
			System.out.println(num8 + "は負の数です");
		} else {
			System.out.println(num8 + "は正の数です");
		}
		//問9.変数 num に整数 15 を代入し、その値が5の倍数かどうかを判定するプログラムを作成してください。  	
		System.out.println("問9");
		int num9 = 15;
		if (num9 % 5 == 0) {
			System.out.println(num9 + "は5の倍数です");
		} else {
			System.out.println(num9 + "は5の倍数ではない");
		}
		//	問10.変数 num1 に整数 8 を、num2 に整数 3 を代入し、それらの和を計算して表示するプログラムを作成してください。
		System.out.println("問10");
		int num10 = 8;
		int num101 = 3;
		System.out.println(num10 + num101);
		//問11.変数 num1 に整数 10 を、num2 に整数 4 を代入し、それらの差を計算して表示するプログラムを作成してください。
		System.out.println("問11");
		int num11 = 10;
		int num111 = 4;
		System.out.println(num11 - num111);
		System.out.println(num111 - num11);
		//問12.変数 num1 に整数 6 を、num2 に整数 7 を代入し、それらの積を計算して表示するプログラムを作成してください。
		System.out.println("問12");
		int num12 = 6;
		int num121 = 7;
		System.out.println(num12 * num121);
		//問13.次の変数を宣言し、適切な値を代入します:
		System.out.println("問13");
		String name = "佐々木玲音";
		int age = 22;
		int age2 = age + 1;
		System.out.println(name + "は次の誕生日で" + age2 + "歳です");
		//問14.四則演算
		System.out.println("問14");
		int num14 = 8;
		int num141 = 3;
		System.out.println(num14 + num141);
		System.out.println(num14 - num141);
		System.out.println(num14 * num141);
		System.out.println(num14 / num141);
		System.out.println(num14 % num141);
		//問15.平均値の計算	
		System.out.println("問15");
		int test1 = 75;
		int test2 = 88;
		int test3 = 92;

		int test123 = test1 + test2 + test3;
		System.out.println((int) test123 / 3);
		//問16.12,000円の30%引きを計算するプログラムを書いてください。	
		System.out.println("問16");
		int num16 = 12000;
		double num161 = num16 * (0.7);
		double num162 = Math.floor(num161);

		System.out.println((int) num162 + "円");
//問17.次のコードの出力は？
		System.out.println("問17");
		boolean aa = true;
		boolean bb = false;
		boolean cc = (aa && bb) || (!aa && !bb);
		System.out.println(cc);
//問18.次のコードの出力は？
		System.out.println("問18");
		boolean x = true;
		boolean y = false;
		boolean z = x || y && !x;
		System.out.println(z);
//問19.次のコードの出力は？
		System.out.println("問19");
		boolean p = false;
		boolean q = true;
		boolean r = !(p || q) && (p && !q);
		System.out.println(r);
//問20.次のJavaコードを見て、画面に表示される結果を答えなさい。
		System.out.println("問20");
		int age1 = 20;
        boolean hasStudentID = false;

        if ((age1 < 25 && hasStudentID) || age1 == 20) {
            System.out.println("割引対象です");
        } else {
            System.out.println("通常料金です");
        }

	
	
	}
}
