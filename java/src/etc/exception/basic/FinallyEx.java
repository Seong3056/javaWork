package etc.exception.basic;

public class FinallyEx {

	public static void main(String[] args) {
		
		String[] pets = {"강아지","고양이","짹짹이"};
		
		for(int i=0;i<4;i++) {
			try {
				System.out.println(pets[i]+"키우고싶다");
			
			} 
			catch (Exception e) {
				System.out.println("애완동물의 정보가 없습니다.");
			}
			finally {//필수는 아님
				/*
					finally 블록에는 예외 발생 여부와 싱관없이
					항상 실행핟고 싶은 문장을 작성합니다.
					객체를 반납하거나 메모리에서 해제할 때 finally를 주로 사용합니다
				 */
				System.out.println("아무튼 실행되는 문장입니다.");
				System.out.println("-------------------");
				 
			}
		}

	}

}
