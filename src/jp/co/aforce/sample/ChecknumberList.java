package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ChecknumberList {
	public static void main(String[] args) {
		List<String> numberList = new ArrayList<String>();

		int num = 10;

		if (num > 10) {
			numberList.add("large");

		} else {
			numberList.add("small");
		}
		System.out.println(numberList);
		
		
		
		
		
//	③課題
//	問1
/*List<String> numberList2 = new ArrayList<String>();
numberList2.add(1);
numberList2.add(2);
numberList2.add(3);
numberList2.add(4);
numberList2.add(5);*/
	
	}
}
