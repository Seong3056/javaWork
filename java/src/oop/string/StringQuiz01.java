package oop.string;


import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/*
		 1 스캐너를 통해 id를 받는다
		 2 말썽꾸러기 사용자는 id에 공백을 입력할 수도 있다
		 3 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요
		 4 5글자 이상 입력되었다면 id가 등록되었습니다 출력후 종료
		 
		 + next()는 공백포함 문자열 입력시 공백을 인식하지 못한다.
		   공백포함 문자열을 받고 싶을 때는 nextLine()을 사용하여 문자열을 받는다.
		 */
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("ID: ");
			String id = sc.nextLine().trim();
			id = id.replace(" ", "");		

			if(id.length()>=5) {
				System.out.println("id가 등록되었습니다.");
				break;
			}
			else System.out.println("아이디는 5글자 이상입니다.");

		}
		sc.close();
	}

}
