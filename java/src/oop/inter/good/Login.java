package oop.inter.good;

public class Login implements IUserService {

	@Override
	public void execute() {
		System.out.println("사용자의 id,pw받고 DB와 비교등등..");
		}

}
