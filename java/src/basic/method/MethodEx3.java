package basic.method;

import java.util.Arrays;

/*
 # 반환값, 반환 유형(return value, return type)
 
 1.반환값이란 메서드의 실행 결과값을 의미한다.
 
 2.매개변수는 여러개 존재할 수 있지만, 반환값은 오직 한개만 존재해야한다.
 
 3.전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때 
   메서드 이름 앞에 반드시 반환 유형을 명시해야 한다.
 
 4.return이라는 키워드를 사용하며 return뒤에 값을 전달 할 값을 지정한다. (변수, 상수)
 
 5.반환값이 있는 메서드는 호출문 자체가 하나의 값으로 처리될 수 있기 때문에
   반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도 처리될 수 있다.
 
 6.모든 메서드가 반환값이 있는 것은 아니다. 메서드 실행후에 반환할 값이 없다면 return을 생략해도 된다.
   └ 이 때는 반환유형을 메서드를 선언할 때 void라는 키워드를 작성해 줘야 한다.
 
 7.모든 메서드는 return을 만나면 강제로 메서드가 종료된다.
   따라서 조건없이 return문 아래 코드를 작성할 수 없다.
   void메서드는 return 키워드를 탈출 기능으로 사용할 수 있다.
 */
public class MethodEx3 {
	
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	static int[] operateTotal(int n1, int n2) {
		return new int[] {add(n1,n2),n1-n2,n1*n2,n1/n2};
	}
	static double[] calcArrayTotal(int[] x) {
		
		int total=0;
		for(int n : x)
			total += n;		
		return new double[] {total,(double)total/x.length};
		
	}
	static void multi(int n1, int n2) {
		int result = n1*n2;
		System.out.printf("%d x %d = %d",n1,n2,result);
	}
	static void divide(int n1, int n2) {
		if(n2==0) {
			System.out.println("0으로 나눌순 없습니다");
			return;
		}
		int result = n1/n2;
		System.out.printf("%d / %d = %d",n1,n2,result);
	}
	public static void main(String[] args) {
		int r1 = add(3,8);
		int r2 = add(10,15);
		int r3 = add(add(4,6),add(7,8));
		
		int[] totalResult = operateTotal(30, 6);
		System.out.println("30 + 6 = "+totalResult[0]);
		System.out.println("30 - 6 = "+totalResult[1]);
		System.out.println("30 * 6 = "+totalResult[2]);
		System.out.println("30 / 6 = "+totalResult[3]);
		
		int[] arr = {57,89,78,91,93,47};
		double[] calArr = calcArrayTotal(arr);
		System.out.printf("합계: %d\n",(int)calArr[0]);
		System.out.printf("평균: %.2f\n",calArr[1]);
		
		/*
		 - 반환값이 없는 void 타입의 메서드는 값이 돌아오징낳기 떄문에
		   실행결과를 변수에 저장할 수 없고, 다른 메서드의 매개값으로도 사용이 불가능하다.
		 - 반드시 단독 호출하여 사용해야 한다.
		 - void메서드는 단순히 동작을 지시하는 역할을 수행한다.
		 */
		multi(5,3);
		System.out.println();
		divide(20,4);
	}

}
