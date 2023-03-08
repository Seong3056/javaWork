package oop.abs.good;

public abstract class HeadStore {
	
	/*
	 # 추상 클래스, 추상 메서드
	 1.추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는
	   실체가 없는 추상 메서드가 되며, 이 메서드는 상속을 통해 자식 클래스에서
	   무조건 오버라이딩을 하도록 강요된다.
	   
	 2.추상 메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에
	   메서드의 바디 ' { } '부분이 없고, 세미콜론으로 메서드 선언을 마감한다.
	   
	 3.일반 클래스에서는 추상 메서드를 선언할 수 없다.
	   추상 메서드가 하나라도 존재한다면 해당클래스는 반드시 추상 클래스로 선언해야 한다.
	 
	 4.추상 클래스에 추상 메서드만을 선언할 필요는 없다.
	   일반 멤버변수 및 메서드도 얼마든지 선언이 가능하다.
	 */
	public abstract void orderApple() ;
	public abstract void orderBanana() ;
	public abstract void orderGrape() ;
	public void orderWaterMelon() {
		System.out.println("수박주스의 가격은 4000원입니다.");
	}
}
