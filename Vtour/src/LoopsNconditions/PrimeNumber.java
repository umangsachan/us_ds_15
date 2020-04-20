package LoopsNconditions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i, a, temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		for(i=2; i<=a/2; i++)
		{
			if(a%i==0)
			{
			  temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("entered number is a prime number");
		}
		else
		{
			System.out.println("entered number is not a prime number");
		}
	}

}
