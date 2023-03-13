package etc.api.util.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;import javax.print.attribute.standard.DateTimeAtCreation;

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
		Set<Integer> lotto = new HashSet<>();
		lotto = Set.copyOf(num);
		int x=0;
		while(lotto.size()<7) {
			 x = r.nextInt(45)+1;
			lotto.add(x);			
		}
		System.out.println(num);
		return x;
	}

	


	public static void main(String[] args) {

		List<Integer> winNum = createLotto();
		System.out.println(winNum);
		createBonusNum(winNum);
		System.out.println();




	}
}
