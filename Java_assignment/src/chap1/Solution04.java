package chap1;

import java.util.Scanner;

public class Solution04 {
	public static void main(String[] args) {
		int[] stuNums = {1,2,3,4,5,6,7,8,9,10};
		int[] task = new int [8];
		boolean[] taskb = new boolean[stuNums.length];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<task.length;i++) {
			System.out.print("숙제한 출석번호: ");
			task[i]=sc.nextInt();
		}
			
		
		for(int i=0;i<stuNums.length;i++) {
			for(int j=0;j<task.length;j++) {
				if(stuNums[i]==task[j]) {
					taskb[i]=true;
					break;
				}
			}//for task
		}//for stuNums
		System.out.print("숙제 미제출 학생: ");
		for(int i=0;i<stuNums.length;i++) {
			if(taskb[i]==false) {
				System.out.printf("%d ",stuNums[i]);
			}
		}
		sc.close();
		
	}//main


}

