package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {
		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.

        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.

        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
		 */
		Scanner sc = new Scanner(System.in);
		String road = "C:\\javaS\\file\\";
		FileInputStream file = null;//복사대상
		FileOutputStream copy = null;


		try {
			System.out.print("복사할 파일명: ");
			String name = sc.next();
			file = new FileInputStream(road+name);
			copy = new FileOutputStream(road+"upload\\"+name);
			int result;
			byte[] arr = new byte[100];
			while((result = file.read(arr))==-1) {
				copy.write(arr,0,result);
			}
			/*
			while(true) {
				result = file.read(arr);
				if(result == -1) break;
				copy.write(arr,0,result);

			}*/


		}//try 
		catch (FileNotFoundException e) {
			System.out.println("파일명이 없습니다.");
		}//FileNotFound
		catch (IOException e) {
			System.out.println("파일처리 중 예외 발생!");
		}//IO
		catch (Exception e) {
			e.printStackTrace();
		}//Ex
		finally {
			try {
				file.close();
				copy.close();
			}// t
			catch (IOException e) {

				e.printStackTrace();
			}// t catch IO
			catch (NullPointerException e) {
				System.out.println();
			}// t catch Null
		}//finally

	}//main

}//class
