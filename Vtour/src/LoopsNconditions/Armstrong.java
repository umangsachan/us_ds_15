package LoopsNconditions;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a, temp, c=0,i;
		a=sc.nextInt();
		temp=a;
		while(a>0)
		{
			i=a%10;
			c=c+(i*i*i);
			a=a/10;
		}
		if(temp==c)
		{
			System.out.println("Entered number is a armstrong number: "+temp);
		}
		else
		{
			System.out.println("Entered number is not a armstrong number: "+temp);
		}
	}

}
