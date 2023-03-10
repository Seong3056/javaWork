package etc.api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		//올림
		int i =(int)Math.ceil(1.1);
		System.out.println(i);
		
		//내림
		double d= Math.floor(1.5);
		System.out.println(d);
		
		//반올림 소숫점 첫째자리에서 반올림
		double d2 = Math.round(3.141592*100)/100.0;
		System.out.println(d2);
		
		//제곱
		double d3 = Math.pow(3,4);
		System.out.println(d3);
		
		int max = Math.max(2, 10);
		System.out.println(max);
		
		int min = Math.min(24, 33);
		System.out.println(min);
		
		
		System.out.println(Math.sqrt(9));
		
		
	}

}
