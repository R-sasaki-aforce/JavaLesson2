package jp.co.aforce.sample;

public class Person2 {
	String name;
	int age;

	//ここはクラス名
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("名前は " + name + "　年齢は " + age);
	}
	public static void main(String[] args) {
		System.out.println();
	}
}
