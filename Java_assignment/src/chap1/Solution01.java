package chap1;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int max = 0;
		for(int i=0;i<nums.length;i++) {
			System.out.printf("%d번째 숫자를 입력: ",i+1);
			int num = sc.nextInt();
			nums[i] = num;
		}
		
		for(int i=0;i<nums.length;i++) {
			max = (max>nums[i] ? max:nums[i]);
		}
		System.out.printf("가장 큰 값: %d",max);
		sc.close();
		

	}

}
