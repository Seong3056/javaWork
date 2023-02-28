package trash;

import java.util.Arrays;
import java.util.Scanner;

public class NewMain {
	static int i,j;
	static int r;//난수
	
	static int[] rArray;
	static int s,b,o=s+b;
	
	
	static int[] digit(int x,int n) {
		int[] tmp =new int[n];

		for(i =0; i<n;i++) {
			tmp[n-i-1] = x%10;
			x /= 10;
		}		
		return tmp;
	}//digit
	static int[] overlap(int x,int n) {
		int[] tmp = new int[n];
		boolean flag = false;
		
		tmp = digit(x,n);
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(tmp[i]==tmp[j]) {
//					System.out.printf("%d%d %d%d",i,tmp[i],j,tmp[j]);
					flag = true;		
					System.out.println("중복된 숫자를 입력했습니다.");
					break;
				}
		if(flag) return null;
		return tmp;
	}//overlap
	static int rand(int n) {
		int[] tmp = new int[n];
		
		int r;
		init:
			while(true) {
				r = (int)(Math.random()*((int)Math.pow(10, n)-2)+1);

				tmp = digit(r,n);

				for(i=0;i<n;i++)
					for(j=i+1; j<n; j++)
						if(tmp[i]==tmp[j]) {
							continue init;
						}//if
				if(i==n) break;
			}//while
		return r;
	}//rand
	static int strike(int r,int x, int n) {//(난수, 입력, 자릿수)
		int s =0;
		int[] tmp = digit(x,n);
		rArray = digit(r,n);
//		System.out.println(Arrays.toString(tmp));
//		System.out.println(Arrays.toString(rArray));
		for(i=0;i<n;i++)
			if(rArray[i]==tmp[i]) s++;
		
		return s;
	}//strike
	static int ball(int r,int x, int n) {//(난수, 입력, 자릿수)
		int b =0;
		int[] tmp = digit(x,n);
		rArray = digit(r,n);
//		System.out.println(Arrays.toString(tmp));
//		System.out.println(Arrays.toString(rArray));
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			if(rArray[i]==tmp[j]) 
				b++;
		
		return b;
	}//ball
	

	public static void main(String[] args) {
		
		int count;
		int t = 0;
		char[] elm = {'0','1','2','3','4','5','6','7','8','9'}; 
		Scanner sc = new Scanner(System.in);

		//		System.out.print("> ");
		//		int num = sc.nextInt();
		//		tmp = digit(num,4);
		System.out.print("맞추고 싶은 자릿수를 입력 (3~4): ");
		int n = sc.nextInt();
		int[] tmp = new int[n];//쓰레기통

		int r = rand(n);//난수


		System.out.println("숫자가 정해졌습니다!"+r);
		System.out.println(".숫자를 입력하면 보기에서 제외됩니다.");
		init:
			while(true)		{
			System.out.print("숫자를 입력하시오.");
			for(i=0;i<elm.length;i++)
				System.out.printf(" %s",elm[i]);
			System.out.print("\n> ");
			double input = sc.nextInt();
			System.out.println(input);
			if(input<0) {//보기에서 제외할 숫자
				int in = (int)((input)*Math.pow(10, n));
				System.out.println(in);
			}//보기에서 제외할 숫자
			else {//맞출 숫자
				int in = (int)input;
				count =0;
				while(true) {//이상한 숫자 구분
					in /= 10;
					count++;					
					if(in==0) break;
				}			//이상한 숫자 구분

				if(count > n) {	//이상한 숫자
					System.out.println("올바르지 않은 숫자를 입력했습니다!");
					continue init;				
				}				//이상한 숫자

				else {	//제대로 된 숫자
					tmp = overlap(in,n);
					if (tmp==null){//중복된 숫자?
						System.out.println("tmp는 null이다.");
						continue init;
						}//중복된 숫자?
					else{//중복이 아닌숫자else
						s = strike(r,in,n);
						b = ball(r,in,n) - s;
						o = s + b;
						if(o==0)	System.out.println("Out");
						else if (s==4) break;
						else 		System.out.printf("S%d B%d",s,b);
						t++;
					}//중복이 아닌숫자else

				}		//제대로 된 숫자
			}//맞출 숫자
			
		}//while
		System.out.println("맞췄습니다!"+t+"트");

	}

}
