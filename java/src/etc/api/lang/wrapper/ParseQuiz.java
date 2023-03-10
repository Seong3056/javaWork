package etc.api.lang.wrapper;


import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String number;
		char c;
		long n;
		while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			number = sc.next();
			if(number.indexOf('-')==-1) {
				System.out.println("주민등록번호는 '-'를 포함하여 입력해주세요");
				continue;
			}
			number = number.replace("-", "");
			c = number.charAt(6);
			if(number.length()!=13) {
				System.out.println("주민등록 번호를 올바르게 입력해주세요.");
				continue;	
			}
			if(!(c == '1'|| c == '2'|| c == '3'|| c == '4')) {			
				System.out.println("뒷자리 첫번째 숫자는 1,2,3,4 중 하나여야 합니다.");
				continue;
			}
			try {
				n = Long.parseLong(number);
				break;
			} catch (Exception e) {
				System.out.println(number);
				System.out.println("숫자로 정확하게 입력해주세요.");
			}


		}//while
		int year,month,day;
		String gender;
		n /= 1000000;
		if(c=='1'||c=='2')  year = 1900;
		else year = 2000;
		if(c=='1'||c=='3') gender = "남자";
		else gender = "여자";
		year += Integer.parseInt(number.substring(0, 2));
		month = Integer.parseInt(number.substring(2,4));
		day = Integer.parseInt(number.substring(4,6));

		System.out.printf("%d년 %d월 %d일 %d세 %s입니다.",year,month,day,2023-year,gender);
		sc.close();
	}//main


}//class


