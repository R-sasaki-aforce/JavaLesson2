package jp.co.aforce.sample;

import org.apache.commons.lang3.StringUtils;

public class ExceptionPractice {
	public static void main(String[] args) {
		
		String rev=StringUtils.reverse("サンプル");
		System.out.println(rev);
		
		
		String tri =StringUtils.trim("    空白    ");
		System.out.println(tri);
		
		boolean con=StringUtils.contains(rev,"ルプンサ");
		System.out.println(con);
		
		

		
		
		
		
		
		//		String str = null;//Stringにnullを入れることはできる
		//		try {
		//			System.out.println(str.length());/*ここでNullPointerExceptionが発生*/
		//			
		////			int [] nums= {1,2,3};
		////			System.out.println(nums[5]);
		//		} catch (NullPointerException e) {
		//			System.out.println("ヌルポが発生しました"+e.getMessage());
		//
		//		}
		//		System.out.println("プログラムは継続します");/*これは表示されない*/

		//		try {
		//			int [] nums= {1,2,3};
		//			System.out.println(nums[5]);
		//		}catch (NullPointerException e){
		//			System.out.println("ヌルポが発生しました"+e.getMessage());
		//		}catch(ArrayIndexOutofBoundsException e){
		//			System.out.println("ヌルポが発生しました"+e.getMessage());
		//		}

		//		try {
		//			int age=15;
		//			if(age<18) {
		//				throw new IllegalArgumentException("18歳未満は登録できません");
		//				
		//			}
		//			System.out.println("登録が完了しました");
		//		}catch(IllegalArgumentException e) {
		//			System.out.println("例外が発生しました："+e.getMessage());
		//		}

		//-------------------演習問題③--------------------------

		//		Scanner sc = new Scanner(System.in);
		//		int number=sc.nextInt();
		//		sc.close();
		//		System.out.println((double)number/2);

//		try {
//			Scanner sc = new Scanner(System.in);
//			String number = sc.nextLine();
//
//			int number2=Integer.parseInt(number);
//			System.out.println( number2 / 2);
//			sc.close();
//		} catch (NumberFormatException e) {
//			System.out.println("数のフォーマットに例外が発生しました" + e.getMessage());
//		}
		
		
//		問５
//try {
//	int number=10;
//	System.out.println(number/0);
//}catch(ArithmeticException e) {
//	System.out.println("0で割ることはできません");
//}
	}
}
