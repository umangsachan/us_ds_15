package Automation;

public class Parent {
	public void sum(int a, int b)
	{
		int c;
		c=a+b;
			System.out.println("The value is: "+c);
	}
	public Parent()
	{
		this(1,2,3);
		System.out.println("Parent: Default constructor");
	}
	public Parent(int a)
	{
		this();
		System.out.println("Parent: One parameterized constructor");
	}
	public Parent(int a, int b)
	{
		this(1);
		System.out.println("Parent: Two parameterized constructor");
	}
	public Parent(int a, int b, int c)
	{
		System.out.println("Parent: Three parameterized constructor");
	}
}
