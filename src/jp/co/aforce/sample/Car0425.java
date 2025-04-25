package jp.co.aforce.sample;

public class Car0425 {
	String maker;
	int year;

	public Car0425() {
this.maker="デリカミニ";
this.year=1905;
	}

	public Car0425(String maker, int year) {
		this.maker = maker;
		this.year = year;

	}
	public void display() {
		System.out.println("メーカーは "+maker+"です"+"メーカーは"+year+"です");
	}
	public static void main(String[] args) {
		System.out.println();
	}
	
}
