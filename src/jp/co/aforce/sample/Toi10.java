package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class Toi10 {
String task;
String syori;

	
	
	
	public Toi10(String task, String syori) {
	super();
	this.task = task;
	this.syori = syori;
}

public String contains() {
	
	
	
	
	
	return syori;
	
}


	public static void main(String[] args) {
		Toi10 task1 =new Toi10("TASK001", "処理済み");
		Toi10 task2 =new Toi10("TASK002", "処理済み");
		Toi10 task3 =new Toi10("TASK003", "処理済み");
		Toi10 task4 =new Toi10("TASK001", "処理済み");
		Toi10 task5 =new Toi10("TASK004", "処理済み");
		Toi10 task6 =new Toi10("TASK002", "処理済み");
		
		
		
		List<Toi10> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		tasks.add(task5);
		tasks.add(task6);
		
		
				
		System.out.println("処理済みのタスクID");
		for(Toi10 tasks2:tasks) {
			System.out.println("-"+tasks2.task);
		}
		
		//		問3
		System.out.println("\nタスクの処理状況");
		Toi10 task7 =new Toi10("TASK003", "処理済み");
		Toi10 task8 =new Toi10("TASK005", "未処理");
		
		tasks.add(task7);
		tasks.add(task8);
		
		for(Toi10 tasks2:tasks) {
			if(tasks2.syori.equals("処理済み")) {
				System.out.println("タスクID"+tasks2.task+"は既に処理済みです");
			}else if(tasks2.syori.equals("未処理")) {
				System.out.println("タスクID"+tasks2.task+"は未処理です");
			}
		}
		
		int total=0;
		
		for(Toi10 tasks2:tasks) {
			if(tasks2.syori.equals("処理済み")) {
				total++;
			}
		}
		
		System.out.println("\n処理済みのタスクの総数"+total);
	}

}
