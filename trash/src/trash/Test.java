package trash;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		char[] n = {'0','1','2','3','4','5','6','7','8','9'};
		int[] m = new int[4];
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		double in = sc.nextDouble();
		
		System.out.println(in);
		int ins=0;
		System.out.println(ins);
		
		ins = (int) (in*10000);
		System.out.println(ins);
		
		
		for(i =0;i<4;i++) {
			m[3-i] = ins%10;			
			ins /= 10;			
		}
		
		for(i=0;i<n.length;i++) {
			for(j=0;j<4;j++) {
				if(m[j]+48==n[i]) n[i]=' ';
			}
		}
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(n));
		

	}

}
