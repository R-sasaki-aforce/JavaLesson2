package jp.co.aforce.sample;

public class Animal0428 {
	void speak() {
		System.out.println("Some sound");
	}

	class Dog2 extends Animal0428 {
		void speak() {
			System.out.println("Woof!");
		}
	}

	//public class Main2 {					
//	public static void main(String[] args) {
//		Animal0428 a = new Dog2();
//		a.speak();
//		//    }					
//
//	}
}