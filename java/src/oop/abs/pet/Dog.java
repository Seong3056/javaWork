package oop.abs.pet;

public class Dog extends Pet {
	
	public Dog(String name, String kind, int age) {
		super(name,kind,age);
	}
	@Override
	public void eat() {
		System.out.println("강아지가 사료를 먹는다.");

	}

	@Override
	public void sleep() {
		System.out.println("강아지가 마당에서 잠을 잔다.");

	}

}
