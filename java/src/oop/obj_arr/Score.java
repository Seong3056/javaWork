package oop.obj_arr;

public class Score {
	
	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	private String name;
	private int kor;
	private int eng;
	private int math;
//	private int total;
//	private double avg;
	
	public Score() {}	// 생성자 선언 @@@@@@@@@@@@@

	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(name.equals("그만")) throw new InterruptedException();
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}	
	public double getAvg() {
		return (kor + eng + math)/3.0;
	}	
	public void scoreInfo() {
		if(getName()==null) throw new NullPointerException();
		System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %.1f\n",name,kor,eng,math,getTotal(),getAvg());
	}
	
	
}
