package jp.co.aforce.sample;
public class Dog extends Animal {
//	
//        // 親クラスのコンストラクタを呼ぶ
////        super(name); 
  

    @Override
    public void makeSound() {
   	 System.out.println("犬の鳴き声はわんわん");
   }
    
//    public void speak() {
//        System.out.println(name + " はワンワン！と吠えます。");
//    }
    
//    public static void main(String[] args) {
//		Animal dog =new Animal("わんわん");
//		dog.makeSound();
//	}
}
