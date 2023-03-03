package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 1 주민등록번호 13자리를 입력받습니다
		 2 주민등록 번호는 - 포함해서 받습니다
		 3 13자리가 아니라면 다시 입력받습니다
		 */

		Scanner sc = new Scanner(System.in);
		String nums;
		while(true) {
			System.out.println("주민등록번호 -포함하여 입력: ");
			System.out.print("> ");
			nums = sc.next();
			
			if(nums.length()<14) {
				System.out.println("주민등록번호 13자리를 입력해주세요");				
			}
			
			else break;			
		}
		System.out.printf("%s는 ",nums);
		
		int gender = Integer.parseInt(nums.substring(7, 8));		
		if(gender%2==1) System.out.printf("남자입니다.");
		else System.out.printf("여자입니다.");
		sc.close();
	}

}
