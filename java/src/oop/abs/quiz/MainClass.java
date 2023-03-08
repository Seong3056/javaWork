package oop.abs.quiz;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
        - Shape를 상속받는 Circle과 Rect 클래스를 생성해 주세요.
        
        - Circle 객체를 생성할 때, 반지름도 받아서 초기화 할 수 있는
         생성자를 선언해 주세요.
         Rect 객체를 생성할 때, 이름과 변의 길이를 받도록 처리해 주세요.
         
        - 오버라이딩이 강제되는 메서드에는 각 도형의 넓이를 구하는
         로직을 알아서 작성해 주세요.
         
        - MainClass에서 길이가 5인 정사각형,
         반지름이 4인 원의 모든 내용을 호출해 보세요.
        */
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 이름: ");
		String s_name = sc.next();
		System.out.print("사각형의 변: ");
		int s_x = sc.nextInt();
			
		System.out.print("원의 이름: ");
		String c_name = sc.next();
		System.out.print("원의 변: ");
		int c_r = sc.nextInt();
		
		Shape square = new Rect(s_name,s_x);
		System.out.printf("%s의 넓이는 %.0f입니다.\n",square.getName(),square.getArea());
		
		Shape circle = new Circle(c_name, c_r);
		System.out.printf("%s의 넓이는 %.1f입니다.\n",circle.getName(),circle.getArea());
		
		

	}

}
