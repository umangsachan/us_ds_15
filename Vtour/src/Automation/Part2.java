package Automation;

public class Part2 
{
	public static void method1()
	{
		System.out.println("static method in class part2");
		Callstatic.metho1();
	}
	public static void main(String[] args) {
		System.out.println("********Calling static method from another static method in different class**********");
		Part2.method1();
	}
	

}
