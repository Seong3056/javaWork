package etc.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

		Random r= new Random();
		
		//실수 난수 0 < d < 1
		double d = r.nextDouble();
		
		//정수 난수 int의 모든 범위
		int i = r.nextInt();
		
		//0~5까지의 정수 난수 생성
		int j = r.nextInt(6);
		
		//10~100까지의 정수 난수
		int k = r.nextInt(91)+10;
		
		//boolean 난수
		boolean flag = r.nextBoolean();

	}

}
