package Automation;

public class Student {
  int roll_no;
  int age;
  
public void display1()
{
	System.out.println("Welcome all");
}
public void display2()
{
	System.out.println("Welcome all of you");
}
public static void main(String[] args)
{
	Student ob=new Student();
	ob.display1();
	ob.display2();
	ob.age=25;
	System.out.println(ob.age);
	ob.roll_no=38;
	System.out.println(ob.roll_no);
}
}
