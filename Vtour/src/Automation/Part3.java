package Automation;

public class Part3 {
	public void method1()
	{
		System.out.println("this is non-static method in a part3 class");
	}
	public static void method2()
	{
		System.out.println("this is static method in a part3 class");
		Part3 obj=new Part3();
		obj.method1();
	}
	public static void main(String[] args) {
		Part3.method2();
	}

}
