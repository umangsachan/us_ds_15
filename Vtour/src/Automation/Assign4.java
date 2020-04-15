package Automation;

public class Assign4 {
	public void Method()
	{
		System.out.println("Default Method");
	}
	public void Method1(int a)
	{
		System.out.println("1 Parameterized method");
	}
	public void Method2(int a, int b)
	{
		this.Method4(4, 2, 1, 7);
		this.Method();
		this.Method1(5);
		this.Method3(6, 7, 1);
		System.out.println("2 Parameterized method");
	}
	public void Method3(int a, int b, int c)
	{
		System.out.println("3 Parameterized method");
	}
	public void Method4(int a, int b, int c, int d)
	{
		System.out.println("4 Parameterized method");
	}
	public static void main(String[] args)
	{
		Assign4 obj = new Assign4();
		obj.Method2(1,2);
		
	}
}
