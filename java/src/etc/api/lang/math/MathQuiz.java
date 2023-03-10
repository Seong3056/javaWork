package etc.api.lang.math;

public class MathQuiz {

	static int up (int x) {
		return (int)Math.ceil(x/10.0);
	}
	
	public static void main(String[] args) {
		
		System.out.println(up(21));
		
	}

}
