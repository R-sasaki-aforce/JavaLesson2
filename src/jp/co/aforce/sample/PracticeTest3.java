package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {
	public static void main(String[] args) {
		System.out.println("問1");
		String []mono= {"シャープペンシル","ボールペン","リングノート","クリップ","消しゴム"};
		System.out.println("\n問2");
		System.out.println(mono);
		
		System.out.println("\n問3");
		List<String> syain = new ArrayList<String>();
		syain.add("山田太郎");
		syain.add("鈴木花子");
		syain.add("佐藤二郎");
		syain.add("山田太郎");
		syain.add("高橋三郎");
//		System.out.println(syain);
		
		System.out.println("\n問5");
		System.out.println(syain.get(2));
		
		System.out.println("\n問6");
		ArrayList<Integer> list1 = new ArrayList<>();				
		list1.add(10);				
		list1.add(15);				
		list1.add(16);				
		list1.add(19);				
						
		ArrayList<Integer> list2 = new ArrayList<>(list1);				
		list2.add(11);				
		list2.add(12);				
		list2.add(18);				
		list2.add(20);				

//		System.out.println(list2);
		Collections.sort(list2);
		
		for(int lists:list2) {
			System.out.println(lists);
		}
		
		
		System.out.println("\n問7");
		ArrayList<Integer> list3 = new ArrayList<>(list2);				
		list3.add(13);				
		list3.add(14);				
		list3.add(17);				
		list3.add(21);				
		Collections.sort(list3);
		for(int lists2:list3) {
			System.out.println(lists2);
		}
		
		
	}
}
