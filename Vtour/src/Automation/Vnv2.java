package Automation;

public class Vnv2
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
	public void mul(int q, int w)
	{
		int e;
		e=q*w;
		System.out.println("Division result is:" + e);
	}
	public int div(int o, int p)
	{
		int j;
		j=o/p;
		return j;
	}
	public static void main(String[] args)
	{
		Vnv2 obj = new Vnv2();
		int div_result= obj.div(10,2);
		int sub_result= obj.sub(div_result, 2);
		int sum_result=obj.sum(sub_result, 2);
		int sub_result2=obj.sub(sum_result, 2);
		int sum_result2=obj.sum(sub_result2, 2);
		obj.mul(sum_result2, 2);
	}
}
