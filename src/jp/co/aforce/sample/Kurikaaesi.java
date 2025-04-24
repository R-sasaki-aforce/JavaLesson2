package jp.co.aforce.sample;

import java.util.ArrayList;

public class Kurikaaesi {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		System.out.println("while文");

		while (i < 5) {
			System.out.println("iの値" + i);
			i++;
			//一度は実行されて　そのあとに条件が当てはまれば実行される
		}
		System.out.println("\ndo文");
		do {
			System.out.println("jの値" + j);
			j++;
		} while (j < 5);

		System.out.println("\nwhileとdoの比較");
		int i2 = 5;
		int j2 = 5;

		while (i2 < 5) {
			System.out.println("i2の値" + i2);
			i2++;
		}
		do {
			System.out.println("jの値" + j2);
			j2++;
		} while (j2 < 5);

		System.out.println("\nfor文二重ループ");
		for (int i3 = 1; i3 <= 5; i3++) {
			//			System.out.println(i3);
			for (int i4 = 1; i4 <= 3; i4++) {
				System.out.println(i4);
			}
		}

		System.out.println("\n拡張for文");
		ArrayList<String> employees = new ArrayList<>();
		employees.add("田中太郎");
		employees.add("山田花子");
		employees.add("佐藤次郎");

//	for( 要素の型名 変数名 : コレクションの変数名) {
		for(String employee :employees){
		System.out.println(employee);
		
		}
		System.out.println("\n"+"break");
		for (int i5 = 1; i5 <= 5; i5++) {
			//			System.out.println(i3);
			for (int i6 = 1; i6 <= 3; i6++) {
				System.out.println(i6);
			}
		}
		
		
		
		
	}

}
