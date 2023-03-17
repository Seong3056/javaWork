package chap2.quiz01;

public class Person {
	
	
	private String name;
	private String age;
	
	
	public Person(String name, String age) {
		
		this.name = name;
		this.age = age;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
	
	String info() {
		return "이름: "+name+", 나이: "+age;
	}
}
