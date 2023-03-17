package chap2.quiz01;

public class Teacher extends Person {
	private String subject;

	Teacher(){
		super("박영희","34");
		subject = "수학";
	}
	@Override
	String info() {
		
		return super.info()+", 과목: "+subject;
	}
	
	
	
}
