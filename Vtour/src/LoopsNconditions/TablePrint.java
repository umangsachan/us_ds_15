package LoopsNconditions;

import java.util.Scanner;

public class TablePrint {
	
	public static void main(String[] args) {
		int number,table, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		for(i=1; i<=10; i++)
		{
			
			table = number*i;
			System.out.println(number +"*"+ i +"="+table);
		}
		
	}

}
