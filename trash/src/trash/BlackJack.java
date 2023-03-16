package trash;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
/*
먼저 딜러를 정한 뒤, 베팅을 한다.
딜러가 자신을 포함한 참가자 전원에게 카드 두 장을 나누어주는데, 딜러의 카드 한 장은 상대에게 보이지 않는다.
카드의 합이 딜러보다 먼저 21이 되거나 딜러보다 21에 가깝게 되면 이기고, 카드를 더 받았는데 21을 초과하면 버스트(Bust)된다.
먼저 받은 카드 두 장의 합이 21에 못 미치면 히트(Hit)라고 말한 뒤 한 장씩 더 받을 수 있고, 멈추려면 스탠드(Stand)라고 말한다.
딜러는 카드의 합이 16 이하면 무조건 한 장을 더 받아야 하고, 17 이상의 경우에는 멈추어야 한다.
딜러의 카드와 합이 같으면 비긴 것이 된다.
에이스 카드는 1이나 11로 취급할 수 있고, 10, J, Q, K는 모두 10으로 계산한다.
처음 받은 카드 두 장이 에이스와 10, J, Q, K 중의 하나로 합이 21이 되면 블랙잭(Blackjack)이 되고, 베팅한 금액의 1.5배의 돈을 받는다.
 */

public class BlackJack {

	public static Set<String> cardshuffle(){
		Set<String> c = new HashSet<>();
		String[] pattern = {"♠","♣","♡","◇"}; //♠9824 ♣9827 ♡9825 ◇9671
		String[] num = {"1","2","3","4","5","6","7","8","9","10"," ","Q","K" };
		for(int i =0;i<pattern.length;i++) {
			for(int j=0;j<num.length;j++) {
				c.add(new String(pattern[i]+num[j]));
			}			
		}

		return c;
	}
	public static void main(String[] args) {

		Set<String> card = cardshuffle();
		Iterator<String> select = card.iterator();
		String[][] player = new String[4][5]; //player [n명][카드장수]
		//딜러1 플레이3

		System.out.println(card);		

		for(int j=0;j<2;j++)
			for(int i=0;i<player.length;i++)
				player[i][j] = select.next();
		for(int j=0;j<2;j++)
			for(int i=0;i<player.length;i++)
				card.remove(player[i][j]);
		System.out.println(Arrays.deepToString(player));
		System.out.println(card);
		

	}//main
}//class
