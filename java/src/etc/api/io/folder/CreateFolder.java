package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		/*
		 - 자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용한다.
		 - 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정한다.
		 
		 */
		File file = new File("C:\\javaS\\folder_test\\test\\mytest\\apple");
		if(!file.exists()) { //해당 파일 및 폴더가 존재하면 true, 존재하지않으면 false
			file.mkdir();//폴더 생성
			file.mkdirs();//다중 폴더 생성
			System.out.println("폴더 생성 완료");
		}
		else System.out.println("해당 폴더가 이미 존재합니다.");

	}

}



























