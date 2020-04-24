package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram1 {
	public void filereadbaseduponlinenumber(int linenumber) throws IOException
	{
		File f=new File("D:/sample.txt");
		FileReader db =new FileReader(f);
		BufferedReader fb=new BufferedReader(db);
		int r =0;
		String s;
		while((s=fb.readLine())!=null)
		{
			r=r+1;
			if(r==linenumber)
			{
				System.out. println(s);
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		FileProgram1 cv= new FileProgram1();
		System.out.println("Enter the line number");
		Scanner c =new Scanner(System.in);
		int a =c.nextInt();
		cv.filereadbaseduponlinenumber(a);
	}

}
