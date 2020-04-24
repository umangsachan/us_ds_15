package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWriteProgram1 {
	public void writefilebaseduponrange(int row_count, int col_count, String path, String content1) throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f=new File(path);
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Umang07", 0);
		for(int i=0;i<row_count-1;i++)
		{
			for(int j=0;j<col_count-1;j++)
			{
				Label l=new Label(col_count-1, row_count-1, content1);
				ws.addCell(l);
			}
		}
		System.out.println("THe content that want to writen is: "+content1);
		wk.write();
		wk.close();
	}
	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException {
		System.out.println("Enter the row number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the col number: ");
		int b=sc.nextInt();
		System.out.println("Enter the path of the file");
		String pa=sc.next();
		System.out.println("Enter the content that you want to add in a file");
		String content=sc.next();
		ExcelWriteProgram1 ex=new ExcelWriteProgram1();
		ex.writefilebaseduponrange(a, b, pa, content);
		sc.close();
		
	}

}
