package chap2.quiz01;

public class Teacher extends Person {
	String subject;

	Teacher(){
		name = "홍길동";
		age = "37";
		subject = "수학";
	}
	@Override
	String info() {
		
		return super.info()+", 과목: "+subject;
	}
	
	
	
}
