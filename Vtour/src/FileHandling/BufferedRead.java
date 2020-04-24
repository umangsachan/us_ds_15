package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedRead {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the file path:");
		Scanner v = new Scanner(System.in);
		String path =v.next();
		File f= new File(path);
		FileReader db=new FileReader(f);
		BufferedReader fb=new BufferedReader(db);
		String s;
		while((s=fb.readLine())!=null)
		{
			System.out.println(s);
		}
		v.close();
		fb.close();

	}

}
