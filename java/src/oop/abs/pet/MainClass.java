package oop.abs.pet;

public class MainClass {

	public static void main(String[] args) {

		Pet dog = new Dog("뽀삐","푸들",3);
		Pet cat = new Cat("야옹","러시안블루",2);
		
		dog.eat();
		dog.sleep();
		System.out.println("---------------------");
		
		cat.eat();
		cat.sleep();
		
	}

}
