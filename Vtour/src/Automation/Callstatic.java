package Automation;

public class Callstatic {
	static int var =100;
	public static void metho1()
	{
		System.out.println("This is the first static method in first class");
	}
	public static void method2() 
	{
		Callstatic.metho1();
		System.out.println("This is the second method");
		
	}
	public static void main(String[] args) {
		System.out.println("**********Calling static method from another static method in a same class************");
		Callstatic.method2();
		System.out.println("Result: " +Callstatic.var);
	}

}
