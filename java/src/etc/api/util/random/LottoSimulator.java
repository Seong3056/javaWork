package etc.api.util.random;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();

	static int prize1 = 0;
	static int prize2 = 0;
	static int prize3 = 0;
	static int prize4 = 0;
	static int prize5 = 0;
	static int failCnt = 0;
	static int i =0;

	public static List<Integer> createLotto() {
		Set<Integer> initNum = new HashSet<>();
		while(initNum.size()<6){

			initNum.add(r.nextInt(45)+1);
		}
		return new ArrayList<>(initNum);

	}
	public static int createBonusNum(List<Integer> num) {

		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
		  당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
		  범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
		 */		
		int x=0;
		while(true) {
			x = r.nextInt(45)+1;
			if(!(num.contains(x))) return x;		 
		}		
		
	} 
	public static void checkLottoNumber(List<Integer> winNum, List<Integer> num, int bonus) {
		/*
        매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
        내 로또 번호와 당첨번호를 비교하여
        일치하는 횟수를 세 주신 후 등수를 판단하세요.
        판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
        6개 일치 -> 1등
        5개 일치 + 보너스번호 일치 -> 2등
        5개 일치 -> 3등
        4개 일치 -> 4등
        3개 일치 -> 5등
        나머지 -> 꽝
		 */
		int count = 0;
		for(int i =0; i<winNum.size();i++) {
			if(winNum.get(i)==num.get(i)) {count++; }
		}
		//		System.out.print("count "+count);
		switch(count) {
		case 6: 
			prize1++;
			break;
		case 5:
			if(winNum.contains(bonus))
				prize2++;
			else
				prize3++;
			break;
		case 4:
			prize4++;
			break;
		case 3:
			prize5++;
			break;
		default:
			failCnt++;
			break;
		}
	}




	public static void main(String[] args) {

		List<Integer> winNum = createLotto();
		String[] loading = {"계산중","계산중.","계산중..","계산중..."};
		long start = System.currentTimeMillis();
		while(prize1 != 1) {
			i++;
			List<Integer> num = createLotto();
			int bonus = createBonusNum(num);
			checkLottoNumber(winNum, num, bonus);
			//			System.out.printf(" prize %d %d %d %d %d %d",prize1,prize2,prize3,prize4,prize5,failCnt);
			//			System.out.printf("  로또 %d장째 구매중.. ",i);
			//			System.out.println(winNum + "   " + num + "   " + bonus);
			
			System.out.println(loading[(i/200000)%4]);
		}
		long end = System.currentTimeMillis();
		
		System.out.printf("1등이 나올때 까지 추첨된 로또 %d 장\n",i);
		System.out.printf("2등 : %d\n",prize2);
		System.out.printf("3등 : %d\n",prize3);
		System.out.printf("4등 : %d\n",prize4);
		System.out.printf("5등 : %d\n",prize5);
		System.out.printf("낙첨 : %d\n",failCnt);
		System.out.println("------분배금-------");
		
		long prize = ((i)/2)-((prize5*5)+(prize4*50));
		long p1=0;
		long p2=0;
		long p3=0;
		if(prize2==0&&prize3==0) {	
			p1 = prize/prize1*1000;
			p2 = 0;
			p3 = 0;
			
		}
		else if(prize3==0) { 
			p1 = (long) (prize*0.875/prize1*1000);
			p2 = (long) (prize*0.125/prize2*1000);
			p3 = 0;
			
		}
		else if(prize2==0) {
			p1 = (long) (prize*0.875/prize1*1000);
			p2 = 0;
			p3 = (long) (prize*0.125/prize3*1000);
			
		}
		else {			
			p1 = (long) (prize*0.75/prize1*1000);
			p2 = (long) (prize*0.125/prize2*1000);
			p3 = (long) (prize*0.125/prize3*1000);			
		}		
		
		
		System.out.printf("1등 : %d원\n",p1);
		System.out.printf("2등 : %d원\n",p2);
		System.out.printf("3등 : %d원\n",p3);
		System.out.println((end-start)/1000+"초");

	}
}
