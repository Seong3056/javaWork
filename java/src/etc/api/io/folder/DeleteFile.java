package etc.api.io.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFile {

	public static void main(String[] args) {

		File file = new File("C:\\javaS\\folder_test\\test");
		/*
		 if(file.exists()) {
		 
			file.delete(); //delete 성공시 true, 실패시 false를 리턴
			System.out.println("파일을 삭제했습니다.");
		}
		else System.out.println("파일 삭제 실패 or 존재하지 않는 파일입니다.");
		*/
		if(file.exists()) {
			if(file.isDirectory()) {//파일이 디렉토리인지 확인
				File[] files = file.listFiles();
				for(int i=0;i<files.length;i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName()+"삭제");
					}
					else System.out.println(files[i].getName()+"삭제실패");
				}
				
			}
		}
		if(file.delete())
			System.out.println("삭제");
		else
			System.out.println("삭제실패");
	
	
	
	
	
	
	
	}

}
