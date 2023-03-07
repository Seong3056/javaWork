package chap2.quiz01;

public class Student extends Person{
	String studentId;
	Student(){
		name = "김철수";
		age = "25";
		studentId = "a0001";
	}
	@Override
	String info() {
		
		
		return super.info()+", 학번: "+studentId;
	}
	
	
}
