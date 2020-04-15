package Automation;

public class Static {
	public void div(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("the result of method1 is :"+c);
	}
	public float div(int a, float b)
	{
		float c;
		c=a/b;
		return c;
	}
	public static void main(String[] args) {
		Static obj = new Static();
		float Result=obj.div(10, 2.0F);
		System.out.println("the result of method2 is:" +Result);
		obj.div(10, 2);
	}
}
