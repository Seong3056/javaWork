package chap2.quiz01;

public class MainClass {

	public static void main(String[] args) {
		Person student = new Student();
		Person teacher = new Teacher();
		Person employee = new Employee();
		System.out.println(student.info());
		System.out.println(teacher.info());
		System.out.println(employee.info());

	}

}
