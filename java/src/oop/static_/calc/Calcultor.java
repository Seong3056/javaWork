package oop.static_.calc;

public class Calcultor {
	
	/*
	 - 계산기마다 색깔이 각각 다를 수 있기 때문에 color같은 변수는 
	   데이터를 공유시키지 말고, 객제별로 따로 관리해야 한다.
	   
	 - 반면에 pi같은 원주율값은 계산기마다 동일해야하기 때문에
	   static을 붙여서 데이터를 공유하게 하는 것이 유리하다.
	 */
	String color;
	static double pi = 3.141595;
	
	/*
	 - 메서드 내부에서 non-static 데이터를 참조하고 있는 메서드는
	   해당 변수의 정확한 위치(객체 주소값)을 알려줘야 하기 때문에 
	   정적 메서드로 선언하기가 부적합하다.
	 #
	 */
	
	public  void paint(String color) {
		System.out.println("계산기에" + color + "색을 칠합니다.");
		this.color = color;
	}
	/*
	 - 메서드 내부에서 인스턴스 변수를 사용하지 않고 범용성 있게 사용하는 
	   메서드는 static 키워드를 붙여서 정적 메서드로 선언하는것이 좋다.
	 * 
	 #
	 */
	public double areaCircle(int r) {
		return r*r*pi;
	}

}
