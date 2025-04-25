package jp.co.aforce.sample;

public class Rectangle {
	int width;
	int hight;

	public Rectangle(int width, int hight) {
		super();
		this.width = width;
		this.hight = hight;
	}

	public Rectangle(int width) {
		super();
		this.width = width;
	}
	static public int kakezan(int width) {
		return width*width;
	}
	static public int kakezan(int width,int hight) {
		return width*hight;
	}

	public static void main(String[] args) {
int n=5;
int n2=4;
System.out.println(kakezan(n));
System.out.println(kakezan(n,n2));
	}

}
