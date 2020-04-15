package Automation;

public class ChildPoly extends Parentpoly{
	public int method1(int a)
	{
		System.out.println("In Child class body of method1 (parent class)");
		return a;
	}
	public void method3()
	{
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		ChildPoly obj = new ChildPoly();
		obj.method1(4);
		obj.method2();
		obj.method3();
	}
}
