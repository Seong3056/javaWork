package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		MyBirth my = new MyBirth();
		
		my.setYear(1998);
		my.setMonth(1);
		my.setDay(16);
		if(my.getYear("abc1234")==0||my.getMonth()==0||my.getDay()==0);
		else
		System.out.printf("내 생일은 %d년 %d월 %d일입니다.\n",
				my.getYear("abc1234"),my.getMonth(),my.getDay());
	}

}
