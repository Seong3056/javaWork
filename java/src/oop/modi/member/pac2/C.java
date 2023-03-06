package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

	public C() {
		A a = new A();
		a.x = 1;
//		a.y = 2; (X) default
//		a.z = 3; (X) private
		
		a.method1();
//		a.method2(); (X) default
//		a.method3(); (X) private
	}
}
