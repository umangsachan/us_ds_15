package LoopsNconditions;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int a=0, b=1, c,num, i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		System.out.println("Series of a entered number is: "+a + "\n" +"Series of a entered number is: " +b);
		for(i=1; i<=num; i++)
		{
			
			c=a+b;
			System.out.println("Series of a entered number is: "+c);
			a=b;
			b=c;
		}
		}

}
