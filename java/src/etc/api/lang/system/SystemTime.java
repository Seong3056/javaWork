package etc.api.lang.system;

public class SystemTime {

	public static void main(String[] args) {
		
		/*
		 - system 클래스가 제공하는 currentTimeMillis()는
		   1970년 1월1일 자정을 기준으로 현재까지 소요된 시간을
		   밀리초(1/1000)로 변환한 long타입의 정수를 반환한다.
		 */
		long start = System.currentTimeMillis();//1970.1.1 부터 지난 밀리초
		int total =0;
		for(long i =1;i<=100000000L;i++) {
			total += i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("실행 소요시간:"+(end-start)*0.001 +"초");
		
		System.out.println(System.getProperties());
		System.out.println(System.getenv());
		System.exit(0);
		
	}

}















