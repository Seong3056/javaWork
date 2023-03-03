package oop.constructor;

public class Bread {
	
	int price;
	String name;
	String ingredient;
	Bread(){
		
	}
	Bread(int bP, String bN, String bI){
		price = bP;
		name = bN;
		ingredient = bI;
	}
	
	void info() {
		System.out.println("빵 이름: "+name);
		System.out.println("빵 가격: "+price);
		System.out.println("주 재료: "+ingredient);
		System.out.println("----------------------");
	}
}
