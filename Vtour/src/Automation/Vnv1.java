package Automation;

public class Vnv1 
{
	public int sum(int a, int b)
	{
	int c;
	c=a+b;
	return c;
	}
	public int sub(int d, int f)
	{
		int g;
		g=d-f;
		return g;
	}
	public int mul(int q, int w)
	{
		int e;
		e=q*w;
		return e;
	}
	public void div(int o, int p)
	{
		int j;
		j=o/p;
		System.out.println("Division result is:" + j);
	}
	public static void main(String[] args)
	{
		Vnv1 obj = new Vnv1();
		int sum_result=obj.sum(10,2);
		int sub_result=obj.sub(sum_result, 2);
		int sum_result1=obj.sum(sub_result, 2);
		int mul_result=obj.mul(sum_result1, 2);
		obj.div(mul_result, 2);
	}
}