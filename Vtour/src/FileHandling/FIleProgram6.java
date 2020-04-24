package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FIleProgram6 {
	public void countofline() throws IOException
	{
		System.out.println("Enter the file path");
		Scanner d=new Scanner(System.in);
		String path=d.next();
		File q=new File(path);
		FileReader h=new FileReader(q);
		BufferedReader jk=new BufferedReader(h);
		String p;
		int charactercount=0;
		while((p=jk.readLine())!=null)
		{
			charactercount=charactercount+1;
		}
		System.out.println("The character count of the file is: "+charactercount);
	}
	public static void main(String[] args) throws IOException {
		FIleProgram6 nm=new FIleProgram6();
		nm.countofline();
	}

}
