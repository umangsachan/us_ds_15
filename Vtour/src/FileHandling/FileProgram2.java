package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram2 {
	public void filereadbaseduponrange(int startline, int endline) throws IOException
	{
		File s = new File("D:/sample.txt");
		FileReader db = new FileReader(s);
		BufferedReader fb =new BufferedReader(db);
		int r=0;
		String d;
		while((d=fb.readLine())!=null)
		{
			r=r+1;
			if((r>=startline)&&(r<=endline))
			{
				System.out.println(d);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		FileProgram2 cv =new FileProgram2();
		System.out.println("Enter the start and endline number");
		Scanner j =new Scanner(System.in);
		int q=j.nextInt();
		int y=j.nextInt();
		cv.filereadbaseduponrange(q, y);

	}

}
