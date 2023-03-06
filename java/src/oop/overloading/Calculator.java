package oop.overloading;

public class Calculator {
	int result;

	/*
	 # 오버로딩 (중복)
	   하나의 클래스 내부에서 같은 이름을 가진 메서드나
	   생성자를 여러개 중복해서 선언할 수 있게 해주는 문법

	 - 오버로딩 적용 조건:
	 1.매개변수의 데이터 타입이 다를 것
	 2.매개변수의 전달 순서가 다를 것
	 3.매개변수의 개수가 다를 것
	 */

	void inputData() {	}

	void inputData(int a) {	}

	void inputData(int a, int b) { }

	//	void inputData(int b, int a) { }

	void inputData(String s) { }

	void inputData(int a, double b) { }

	void inputData(double b, int a) { }

	//	void inputData(int number) {	}
	//	
	//	void inputData(int number) {
	//		return 0;
	//	} 반환 유형(return type)은 오버로딩에 영향을 미치지 못한다.

	int calcRectArea(int x) {
	return x*x;	
	}
	int calcRectArea(int x,int y) {
	return x*y;	
	}
	double calcRectArea(int x,int y,int h) {
	return (double)(x+y)*h/2;	
	}

}
