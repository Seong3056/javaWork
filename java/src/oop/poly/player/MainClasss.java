package oop.poly.player;

public class MainClasss {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사");
		Mage m1 = new Mage("법사");
		Hunter h1 = new Hunter("냥꾼");
		Warrior w2 = new Warrior("전사2");
		w1.characterInfo();
		m1.characterInfo();
		w1.rush(w2);
		w1.rush(m1);
		w1.rush(h1);
		

	}

}
