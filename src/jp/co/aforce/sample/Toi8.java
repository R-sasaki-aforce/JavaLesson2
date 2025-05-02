package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Toi8 {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
fruits.add("リンゴ");
fruits.add("バナナ");
fruits.add("さくらんぼ");

fruits.remove(1);

fruits.add("オレンジ");
System.out.println(fruits);
	}
}
