package oop.poly.player;


public class Warrior extends Player {
	
	int rage;
	Warrior(String name){
		//모든 생성자에는 super()가 내장되어 있다.
		//자식 객체가 생성 될 때는 부모의 객체도 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고, 물려줄 수가 있기 때문이다.
		super(name);		
		this.rage = 60;
	}
	public void rush(Player p) {
		/*
		 - 전사의 고유 기능인 rush 메서드를 작성합니다.
		 
		 - rush의 대상은 모든 직업들 입니다.
		 - 만약 rush의 대상이 전사라면 10의 피해를 받고, 마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
		 - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
		 - 남은 체력도 출력해 주세요.
		 - main에 객체를 생성한 후 호출해서 잘 적용됐는지 확인해주세요.
		 */
		if(this == p) System.out.println("자기자신은 때릴수 없습니다.");
		else if(p instanceof Warrior)	p.hp -= 10;
		else if(p instanceof Mage )		p.hp -= 20;
		else if(p instanceof Hunter)		p.hp -= 15;
		System.out.printf("%s의 rush공격에 의해 %s의 체력이 %d 남았습니다.\n",this.name,p.name,p.hp);
	}
	@Override//alt + shift + s = override/implement methods
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: "+rage);
	}
	
}
