package oop.poly.player;


public class Player {
	
	String name;
	int level;
	int atk;
	int hp;
	/*
	 # this
	 - 자기 자신 객체를 가리키는 키워드 입니다.
	 - 생성자 또는 메서드 내에서 this를 사용하면 
	   this는 그 생성자 또는 메서드를 호출한 객체의 주소값을 가져온다.
	 - this()를 사용하여 같은 클래스 내의 다른 생성자를 호출 할 수 있다.
	   이 때 괄호내 매개변수의 선언에 따라 원하는 생성자를 호출할 수 있다.
	 */
	
	Player(){
		
//		System.out.println("Player의 기본 생성자 호출");
//		System.out.println("this : "+this);
		level = 1;
		atk = 3;
		hp = 50;
	}
	Player(String name){
		this(); //같은 클래스의 다른 생성자를 호출
//		System.out.println("Player의 2번 생성자 호출");
//		System.out.println("this : "+this);
//		level = 1;
//		atk = 3;
//		hp = 50;
		this.name = name;
	}
	Player(String name, int hp){
		this(name);//생성자의 최상단에 위치해야 한다.
//		System.out.println("Player의 3번 생성자 호출");
		this.hp = hp;
	}
	
	void attack(Player p) {
//		System.out.println("target: "+p);
//		System.out.println("this: "+this);
		if(this == p) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		
		System.out.printf("%s가 %s를 공격합니다\n",this.name,p.name);
		p.hp -= 10;
		this.hp += 5;
		System.out.printf("나의 체력: %d 상대방 체력: %d\n	",this.hp,p.hp);
		
		
	}
	
	void characterInfo() {
		System.out.println("*** 캐릭터정보 ***");
		System.out.println("# 아이디: "+ name);
		System.out.println("# 레벨: "+ level);
		System.out.println("# 공격력: "+atk);
		System.out.println("# 체력: "+ hp);

	}
	
}
