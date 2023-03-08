package chap2.quiz02;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("차: ");
		Car my = new Car(sc.next());
		boolean flag = true;
		String m;

		while(flag) {
			if(my.start == true) m = "걸림";
			else m = "안걸림";
			System.out.println("*** 동작을 정하세요 ***");
			System.out.println("1. 시동 걸기/끄기");
			System.out.println("2. 변속설정");
			System.out.println("3. 속도변경");
			System.out.printf("현재 상태 시동%s %s %d\n",m,my.mode,my.speed);
			System.out.print("> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("시동 걸기:1 끄기:0");
				System.out.print("> ");
				int start = sc.nextInt();
				if(start == 1&& my.mode == 'P') 
					my.engineStart();
				else if(start == 0){
					my.engineStop();
					if(my.start == false)
						flag = false;
				
				}
				else
					System.out.println("변속기어를 P로 설정하십시오.");
				break; //case1
			case 2:
				System.out.println("변속모드를 고르세요 [P,N,D,R]");
				System.out.print("> ");
				String mode = sc.next();
				my.setMode(mode.charAt(0));
				break;
			case 3:
				System.out.print("속도를 입력하세요 0~200: ");
				my.setSpeed(sc.nextInt());
				break;
			default:
				break;
			}
			System.out.println("-----------------------");
			//		my.carStatus();
		}


		sc.close();
	}

}
