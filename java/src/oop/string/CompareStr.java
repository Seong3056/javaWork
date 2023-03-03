package oop.string;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		User kim = new User("abc123","aaa1111");

		System.out.print("비밀번호를 입력하세요: ");
		String password = sc.next();

		System.out.println("비번"+password);
		System.out.println("객체비번"+kim.pw);
		System.out.println("----------------------");

		System.out.println("==같다 "+(kim.pw == password));
		System.out.println("equals같다 "+password.equals(kim.pw));


	}

}
