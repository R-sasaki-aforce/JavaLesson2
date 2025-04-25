package jp.co.aforce.sample;

public class Person {
//	変数の定義
	String name;
	int age;

	
//コンストラクターの定義
	
	public  Person(String name, int age) {
//		「変数の定義」で定義したnameとageフィールドを初期化
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("名前は:" + name + "　年齢は：" + age+"です");
	}
	
//	メソッド
	public static void main(String[] args) {
		System.out.println();
//		Person person=new Person("Alice",30);
//		person.displayInfo();
			}
	/*public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "佐々木";
		person1.age = 22;
	
		person1.setProfil();
	}*/
}
