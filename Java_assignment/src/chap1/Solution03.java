package chap1;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		int[] score = {85,100,35,47,90};
		int[] rank = {85,100,35,47,90};
		int j=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 학생의 점수: ",i+1);
			score[i] = sc.nextInt();
			rank[i] = score[i];
		}
		for(int i=0;i<rank.length-1;i++) {
			for(j=i+1; j<rank.length;j++) {
				if(rank[i]<rank[j]) {
			int tmp = rank[i];
				rank[i]= rank[j];
				rank[j]= tmp;
				
				}
			}
		}
		System.out.println("점수\t순위");
		System.out.println("-----------");
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d\t",score[i]);
				for(j =0;j<score.length;j++) {
					if(score[i]==rank[j]) {
//					System.out.printf("%d %d %d\n", s[i], rank[j],j);
					break;
					}
				}
				System.out.printf(" %d\n",j+1);
				
		}
		sc.close();
	}

}
