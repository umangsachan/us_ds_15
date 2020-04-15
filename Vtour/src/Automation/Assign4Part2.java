package Automation;

import java.util.Scanner;

public class Assign4Part2 {
	public int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c= a*b;
		return c;
	}
	public void div(int a, int b)
	{
		int c;
	    c =a/b;
		System.out.println("Final Expression result (((((x1+x2)-x3)+x4)*x5)/x5) is  :" +c);
	}
	public static void main(String[] args) 
	{
		Scanner cl = new Scanner(System.in);
		System.out.println("Enter value for x1:");
		int x1=cl.nextInt();
		System.out.println("Enter value for x2:");
		int x2=cl.nextInt();
		System.out.println("Enter value for x3:");
		int x3=cl.nextInt();
		System.out.println("Enter value for x4:");
		int x4=cl.nextInt();
		System.out.println("Enter value for x5:");
		int x5=cl.nextInt();
		Assign4Part2 obj = new Assign4Part2();
		int addition=obj.add(x1, x2);
		int substraction=obj.sub(addition, x3);
		int add2=obj.add(substraction, x4);
		int multiplication=obj.mul(add2, x5);
		obj.div(multiplication, x5);
		
	}

}
