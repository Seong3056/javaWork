package chap2.quiz01;

public class Student extends Person{
	
	private String studentId;
	
	Student(){
		super("김철수","25");
		studentId = "a0001";
	}
	@Override
	String info() {
		return super.info()+", 학번: "+studentId;
	}
	
	
}
