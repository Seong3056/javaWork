package basic.loop;

public class CountinueEx {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) continue;
			System.out.print(i+" ");
		}
		System.out.println("\n 반복문 종료");

	}

}
