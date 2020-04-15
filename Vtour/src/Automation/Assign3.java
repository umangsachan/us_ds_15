package Automation;

public class Assign3 
{
	public Assign3()
	{
		this(3,5,6,7);
		System.out.println("Default Constructor");
	}
	public Assign3(int a)
	{
		this(5,6);
		System.out.println("One parameterized constructor");
	}
	public Assign3(int b, int c)
	{
		this();
		System.out.println("Two parameterized constructor");
	}
	public Assign3(int d, int e, int f)
	{
		this(1);
		System.out.println("Three parameterized constructor");
	}
	public Assign3(int g, int h, int i, int j)
	{
		System.out.println("Four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Assign3 ob = new Assign3(2,4,6);
	}
}
