package oop.this_super;

public class MainClass {

	public static void main(String[] args) {

		Player p1 = new Player();
		p1.name = "전사1";
//		System.out.println("p1: "+p1);
		p1.characterInfo();
		
		System.out.println("--------------");
		
		Player p2 = new Player("전사2");
//		System.out.println("p2: "+p2);
		p2.characterInfo();
		
		System.out.println("--------------");
		
		Player p3 = new Player("전사3",200);
		p3.characterInfo();

		System.out.println("--------------");
		
		p3.attack(p2);
		p1.attack(p2);
		p2.attack(p2);
		
		System.out.println("--------------");
		
		Warrior w1 = new Warrior("전사a");
		w1.characterInfo();
		
		System.out.println("--------------");
		
		Hunter h1 = new Hunter("헌터a");
		h1.characterInfo();
		
		System.out.println("--------------");
		
		Mage m1 = new Mage("법사a");
		m1.characterInfo();
		
	}

}
