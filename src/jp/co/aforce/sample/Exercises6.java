package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class Exercises6 {
	public static void main(String[] args) {
		
//		これは考え方がまちがえたから
		
		
//		正しいファイルExercises6new  にある
		
		
		//全体の
		int j = 100000;

		Map<String, Integer> tokyo = new HashMap<>();
		tokyo.put("東京-国内", 15 * j);
		tokyo.put("東京-外国", 25 * j);

		Map<String, Integer> osaka = new HashMap<>();
		osaka.put("大阪-国内", 12 * j);
		osaka.put("大阪-外国", 18 * j);

		Map<String, Integer> kyoto = new HashMap<>();
		kyoto.put("京都-国内", 8 * j);
		kyoto.put("京都-外国", 12 * j);

		Map<String, Integer> fukuoka = new HashMap<>();
		fukuoka.put("福岡-国内", 5 * j);
		fukuoka.put("福岡-外国", 8 * j);

		Map<String, Integer> sapporo = new HashMap<>();
		sapporo.put("札幌-国内", 4 * j);
		sapporo.put("札幌-外国", 6 * j);

		Map<String, Map<String, Integer>> date = new HashMap<>();
		date.put("東京", tokyo);
		date.put("大阪", osaka);
		date.put("京都", kyoto);
		date.put("福岡", fukuoka);
		date.put("札幌", sapporo);

		System.out.println(date);

		 date.get("tokyo");
		
		
		int sum=0;
		
		//		全都市の観光客数

//		for (String all : date.keySet()) {
//			System.out.println(date.get(all));
//			for(String all2 :date.get(all) ) {
//				
//			}
//
//		}
//
//		//	東京の合計
//		int sum = 0;
//		for (String all : tokyo.keySet()) {
//			sum += tokyo.get(all);
//		}
//		System.out.println(sum);

		//		全都市の観光客数

		//		int sum = 0;
		//
		//		for (String all : date.keySet()) {
		//			sum += date.get(all);
		//
		//		}
		//		System.out.println(sum);

		//		100万人を超える都市を抽出する機能

	}
}
