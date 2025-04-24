package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Scanner;

public class matomemonndai0424 {
	public static void main(String[] args) {
		ArrayList<Integer> testscore = new ArrayList<>();
		testscore.add(85);
		testscore.add(92);
		testscore.add(78);
		testscore.add(65);
		testscore.add(98);
		testscore.add(70);
		System.out.println(testscore);

		int kosu = 0;
		for (int result : testscore) {
			if (result >= 70) {
				kosu++;
			}
		}
		System.out.println("70点以上の得点は"+kosu+"個です");

		//		int element1 =testscore.get(0);
		//		int element2 =testscore.get(1);
		//		int element3 =testscore.get(2);
		//		int element4 =testscore.get(3);
		//		int element5 =testscore.get(4);
		//		int element6 =testscore.get(5);

		
		
//		-----------------④課題-----------------------------------
		
		System.out.println("\n\n"+"④課題");
		System.out.println("\n\n"+"問1");
		int i=0;
		while(i<10) {
			i++;
			System.out.println(i);
		}
		
		System.out.println("\n\n"+"問2");
		/*int goukei=0;*/
		int goukei=0;
		int i2=0;
		while(i2<100) {
			i2++;
			goukei+=i2;
			
//			System.out.println(i2);
		}
		System.out.println(goukei);
		
		System.out.println("\n\n"+"問3");
		
		Scanner kazuScan = new Scanner(System.in);
		System.out.println("ここに入力してください");
		/*Integer input = kazuScan.nextLine(); // 入力を取得
		*/		kazuScan.close();
		
//		while(input != 0) {
//		
//		}
//		
		
		
		
		
		
	}
}
