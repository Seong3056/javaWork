package oop.constructor;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		int i=0;
		System.out.print("이름: ");
		p.name = sc.next();
		System.out.print("나이: ");
		p.age = sc.nextInt();	
		System.out.print("키 : ");
		p.height = sc.nextInt();
		
		p.info();
		Person[] a = new Person [10];
		
		for(int j =0;j<a.length;j++)
			a[j]=new Person();
		
		while(i<10) {
		System.out.print("이름: "+i);
		a[i].name = sc.next();
		if(a[i].name.equals("0")) break;
		System.out.print("나이: ");
		a[i].age = sc.nextInt();		
		System.out.print("키: ");
		a[i].height = sc.nextInt();	
		i++;
		}
		
		sc.close();

		for(int j=0;j<a.length;j++)
			a[i].info();

	}

}
