package jp.co.aforce.sample;
//オーバーロード：同じ名前のメソッドを複数作る
public class Numbers {

	static public int sum(int a, int b) {
		return a + b;
	}

	static public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int n = 1;
		int n2 = 2;
		int n3 = 3;
		System.out.println(sum(n2, n3));
		System.out.println(sum(n, n2, n3));
	}
}
