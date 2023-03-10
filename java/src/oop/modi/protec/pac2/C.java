package oop.modi.protec.pac2;

import oop.modi.protec.pac1.*;


public class C extends A {
	
//	A a = new A(30); 	(X) protected
//	A a2 = new A(5.67); (X) default
	public C() {
	  /*
	   - protected 제한자는 패키지가 다른 경우 두 클래스 사이에 상속관계라면 
	     super 키워드를 통해 참조를 허용한다. 
	   */
		super(30);
//		super(5.67); (X) default
		
		super.x = 1;
//		super.y = 2; (X) default
		
		super.method1();
//		super.method2(); (X) default
	}
	
}
