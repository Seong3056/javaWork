package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {
		/*
        1. Date클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230314file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
        4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
		 */
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDateTime time = LocalDateTime.now();
		String road = "C:\\javaS\\file\\"+time.format(dtf)+"file\\";
		File file = new File(road);
		if(!file.exists())	file.mkdir();

		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = null;
		StringBuilder n = null;
		String s=null;
		
		
		try {
			System.out.print("파일명: ");
			String name = sc.next();
			n = new StringBuilder(road);
			n.append(name);
			n.append(".txt");
			fw = new FileWriter(n.toString());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		sc.nextLine();
		while(true) {
			
			try {
				
				System.out.print("내용 입력: ");				
				s = sc.nextLine();
				if(s.equals("그만")) break;
				
				fw.write(s+"\r\n");			
				
			} catch (Exception e) {
				e.getMessage();
			}
			

		}//while
		try {
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		BufferedReader br = null;		
		try {
			
			br = new BufferedReader(new FileReader(n.toString()));
			
			String str;
			while( (str = br.readLine()) != null ) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();	
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
