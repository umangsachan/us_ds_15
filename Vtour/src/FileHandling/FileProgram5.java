package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram5 {
	public void countthecharacter() throws IOException
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
			charactercount=charactercount+p.length();
		}
		System.out.println("The character count of the file is: "+charactercount);
	}
	public static void main(String[] args) throws IOException {
		FileProgram5 nm=new FileProgram5();
		nm.countthecharacter();
		
	}

}
