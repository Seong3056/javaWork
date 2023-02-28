package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		//sc.nextLine();
		//일부러 입력 대기를 해서 흐름을 잠시 끊어준다.
		Scanner sc = new Scanner(System.in);	
		int n;	//인원
		int i,j,k;
		int b=0;
		boolean flags = false;
		int menu=0;
		int bcount=0;
		String[] bul = new String[6];
		
		boolean bullet [] = new boolean[6];//탄창은 6개
		
		while(true) {
		System.out.print("몇명이 게임하나요? (2~4명): ");
		n = sc.nextInt();
		if(n<2||n>4) {
			System.out.println("올바르지 않은 인원입니다!");
			}
		else break;
		}					//인원을 입력
		
		String[] people = new String[n]; //people의 길이를 인원수만큼 설정
		
		for(i=0;i<n;i++) {
			System.out.print("플레이어의 이름을 입력: ");
			String p = sc.next();			
			people[i]=p;
		}//참가플레이어 이름을 입력
		
		switch(n) {
		case 2:
			System.out.println("참가인원이 '2'명입니다. 한번씩 격발할 때마다 재장전합니다.");
			b=1;
			break;//switch n case1
			
		case 3: case 4:
			System.out.print("\n게임모드를 고르시오.");
			System.out.print("\n[ 1. 최후의 1인 | 2. 총알을 모두소비(총알갯수는 랜덤) ]> ");
			menu = sc.nextInt();
			mode:
				while(!flags) {
					switch(menu) {
					case 1:
						b = n-1;
						flags = true;
						continue mode;
					case 2:
						b = (int)(Math.random()*(n-1)+1);
						flags = true;
						continue mode;
					default:
						System.out.println("올바르지 않은 입력입니다.");
						System.out.print("\n게임모드를 고르시오.[ 1. 최후의 1인 | 2. 총알을 모두소비(총알갯수는 랜덤) ]> ");
						b = sc.nextInt();
						continue mode;
					}//switch 3~4인

				}//while
			break;//switch n case3,4

		}//switch
		System.out.println();
		System.out.print("플레이어:");
		System.out.println(Arrays.toString(people));
		if(menu==2)System.out.println("총알의 갯수는 아무도 모릅니다. 게임이 끝날때 까지...");
		else		System.out.printf("총알의 갯수는 %d개입니다. ",b);
		System.out.println("\n-----------------------------------");
		int bb = b;
		
		init:
		while(bb>0) {
//			System.out.println(bb);
			int rb = (int)(Math.random()*((bullet.length)));
//			System.out.println("\n총알위치"+rb);
			if(bullet[rb]==true) continue init;
			else {
				bullet[rb]=true; 
				bb--;
				}
			
		}
		
		System.out.println();
//		System.out.println(Arrays.toString(bullet));
		int r = (int) (Math.random()* n);//시작할 사람 랜덤
		k=0;
		for(i =0 ;i<bul.length;i++) {
			if(bullet[i]==true) bul[i]="●";
			else bul[i]="○";}
		sc.nextLine();
		init:
		while(true) {
			String[] tmp = new String[people.length-1];
			r %= people.length;
//			System.out.println("r "+r);
			
			System.out.printf("플레이어 '%s'의 차례입니다.",people[r]);
			System.out.printf("엔터를 누르시면 격발합니다.");
			sc.nextLine();
			
//			System.out.print("people배열의 길이");
//			System.out.println(people.length);
//			System.out.print("tmp배열의 길이");
//			System.out.println(tmp.length);
			if(b==1) {
				for(i=0;i<bullet.length;i++)
					bullet[i]=false;
				int rb = (int)(Math.random()*((bullet.length)));
				bullet[rb] = true;
				for(i =0 ;i<bul.length;i++) {
					if(bullet[i]==true) bul[i]="●";
					else bul[i]="○";
					}
				
			}
			
			if(bullet[k%6]==true) {
				bullet[k%6] = false;
				for(i =0 ;i<bul.length;i++) {
					if(bullet[i]==true) bul[i]="●";
					else bul[i]="○";}
				bcount = 0;
				for(i=0;i<bullet.length;i++)
					if(bullet[i]==true)
						bcount++;
//				System.out.println(Arrays.toString(bullet));
				System.out.println("\n\t  빵!!\n");
				System.out.printf("플레이어 %s 가 죽었습니다.",people[r]);
				if(bcount > 0) {					
					 System.out.printf(" 남은 인원은 %d 입니다.",people.length-1);
					 }
				System.out.printf("\n\t %s %s\n",bul[0],bul[1]);
				System.out.printf("\t%s   %s\n",bul[5],bul[2]);
				System.out.printf("\t %s %s",bul[4],bul[3]);
				System.out.println("\n-----------------------------------");
				System.out.println();
				for(i=r;i<people.length-1;i++) {
					people[i] = people[i+1];
//					System.out.printf(" people[%d] %s",i,people[i]);
				}
//				System.out.println();
				for(i=0;i<tmp.length;i++) {
					tmp[i]=people[i];
//					System.out.printf(" tmp[%d] %s",i,tmp[i]);
				}
				people = tmp;
				tmp = null;
					
				for(i=0;i<bullet.length;i++)
					if(bullet[i]==true) continue init;
				if (i==bullet.length) break;
					
				
			}
			else {
				System.out.println("\n\t'찰칵' 격발되지않았습니다. 아직은말이죠..\n");
				System.out.printf("\t %s %s\n",bul[0],bul[1]);
				System.out.printf("\t%s   %s\n",bul[5],bul[2]);
				System.out.printf("\t %s %s\n",bul[4],bul[3]);
			}
//			System.out.println(Arrays.toString(bullet));
			
			
			
			k++;//다음총알
			r++;//다음사람
			System.out.print("생존한 플레이어: ");
			System.out.println(Arrays.toString(people));
			System.out.println("-----------------------------------");
			
			
			
						
		}//while
		System.out.println();
		System.out.printf("최후의 생존자 ");
		for(i=0;i<people.length;i++)
		System.out.printf("%s ",people[i]);
		System.out.println("!");
		sc.close();
		
		

	}

}
