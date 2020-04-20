package LoopsNconditions;

import java.util.Scanner;

public class Without3variable {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a & b");
		a = sc.nextInt();
		b= sc.nextInt();
		System.out.println("Before Swapping: "+a +" " +b);
		/*Swapping without third varible*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: "+a +" " +b);
		

}
}