package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
	public static void main(String[] args) {
		Map<String, Integer> nameMap = new HashMap<>();
		// 対象のマップ.put(key, value)

		nameMap.put("Bob", 1);
		nameMap.put("Alice", 2);
		nameMap.put("john", 2);
		nameMap.put("Tom", 1);
		System.out.println(nameMap);
		
		 int value = nameMap.get("Alice");
		 System.out.println(value);
		 
//		 int value = nameMpa.get("Tarou");
//		 int value2 = nameMap.get("Tarou");
//		 System.out.println(value2);
		
		 
		 nameMap.remove("Alice");
		 System.out.println(nameMap);
		
	}
}
