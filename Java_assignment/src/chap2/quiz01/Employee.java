package chap2.quiz01;

public class Employee extends Person {
	String department;
	Employee(){
		name = "박부장";
		age = "42";
		department = "마케팅";
	}
	@Override
	String info() {
		
		return super.info()+", 부서: "+department;
	}
	
}
