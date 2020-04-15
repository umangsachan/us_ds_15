package Automation;

public class Child extends Parent
{
	public Child()
	{
		this(1,2,3);
		System.out.println("Child: Default constructor");
	}
	public Child(int a)
	{
		this();
		System.out.println("Child: one parameterized constructor");
	}
	public Child(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("Child: Two parameterized constructor");
	}
	public Child(int a, int b, int c)
	{
		super(1,2);
		System.out.println("Child: Three parameterized constructor");
	}
	public Child(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("Child: Four Parameterized constructor" );
	}
	public static void main(String[] args) {
		Child obj =new Child(1,2);
		obj.sum(3,5);
	}

}
