package basic.array;

public class MethodEx1 {
	
	static void total(int end) {
		int t = 0;
		for(int i=0;i<=end;i++)
			t += i;
		System.out.println(t);
	}
	
	public static void main(String[] args) {

		total(100);
		total(200);
		total(300);
		total(400);

	}

}
