package jp.co.aforce.sample;

import java.util.Scanner;

public class Toi7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("年齢を入力してください：");
		int nenrei = sc.nextInt();

		if (0<=nenrei&&nenrei <= 3) {
System.out.println(nenrei+"歳：無料");
		}else if(4<=nenrei&&nenrei<=12) {
			System.out.println(nenrei+"歳：500円");
		}else if(13<=nenrei&&nenrei<=17) {
			System.out.println(nenrei+"歳：800円");
		}else if(18<=nenrei&&nenrei<=59) {
			System.out.println(nenrei+"歳：1200円");
		}else if(60<=nenrei&&nenrei<130) {
			System.out.println(nenrei+"歳：700円");
		}else {
			System.out.println("正しい年齢を入力してくださいです");
		}
	}
}
