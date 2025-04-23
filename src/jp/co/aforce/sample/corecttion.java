package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class corecttion {
	public static void main(String[] args) {
		List<String> fruitsList = new ArrayList<String>();
		//リスト.add(インデックス番号, “追加したい要素名”)

		fruitsList.add(0, "apple");
		fruitsList.add(1, "potato");
		fruitsList.add(2, "grape");
		fruitsList.add(3, "peace");
		//　要素の取得取得
		String element1 = fruitsList.get(2);
		System.out.println("2番目の要素" + element1);
		System.out.println(fruitsList);
		//　要素の削除
		fruitsList.remove(3);
		System.out.println(fruitsList);
		fruitsList.remove("potato");
		System.out.println(fruitsList);

	}
}
