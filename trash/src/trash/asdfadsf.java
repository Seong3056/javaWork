package trash;

import java.util.Arrays;
import java.util.Scanner;

public class asdfadsf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int tmp;
		char[] c = new char[s.length()];
		int[] a = new int [s.length()];
		for(int i=0;i<c.length;i++) {
			a[i] = s.charAt(i);
		}

		System.out.println(Arrays.toString(a));
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				if(a[j]<a[i]){
					tmp = a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
				System.out.printf("a[%d]:%d a[%d]:%d\n",i,a[i],j,a[j]);
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
