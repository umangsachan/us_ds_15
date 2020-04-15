package Automation;

public class Part4 {
	public static void method1()
	{
		System.out.println("This is the static method in Part4 class");
		Part3 obj =new Part3();
		obj.method1();
	}
	public static void main(String[] args) {
		Part4.method1();
	}

}
