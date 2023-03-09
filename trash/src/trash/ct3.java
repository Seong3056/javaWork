package trash;

import java.util.Arrays;

public class ct3 {
	public static void main(String[] args) {
		int total = 5;
		int num = 5;
		int a= ((total*2)/num+1-num)/2;
        System.out.println(a);
        
        int[] answer = new int[num];
        for(int i =0;i<num;i++){
            answer[i] = a++;
        }
        System.out.println(Arrays.toString(answer));
	}
}
