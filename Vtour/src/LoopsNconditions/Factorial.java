package LoopsNconditions;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int num, fact=1, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		num =sc.nextInt();
		for(i=num; i>0; i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a entered number is: "+fact);
	}

}
