package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferrdReaderEx {

	public static void main(String[] args) {


		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader("C:\\javaS\\file\\merong.txt");
			br = new BufferedReader(fr);
			
			//BufferedReader에는 readLine() 메서드가 있다
			//한줄을 통째로 읽어서 String으로 리턴한다.
			//더이상 읽어올 데이터가 없다면 null을 리턴
			
//			System.out.println(br.readLine());
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
