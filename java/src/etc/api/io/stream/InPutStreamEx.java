package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InPutStreamEx {

	public static void main(String[] args) {

		/*
		 1. 파일을 읽어들이는 데 사용하는 클래스는 FileInputStream 이다.
		 2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적는다.
		 3. InputStream 객체는 생성자에 throws가 있기때문에
		    예외처리를 진행해야 한다.
		 4.
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\javaS\\file\\hello.txt");
			 /*
			while(true) {
				int data = fis.read(); //1바이트 단위로 데이터를 읽어들임
				System.out.println((char)data);//숫자형을 문자형으로 변환 출력
				if(data == -1) break;
			}*/
			byte[] arr = new byte[100];
			int result = fis.read(arr); //100바이트 단위로 읽어들임
			System.out.println("읽어들인 데이터의 길이: "+result);
			System.out.println(Arrays.toString(arr));
			int i = 0;
			while(arr[i]!=0) {
				System.out.print((char)arr[i]);
				i++;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			}catch(IOException e) {
			e.printStackTrace();
			}
		}

	}

}
