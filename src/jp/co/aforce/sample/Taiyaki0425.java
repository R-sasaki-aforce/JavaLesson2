package jp.co.aforce.sample;

public class Taiyaki0425 {

	String filling;

	public void setFilling(String value) {
		filling = value;

	}

	public void showFilling() {
		System.out.println("このたい焼きの中身は:" + filling + "です");

	}

	public static void main(String[] args) {
//		インスタンス化
		Taiyaki0425 taiyaki1 = new Taiyaki0425();
		Taiyaki0425 taiyaki2 = new Taiyaki0425();
//		フィールド
		taiyaki1.filling = "クリーム";
		taiyaki2.filling = "あんこ";
//		メソッド呼び出し
		taiyaki1.showFilling();
		taiyaki2.showFilling();
	}

}
