package LoopsNconditions;

import java.util.Scanner;

public class swapp {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a & b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping: " +a +" " +b);
		/*Swapping*/
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping: "+a +" "+b);
	}
	

}
