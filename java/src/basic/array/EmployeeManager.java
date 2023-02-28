package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String [100];		//사번
		String[] names = new String [100];			//이름
		int[] ages = new int [100];					//나이
		String[] departments = new String [100];	//부서명
		boolean flag = false;
		
		
		int i,j;
		
		
		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0 ;
		init:
		while(!flag) {
		System.out.println("========= 사원 관리 프로그램 ========= count: "+count);
		System.out.println("1. 사원 신규 등록");
		System.out.println("2. 사원 정보 보기");
		System.out.println("3. 사원 정보 조회");
		System.out.println("4. 사원 정보 수정");
		System.out.println("5. 사원 정보 삭제");
		System.out.println("6. 사원 정보 삭제");
		System.out.println("0. 종료");
		System.out.println("=================================");
		System.out.print("> ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:	//사원 신규 등록
				
			System.out.print("사원의 사번: ");
				String num1 = sc.next();
				while(true) {
					boolean flag1 =false;
					for(i=0;i<count;i++) {
						if(num1.equals(userNums[i])) {
							flag1= true;
							break;
						}//case 1 userNums if
					}//case 1 userNums for
					if(!flag1) break;
					else {
						System.out.println("중복된 사번을 입력했습니다. 다시 입력해주세요.");
						System.out.print("사원의 사번: ");
						num1 = sc.next();
					}
				}
				userNums[count] = num1;
				
				System.out.print("사원의 이름: ");
				String name = sc.next();
				names[count] = name;
				
				System.out.print("사원의 나이: ");
				int age = sc.nextInt();
				ages[count] = age;
				
				System.out.print("사원의 부서: ");
				String depart = sc.next();
				departments[count] = depart;
				System.out.println("\n성공적으로 입력되었습니다. 시작메뉴로 돌아갑니다.");
				System.out.println("---------------------------------");
				count++;
				break;//case1 break
		case 2://사원 정보 보기
			if(count == 0 ) { 
				System.out.println("입력된 사원 정보가 없습니다. 시작메뉴로 돌아갑니다.");
				System.out.println("---------------------------------");
				continue init;
			}
			for(i=0;i<count;i++) {
				System.out.printf("#%d",i+1);
				System.out.printf("  사번: %s",userNums[i]);			//사번
				System.out.printf("  이름: %s",names[i]);		//이름
				System.out.printf("  나이: %d",ages[i]);			//나이
				System.out.printf("  부서: %s\n",departments[i]);	//부서명
						
			}
			System.out.println("---------------------------------");
			break;//case2 break
		case 3:
			boolean flag3 = false;
			if(count == 0 ) { 
				System.out.println("입력된 사원 정보가 없습니다. 시작메뉴로 돌아갑니다.");
				continue init;
			}
			System.out.println("조회하려는 사원의 사번을 입력하세요.");
			System.out.print("> ");
			String num3 = sc.next();
			
				for(i=0;i<count;i++) {
					if(num3.equals(userNums[i])) {
						flag3 = true;
//						System.out.println(flagI);
						break;
					}//case 3 for if
					
				}//case 3 for i
				if(flag3) {
				System.out.printf("사번 %s 의 정보입니다.",userNums[i]);	//사번
				System.out.printf("\n  이름: %s",names[i]);			//이름
				System.out.printf("\n  나이: %d",ages[i]);			//나이
				System.out.printf("\n  부서: %s",departments[i]);		//부서명
				}
				else {
					System.out.println("등록되지 않은 사번입니다. 시작메뉴로 돌아갑니다.");
					System.out.println("---------------------------------");
				}
				break;//case3 break
		case 4:
			boolean flag4 = false;
			boolean flag41 = false;

			System.out.println("수정하려는 사원의 사번을 입력하세요. ");
			System.out.print("> ");
			String num4 = sc.next();

			for(i=0;i<count;i++) {
				if(num4.equals(userNums[i])) {
					flag4 = true;
//					System.out.println(flag4); //flag4의 상태
					break;
				}//case4 for if
//				System.out.printf("num4 %s userNum[%d] %s",num4,i,userNums[i]);
				}//case4 for i
			System.out.println(flag4);
			if(flag4) {
					flag41 = false;
				
					System.out.printf("사번 %s 의 정보입니다.",userNums[i]);		//사번
					System.out.printf("\n  이름: %s",names[i]);				//이름
					System.out.printf("\n  나이: %d",ages[i]);				//나이
					System.out.printf("\n  부서: %s\n",departments[i]);		//부서명
					init4:
					while(!flag41) {
					System.out.printf("사번 %s 의 변경할 부분의 번호를 입력하세요.\n",userNums[i]);
					System.out.println("[1.나이변경 | 2.부서변경 | 3.취소]");
					System.out.print("> ");
					int sw4 = sc.nextInt();
					
					switch(sw4) {
					case 1:
						System.out.println("변경할 나이를 입력하세요.");
						System.out.print("> ");
						int age4 = sc.nextInt();
						ages[i] = age4;
						System.out.printf("사번 %s의 나이를 입력하신 나이 %d로 변경합니다.",userNums[i],age4);
						System.out.println("\n---------------------------------");
						break;
					case 2:
						System.out.println("변경할 부서명를 입력하세요.");
						System.out.print("> ");
						String depart4 = sc.next();
						departments[i] = depart4;
						System.out.printf("사번 %s의 부서를 입력하신 부서 %s로 변경합니다.",userNums[i],depart4);
						System.out.println("\n---------------------------------");
						break;
					case 3:
						flag41 = true;
						System.out.println("정보수정을 취소합니다. 시작메뉴로 돌아갑니다.");
						System.out.println("---------------------------------");
						break;
					default:
						System.out.println("올바르지않은 입력입니다.");
						System.out.println("---------------------------------");
						continue init4;
					}//case4 if while switch
					if(flag41) break;
				}//case4 if while
			}//case4 if
			else {
				System.out.println("등록되지 않은 사번입니다. 시작메뉴로 돌아갑니다.");
				System.out.println("---------------------------------");
				break;
			}//case4 else
//			System.out.println(Arrays.toString(userNums));
			break;

		case 5:
			boolean flag5 = false;
			boolean flagw = true;
			
			System.out.println("삭제하려는 사원의 사번을 입력하세요. ");
			System.out.print("> ");
			String num5 = sc.next();
			
				for(i=0;i<count;i++) {					//입력받은 num5(사번)이 저장된 배열userNum[]에 있는지 검사 || 만약 있다면 flag5 = true / 없다면 flag5 = false
					if(num5.equals(userNums[i])) {
						flag5 = true;						
						break;
					}//case 5 for if
				}//case 5 for i
				if(flag5) {								//flag5 = true일때 사번/이름/나이/부서명을 출력
				System.out.printf("사번 %s 의 정보입니다.",userNums[i]);	//사번
				System.out.printf("\n  이름: %s",names[i]);			//이름
				System.out.printf("\n  나이: %d",ages[i]);			//나이
				System.out.printf("\n  부서: %s",departments[i]);		//부서명
				sw5:																																//sw5:
					while(flagw) {
				System.out.printf("\n\n사번 %s의 정보를 정말 삭제하시겠습니까?[Y / N] ",userNums[i]);
				String ans = sc.next();					//Y/N 을 입력받는다.
//				System.out.println("ans="+ans); //ans의 값이 제대로 받는지 확인
					switch(ans) {//스위치 
					
					case "Y": case "y":	//입력받는 값이 Y,y일경우 삭제를 하는 코드
						if(i==userNums.length-1) {
							userNums[i]=null;
							names[i]=null;
							ages[i] =0;
							departments[i] = null;
						}
						for(j =i;j<count-1;j++) {
							userNums[j]=userNums[j+1];
							names[j]=names[j+1];
							ages[j]=ages[j+1];
							departments[j]=departments[j+1];
						}//case5 caseYN forj
						count--;
						System.out.println("삭제가 완료되었습니다. 시작메뉴로 돌아갑니다.");
						System.out.println("---------------------------------");
						flagw = false;
						break;//case5 caseYN Y 삭제하는 코드의 끝
						
					case "N": case "n"://N,n을 입력할경우 삭제를 안하는 코드
						System.out.println("삭제하지 않습니다. 시작메뉴로 돌아갑니다.");
						System.out.println("---------------------------------");
						flagw = false;
						break;//case5 caseYN N 의 끝
						
					default:// Y,y,N,n이 아닌 다른문자를 입력했을경우
						System.out.println("올바른 문자를 입력하세요.");						
						System.out.println("---------------------------------");
						continue sw5;//sw5위치로 돌아가서 다시 실행한다.	//case5 caseYN default	 Y 또는 N 이외의 값을 입력했을때 while로 돌아간다 lable 같은경우는 반복문에서만 동작하기때문에 switch문에서는 lable을 단독으로 동작할수없다 a: while{ switch { continue a;}}				
					}//case5 switch
				}
				}//case5 if
				else {
					System.out.println("등록되지 않은 사번입니다. 시작메뉴로 돌아갑니다.");
					System.out.println("---------------------------------");
				}//case else
				
			break ;//case 5 break
		case 6://부서별 인원보기
			String s;
			for(i=0;i<count;i++) {
				s=departments[i];
				if(!(s.equals(departments[i]))) {
					
				}
				for(j=0;j<count;j++) {
					if(s.equals(departments[j])) {
						System.out.printf("%s %s %d\n",userNums[j],names[j],ages[j]);
					}
				}
			}
			
			
			
			
			break;
		case 0: 
				System.out.println("프로그램을 종료합니다.");
				System.out.println("=---------------------------------");
				flag = true;
				break ;
			default:
				System.out.println("올바른 메뉴를 입력하세요.");
				System.out.println("---------------------------------");
				
		}
		System.out.println();
//		System.out.println(Arrays.toString(userNums));
//		System.out.println(Arrays.toString(names));
//		System.out.println(Arrays.toString(ages));
//		System.out.println(Arrays.toString(departments));
		
		
		}//while
		sc.close();
	}//main

}
