package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryCapital {
	public static void main(String[] args) {

		Map<String, String> worldMap = new HashMap<>();
		worldMap.put("日本", "東京");
		worldMap.put("アメリカ合衆国", "ワシントンDC");
		worldMap.put("フランス", "パリ");
		worldMap.put("中国", "北京");
		System.out.println("すべての国名と首都");
		Set<String> worldset = worldMap.keySet();
		for (String worldkey : worldset) {
			System.out.println("国名 " + worldkey + "　首都名 " + worldMap.get(worldkey));

		}
		System.out.println("\n「日」を含む国とその首都");
		for (String worldkey : worldset) {
			if (worldkey.contains("日")) {
				System.out.println("国名 " + worldkey + "　首都名 " + worldMap.get(worldkey));
			}

		}
	}

}
