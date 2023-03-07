package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {

		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();

		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();

		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();

		//다형성을 적용해서 이종모음 배열을 선언할 수 있다.
		Car[] c = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
		for(Car n : c) {
			n.run();
		}

		System.out.println("--------------------------");
		
		System.out.println("***타이어 교체****");
		t1.frontLeft = new HTire();
		t1.forntRight = new HTire();
		t1.rearLeft = new HTire();
		t1.rearRight = new HTire();
		
		Driver kim = new Driver();
		kim.drive(p1);
		
		Car cc = kim.buyCar("테슬라");
		cc.run();
		Tesla t5 = (Tesla) cc;
		t5.enterMembership();
		
		
		CarShop shop = new CarShop();
		shop.carPrice(s3);
		shop.carPrice(new Tesla());
		shop.carPrice(kim.buyCar("포르쉐"));
		
		
		
	}


}
