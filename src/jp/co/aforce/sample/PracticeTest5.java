package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest5 {
	public static void main(String[] args) {
		System.out.println("問1");

		Random r = new Random();
		int fortune = r.nextInt(4) + 0;
		System.out.println(fortune);
		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");

		}

		System.out.println("\n問2");
System.out.println();
		int seven = 0;

		for (int i = 1; i <= 14; i++) {
			seven = (i * 7);

			System.out.print(seven+",");
		}
		
		System.out.println("\n問3");
		int kuku[][] = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int i2 = 0; i2 < 9; i2++) {
				kuku[i][i2] = (i + 1) * (i2 + 1);
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int i2 = 0; i2 < 9; i2++) {
				System.out.printf(kuku[i][i2] + "  ");
			}
			System.out.println();
		}
		System.out.println("\n問4");
		
		
		
		
		
		
		
		System.out.println("\n問5");
		ArrayList<String> employees = new ArrayList<>();
		employees.add("斎藤");
		employees.add("田中");
		employees.add("山田");
		employees.add("鈴木");
		employees.add("高橋");

		

		System.out.println(employees);

		ArrayList<String> submitters = new ArrayList<>();
		submitters.add("斎藤");
		submitters.add("高橋");

		for (String emp : employees) {
			if (!submitters.equals(emp)) {

//				continue;
				System.out.println(emp);
			}
			
//			System.out.println(emp);
		}

		System.out.println("\n問6");

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = i;

			if (!(sum % 2 == 0 && sum % 3 == 0 && sum % 5 == 0 && sum % 7 == 0)) {
				//				System.out.println("素数です："  + sum);
			}
		}

	}
}
