package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFileParticularLineProgram {
	public void filebaseduponparticularline(int row, int col, String path, String content1) throws IOException, RowsExceededException, WriteException
	{
		File f= new File(path);
		WritableWorkbook wrk=Workbook.createWorkbook(f);
		WritableSheet wsh=wrk.createSheet("umang44", 0);
		//int row1=wsh.getRows();   ///Don't use things while writing in a excel 
		//int col1=wsh.getColumns(); // this thing is used while reading a excel  
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==row-1)
				{
					Label l=new Label(j, i, content1);
					wsh.addCell(l);
				}
			}
		}
		System.out.println("The entered content data is: "+content1);
		wrk.write();
		wrk.close();
		System.out.println("Program run sucessfuly");
	}
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		System.out.println("enter the file path:");
		Scanner sc=new Scanner(System.in);
		String path1=sc.next();
		System.out.println("Enter the row number in which data entered: ");
		int a=sc.nextInt();
		System.out.println("Enter the column number in which data entered: ");
		int b=sc.nextInt();
		System.out.println("Enter the content that you want to write in excel: ");
		String content=sc.next();
		ExcelFileParticularLineProgram ex=new ExcelFileParticularLineProgram();
		ex.filebaseduponparticularline(a, b, path1, content);
		sc.close();
	}

}
