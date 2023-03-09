package oop.inter.good;

public class Join implements IUserService {

	public void execute() {
		System.out.println("회원 가입 로직실행");
		System.out.println("DB접속, 입력값로드, 데이터입력..");
	}

}
