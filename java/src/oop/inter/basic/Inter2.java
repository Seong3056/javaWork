package oop.inter.basic;


//인터페이스도 클래스처럼 extends를 사용하여 인터페이스간 상속을 구현할수있다
//다중 상속도 가능하다.(인터페이스 한정)
public interface Inter2 extends ParentInter{
	
	int i = 5; //static final 상수
	
	void method2(); //abstract
	
}
