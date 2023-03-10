package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		try {System.out.print("정수: ");
		int n = sc.nextInt();

		int result = 100/n;

		System.out.println(arr[result]);
		String s = null;

		s.equals("메롱");
		/*
		 - 다중 catch문은 실제로 에러가 발생하면
		   위에서부터 순서대로 catch문을 검색하면서 내려오기 때문에 
		   부모타입의 예외를 자식타입의 예외보다 위에 작성하면 안된다.

		- catch 옆에 괄호에 예외 타입을 여러개 작성하고 싶은경우
		  '|' 기호를 사용하여 타입을 나열해주면 하나의 catch블록으로
		   여러 타입의 예외를 동시에 처리할 수 있다. (java7부터 가능)
		 */


		}

		catch(InputMismatchException  | ArithmeticException e){
			System.out.println("정수를 입력하세요");
		}		
		catch (NullPointerException e) {
			System.out.println("null을 참조하면 안되요");
		}

		catch(Exception e){
			System.out.println("알수 없는 에러");
			System.err.println("에러형태"+e.getMessage());
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
