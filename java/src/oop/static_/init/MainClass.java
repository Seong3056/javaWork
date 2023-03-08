package oop.static_.init;

import oop.static_.singleton.Singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		DBManager DBManager = new DBManager();
		/*
		 - 정적 초기화자를 호출하려면 클래스를 로딩하시면 된다.
		 # 클래스 로딩 방법
		 1.클래스의 이름을 참조하여 static 멤버를 호출
		 2.객체를 생성
		 -정적 초기화자는 클래스 로딩시 최조 1회만 호출된다
		 */
		System.out.println("주소: "+DBManager.addr);
		System.out.println("계정명: "+DBManager.uId);
		System.out.println("비밀번호: "+DBManager.uPw);
		
		Singleton s =Singleton.getInstance();
		s.getInstance().method1();
		

	}

}
