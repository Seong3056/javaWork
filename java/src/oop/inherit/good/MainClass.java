package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		Mage m1 = new Mage();
		Hunter h1 = new Hunter();
		
		w1.name = "전사";
		w1.atk = 3;
		w1.hp = 10;
		w1.level = 1;
		w1.rage = 60;
		
		m1.name = "마법사";
		m1.atk = 1;
		m1.hp = 7;
		m1.level = 2;
		m1.mana = 50;
		
		h1.name = "냥꾼";
		h1.atk = 2;
		h1.hp = 9;
		h1.level = 1;
		h1.pet = "다람쥐";
		
		w1.characterInfo();
		m1.characterInfo();
		h1.characterInfo();
	}

}
