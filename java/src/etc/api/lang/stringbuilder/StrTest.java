package etc.api.lang.stringbuilder;

public class StrTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();	
		
		
/*		String str1 = "a";
		for(int i =0 ;i<=500000;i++)
		 str1 += "a";
	*/	
		StringBuilder str2 = new StringBuilder("a");

		for(int i =0 ;i<=500000;i++)
			str2.append("a");
		
		
		long end = System.currentTimeMillis();
		System.err.println("실행 결과: " + (end-start)*0.001+"초");
	}

}
