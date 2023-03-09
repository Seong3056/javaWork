package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton();
//		Singleton.method1();
//		Singleton.method2();

//		Singleton s1 = Singleton.s;
//		Singleton.s = null;
		
		/*
		 private 외부에서 객체에 접근하지 못하게 설정
   		 static  선언한 Singleton을 전역으로 쓰이게 설정
   		 
   		 getInstance 선언한 new Singleton을 불러올수 있도록 하는 함수
		 */
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
