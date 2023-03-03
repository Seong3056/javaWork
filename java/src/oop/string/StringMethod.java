package oop.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello java";
		
		
		//charAt(index): 문자열 인덱스 따른 단일문자 반환
		char c = str.charAt(4);
		System.out.println(c);
		
		//substring(begin,end): 문자열의 범위를 지정하여 추출		
		String s = str.substring(1, 5); //1번이상 5번미만
		System.out.println(s);
		
		String s2 = str.substring(6); //6번부터 끝까지
		System.out.println(s2);
		
		//length(): 문자열의 총 길이 반환
		int s3 = str.length();
		System.out.println(s3);
		
		//indexOf(str): 해당 문자가 있는 인덱스를 반환
		//해당 문자가 존재하지 않으면 -1을 리턴
		int s4 = str.indexOf('l');
		System.out.println(s4);
		
		int s5 = str.lastIndexOf('l');
		System.out.println(s5);
		
		//여러 문자를 전달하면 시작 인덱스를 알려준다.
		int s6 = str.indexOf("java");
		System.out.println(s6);
		
		//일괄 대소문자 변경
		String sa = "HeLLo WoRLd";
		String s7 = sa.toLowerCase();
		System.out.println(s7);
		String up = sa.toUpperCase();
		System.out.println(up);
		
		//trim(): 문자열의 앞, 뒤 공백을 제거
		String name = "				홍길동				";
		System.out.println(name.trim());
		
		//replace(old, new)
		//: 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경
		String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
		System.out.println(java.replace("자바","java"));
		System.out.println(java.replace("습니", ""));
		
		//split(): 문자열을 구분자로 구분하여 분할
		//분할된 문자들은 String 배열에 담아서 리턴
		String phone = "010-1234-5678";
		String[] p = phone.split("-");
		System.out.println(Arrays.toString(p));
		
		String pet = "멍멍이, 야옹이, 짹짹이";
		String[] pets = pet.split(",");
		System.out.println(Arrays.toString(pets));
		System.out.println("-----------------------------------------");
		
		//문자열의 정수 변환
		String i1 = "100";
		String i2 = "3.14";
		int ii1 = Integer.parseInt(i1);//문자열 -> 정수
		double ii2 = Double.parseDouble(i2);//문자열 -> 실수
		System.out.println(ii1 + ii2);
		
		//valueOf: 기본 타입을 문자열로 변경
		System.out.println(3+4);
		System.out.println(String.valueOf(3)+String.valueOf(4));
		
		
		
	}

}
