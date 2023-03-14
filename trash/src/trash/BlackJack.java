package trash;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BlackJack {

	public static Set<String> cardshuffle(){
		Set<String> c = new HashSet<>();
		String[] pattern = {"♠","♣","♡","◇"};
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
