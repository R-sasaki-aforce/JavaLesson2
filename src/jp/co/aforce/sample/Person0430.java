package jp.co.aforce.sample;

public class Person0430 {

	private String name;
	protected int age;
	public String address;

//	ゲッター
	public String getNAME() {
		return name;

	}
//セッター
	public void setNAME(String newNAME) {
		name = newNAME;

	}

	public static void main(String[] args) {

		Person0430 p = new Person0430();

		
		p.setNAME("佐々木");
		
		System.out.println(p.getNAME());
		
	}
}
