package Automation;

public class Cmethod extends Pmethod
{
	public void Cmethod0()
	{
		this.Cmethod4(1, 2, 3, 4);
		System.out.println("Default child method");
	}
	public void Cmethod1(int a)
	{
		this.Cmethod0();
		System.out.println("1 parameterized child method");
	}
	public void Cmethod2(int a, int b)
	{
		this.Cmethod1(2);
		System.out.println("2 parameterized child method");
	}
	public void Cmethod3(int a, int b, int c)
	{
		System.out.println("3 parameterized child method");
	}
	public void Cmethod4(int a, int b, int c, int d)
	{
		this.Pmethod3(5, 7, 3);
		this.Pmethod0();
		this.Pmethod1(5);
		this.Pmethod2(3, 5);
		System.out.println("4 parameterized child method");
	}
	public static void main(String[] args) {
		Cmethod obj=new Cmethod();
		obj.Cmethod2(1,2);
	}

}
