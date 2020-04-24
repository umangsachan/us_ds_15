package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProgram3 {
	public void filewritebaseduponrange(int startline, int endline) throws IOException
	{
		File s= new File("D:/umang5.txt");
		FileWriter f= new FileWriter(s, true);
		BufferedWriter vb=new BufferedWriter(f);
		int w=0;
		for(int i=0; i<=10;i++)
		{
			w=w+1;
			if((w>=startline)&&(w<=endline))
			{
				vb.write("Hello I am umang Sachan this append code");
			}
			vb.newLine();
		}
		vb.close();
	}
	public static void main(String[] args) throws IOException {
		FileProgram3 fg=new FileProgram3();
		System.out.println("Enter the line number from where you want to start writing a text in a file");
		Scanner n=new Scanner(System.in);
		int z=n.nextInt();
		int m=n.nextInt();
		fg.filewritebaseduponrange(z, m);
	}
	

}
