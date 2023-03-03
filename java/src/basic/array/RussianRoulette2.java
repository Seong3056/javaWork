package basic.array;

import java.util.Scanner;

public class RussianRoulette2 {
	static int rand(int multi, int plus) {
		int r ;
		if(plus == 0) r= (int)(Math.random()*multi);
		else r = (int)(Math.random()*(multi)+plus);
		return r;
	}
	static int selBullet(int n) {
		int b=0;
		boolean flag = true;
		boolean flagm = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag)
			switch(n) {
			case 2:
				b=1;
				System.out.println("case"+n);
				flag = false;
				break;//case2
			case 3: case 4:
				
				while(flagm) {
				System.out.print("1.1명 2.소모");
				int menu = sc.nextInt();
				switch(menu) {
				
				
				}	
				
				
				}
				break;//case34
			default:
				System.out.println("잘못입력");
				break;
			}


		sc.close();
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		boolean flag = false;
		boolean flagm = false;
		int b ;
		System.out.print("몇명 ");
		int n = sc.nextInt();
		while(n<2||n>4) {

			if(n>1&&n<5) break;
			System.out.println("잘못된 입력");
			System.out.print("몇명 ");
			n = sc.nextInt();
		}
		String[] people = new String[n];
		for(i=0;i<n;i++) {
			System.out.print("누구");
			people[i]=sc.next();
		}
		System.out.print("몇명 ");
		n = sc.nextInt();
		
		b = selBullet(n);
		System.out.println(b);
		sc.close();
	}

}
