package chap2.quiz01;

public class Employee extends Person {
	private String department;
	
	Employee(){
		super("박부장","43");
		department = "마케팅";
	}
	@Override
	String info() {
		
		return super.info()+", 부서: "+department;
	}
	
}
