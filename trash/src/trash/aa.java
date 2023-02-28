package trash;
import java.util.Scanner;

public class aa {
	static int check(int input) {
		int i,j;
		int [] comp = new int[3];	
		boolean flag = false;
		int in = input;
		for(i=2;i>=0;i--) {
			comp[i] = input%10;
			input /= 10;
		}
		for(i=0;i<3;i++) {
			for(j=i+1;j<3;j++)
				if(comp[i] == comp[j])						
					flag = true;
		}
		if(flag) {
			System.out.println("중복된 숫자를 입력했습니다.");
		return 0;
		}
		else return in;
		
		
		
	}
	public static int rand(int n) {//(자릿수입력)

		int i,j;
		int [] comp = new int[n];		
		int r,r1;
		int p = (int) Math.pow(10, n);
//		System.out.println(p);
//		System.out.println(comp.length);
		outer: while(true) {
			
			r = (int)((Math.random()*p-2)+1);
//			System.out.println(r);
			r1 = r;
			//System.out.println(r);
			for(i=0;i<n;i++) {
				comp[n-1-i] = r1%10;
				r1 /= 10;
			}
			//System.out.println(Arrays.toString(comp));
			for(i=0;i<n;i++) {
				for(j=i+1;j<n;j++)
					if(comp[i] == comp[j])						
						continue outer;
			}
			return r;
		}

	}
	static int[] digit(int a) {
		int[] tmp = new int[3] ;

		for(int i=2;i>=0;i--) {
			tmp[i] = a%10;
			a /= 10;
		}



		return tmp;
	}
	static int strike(int input, int r,int n) {//(입력숫자, 랜덤숫자, 자릿수)
		int s=0;
		int[] comp = new int[n];
		int[] in = new int[n];
		for(int i=0;i<n;i++) {
			comp[n-1-i] = r%10;
			in[n-1-i]= input%10;
			r /= 10;
			input /= 10;
		}
		for(int i =0;i<n;i++) {
			if(comp[i]==in[i]) { 
				s++;
				//System.out.printf("i%d s%d\n",i,s);
				}
			
		
	}
		return s;
	}
	static int ball(int input, int r,int n) {
		int b=0;
		int i,j;
		int[] comp = new int[n];
		int[] in = new int[n];
		
		for(i =0;i<n;i++) {
			comp[i] = r%10;
			in[i]= input%10;
			r /= 10;
			input /= 10;
		}
		for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {			
			if(comp[i]==in[j]) {
				b++;
				//System.out.printf("i%d j%d b%d\n",i,j,b);
				}
			
		}//for_j
		}
		return b;
	}
	static int sbo(int input, int x,int n) {
		
		boolean Oflag=false;
		
		int s = strike(input,x, n);
		int b = ball(input,x, n) - s;
		if(s==0&&b==0) Oflag = true;
		if(Oflag) System.out.println("Out");
		else if(s==3) return s;
		else System.out.printf("S%d B%d\n",s,b);
		return s;
		
	};
	



	public static void main(String[] args) {		

		int i=0,j;
		int s=0;
		Scanner sc = new Scanner(System.in);
		
		int input;
		boolean flag = false;
		
		System.out.print("도전할 자릿수를 입력하세요: ");
		int num = sc.nextInt();		
		
		
		int r = rand(num);
//		System.out.println(r);
		outer:
		while(!flag) {

			System.out.print("맞춰볼 숫자를 입력: ");
			input = sc.nextInt();
			if(input>=Math.pow(10, num)) {
				System.out.println("올바르지 않은 숫자를 입력했습니다. 다시 입력해주세요.");
				continue outer;
			}
			else {
//				System.out.println(r+"r");
				if(check(input)==0)
					continue outer;
				else {
					s = sbo(input,r,num);
					if(s == num) flag = true;			
					i++;
				}
			}
		}//while
		System.out.printf("%d트해서 맞췄습니다! %d",i,r);
		sc.close();
	}//main




}//class