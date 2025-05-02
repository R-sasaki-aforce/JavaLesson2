package jp.co.aforce.sample;

public class TestSenntaku {
	public static void main(String[] args) {
//		System.out.println("Hello\tWorld\nJava");
		
		
//        try {					
//            int result = 10 / 0;					
//            System.out.println("計算結果: " + result);					
//        } catch (ArithmeticException e) {					
//            System.out.println("例外が発生しました: " + e.getMessage());					
//        }					
//        System.out.println("プログラム終了");					
        try {							
            String str = null;							
            System.out.println(str.length());							
        } catch (ArithmeticException e) {							
            System.out.println("ArithmeticException が発生しました");							
        } catch (NullPointerException e) {							
            System.out.println("NullPointerException が発生しました");							
        } catch (Exception e) {							
            System.out.println("Exception が発生しました");							
        }							

	}
}
