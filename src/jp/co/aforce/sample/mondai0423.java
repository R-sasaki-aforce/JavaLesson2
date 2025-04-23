package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mondai0423 {
	public static void main(String[] args) {
		Map<String, Integer> fruitsMap = new HashMap<>();
		String ringo = "りんご";
		String mikan = "みかん";
		String banana = "バナナ";
		String itigo = "いちご";

		fruitsMap.put(ringo, 100);
		fruitsMap.put(mikan, 80);
		fruitsMap.put(banana, 120);
		fruitsMap.put(itigo, 300);
		System.out.println(fruitsMap);

		Integer value = fruitsMap.get(ringo);
		Integer value1 = fruitsMap.get(mikan);
		Integer value2 = fruitsMap.get(banana);
		Integer value3 = fruitsMap.get(itigo);

		System.out.println(value);

		Scanner fruitScan = new Scanner(System.in);
		System.out.println("ここに入力してください");
		String input = fruitScan.nextLine(); // 入力を取得
		fruitScan.close();
		if (input.equals(ringo)) {
			System.out.println(value);
		} else if (input.equals(mikan)) {
			System.out.println(value1);
		} else if (input.equals(banana)) {
			System.out.println(value2);
		} else if (input.equals(itigo)) {
			System.out.println(value3);
		} else {
			System.out.println("該当の商品はありません");
		}
		System.out.println(input);
		
	}

}