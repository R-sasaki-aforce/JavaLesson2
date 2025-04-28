package Collections;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest4 {
	public static void main(String[] args) {
		System.out.println("問2");
		List<String> animalList = new ArrayList<String>();
		animalList.add("犬");
		animalList.add("猫");
		animalList.add("うさぎ");
		animalList.add("へび");

		System.out.println("\n問3");
		String animal = "へび";
	
//		for (String animals : animalList) {
			if (animalList.contains(animal)) {
				System.out.println(animal + "はリストに含まれています");
			} 
				else {
				System.out.println(animal + "はリストに含まれていません");
			}
		

//		}

	}
}
