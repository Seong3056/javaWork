package oop.constructor;

public class Person {

	String name;
	int age;
	int height;
	
	Person(){}
	void info() {
		System.out.printf("%s님의 정보\n",name);
		System.out.println("나이: "+age);
		System.out.println("키: "+height);
	}
}
