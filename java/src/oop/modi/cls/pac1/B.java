package oop.modi.cls.pac1;

//pulic 제한자는 접근 제한 자체가 없는 형태(어디서나 사용 가능)
public class B {

	//클래스 A의 접근제한자는 defauly이기 때문에
	//동일 패키지 내부의 클래스에서는 접근이 가능하다.
	A a = new A();
}