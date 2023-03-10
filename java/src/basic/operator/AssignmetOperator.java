package basic.operator;

public class AssignmetOperator {

	public static void main(String[] args) {
		
		/*
		 # 대입 연산자 (=)
		 # 복합 대입 연산자 (+=, -=, *=, /=, %=)
		 - 변수에 값을 대입할 때 싸용하는 연산자 이다.
		 - 복합 대입 연산자는 대입 연산자에 산술 연산자가 결합되어 있는 형태이다.
		 */
		
		int a = 5;
		int b = 5;
		
		a += 3; // a = a+3
		b =+ 3; // b = +3
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------");
		
		a-= 4; //4
		System.out.println(a);
		
		a*= 6; //24
		System.out.println(a);
		
		a/= 5;//4
		System.out.println(a);
		
		a%= 3;//1
		System.out.println(a);
		
	}

}
