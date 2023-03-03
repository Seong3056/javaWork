package basic.method;
/*
1. calcDivisor()라는 메서드를 선언하세요.
2. 이 메서드는 정수 하나를 전달받아서 해당 정수의
 모든 약수를 가로로 출력하고 약수의 개수를 리턴하는
 메서드입니다. (가로로 출력은 메서드 내부에서 진행)
3. 메서드 선언을 완료하시고, main에서
 72의 약수의 개수와 10의 약수의 개수를 출력해 보세요.
 호출 두번 하시는 거에요.
*/

public class MethodQuiz01 {
	static int calcDivisor(int x){
		int n=0;
		System.out.printf("%d의 약수는",x);
		for(int i=1;i<=x;i++)
			if(x%i==0) {
				System.out.printf(" %d",i);
				n++;
			}
		System.out.println();
		return n;
	}
	public static void main(String[] args) {
		
		int n1 = calcDivisor(72);
		int n2 = calcDivisor(10);
		System.out.printf("72의 약수의 개수 %d, 10의 약수의 개수 %d",n1,n2);
	}

}
