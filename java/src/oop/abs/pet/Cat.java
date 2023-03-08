package oop.abs.pet;

public class Cat extends Pet {

	public Cat(String name, String kind, int age) {
		super(name,kind,age);
	}
	public void eat() {
		System.out.println("고양이가 생선을 먹는다.");

	}

	public void sleep() {
		System.out.println("고양이가 캣타워에서 잔다");

	}

}
