package LoopsNconditions;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the value of a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp =a;
		int rev =0, rem;
		while(temp!=0)
		{
			rem =temp%10;
			rev = (rev*10)+rem;
			temp=temp/10;
		}
		if(a==rev)
		{
			System.out.println("Entered number is a palindrome number: " +a);
		}
		else
		{
			System.out.println("Entered number is not a palindrome number: " +a);
		}
	}

}