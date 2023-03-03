package basic.method;
import java.util.Arrays;

public class MethodQuiz02 {
	
	static String[] foods = {"떡볶이","치킨","파스타"};
	
	//배열의 맨 마지막 위치에 데이터를 추가하는 함수
	//기존 배열보다 크기가 하나 큰 배열 선언해서 값 그대로 내리기
	//매개값으로 온 값을 마지막에 채우기
	static void push(String newFood) {
		String[] food = new String[foods.length+1];
		
		for(int i=0;i<foods.length;i++)
			food[i]=foods[i];
		
		food[foods.length]= newFood;
		foods = food;
		}
	
	//배열의 내부 데이터 단순출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}
	
	//배열 내의 특정 음식의 위치를 찾아주는 함수
	static int indexOf(String targetName) {
		
		for(int i=0;i<foods.length;i++) {
			if(targetName.equals(foods[i])) {
				return i;
			}
		}
		
		return -1;
	}
	
	//특정 음식의 배열 포함 여부 (참/거짓)
	//indexOf의 리턴값으로 판단하여 리턴
	static boolean include(String targetName) {		
		System.out.printf("%s은 ",targetName);
		if(indexOf(targetName)>0) {
			System.out.println("있습니다.");
			return true;
		}
		else System.out.println("없습니다."); 
		return false;
	}
	
	//특정 음식 제거 함수
	static void remove(String target) {
		int n =indexOf(target);
		String[] food = new String[foods.length-1];		
		if(n==-1) {
			System.out.println("존재하지 않는 음식입니다.");
			return;
		}
		if(n==foods.length-1) foods[foods.length-1]=null;
		for(int i=n;i<foods.length-1;i++) {
			foods[i]=foods[i+1];
			
		}
		
		for(int i=0;i<food.length;i++)
			food[i]= foods[i];
		foods = food;
		
		System.out.println(Arrays.toString(foods));
	}
	
	//특정 음식 수정 함수
	static void modify(int targetIdx, String newFood) {
		foods[targetIdx] = newFood;
	}
	
	public static void main(String[] args) {

		printFood();
		push("라면");
		push("김치찌개");
		printFood();
		
		//파스타의 인덱스를 알아내기		
		System.out.print("파스타의 인덱스 번호: ");
		System.out.println(indexOf("파스타"));
		//김치찌개의 인덱스를 알아내기
		System.out.print("김치찌개의 인덱스 번호: ");
		System.out.println(indexOf("김치찌개"));
		//짜장면의 인덱스를 알아내기 -> -1을 리턴
		System.out.print("짜장면의 인덱스 번호: ");
		System.out.println(indexOf("짜장면"));
		
		remove("김치찌개");
		remove("망고");//존재하지 않는 음식입니다.
		
		//라면의 존재 여부
		include("라면");
		//양념치킨의 존재 여부
		include("양념치킨");
		
		//2번 인덱스 데이터를 닭갈비로 수정
		modify(2,"닭갈비");
		System.out.println(Arrays.toString(foods));
		
		
		
	}
}
