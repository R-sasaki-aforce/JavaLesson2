package jp.co.aforce.sample;
public class Animal {
//    protected String name;
//    
//    public Animal(String name) {
//        this.name = name;
//    }

//    public void speak() {
//        System.out.println(name + " は何かをしゃべっています。");
//    }
	
	
    public void makeSound() {
    	 System.out.println("動物の鳴き声");
    }
    public static void main(String[] args) {
		Animal dog=new Dog();
//		Animal cat=new Animal("");
		dog.makeSound();
		
	}
}
