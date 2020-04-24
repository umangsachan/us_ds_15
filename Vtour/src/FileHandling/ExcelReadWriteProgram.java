package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelReadWriteProgram {
	public void ReadWrite(String source, String destination) throws BiffException, IOException, RowsExceededException, WriteException
	{
		File rf=new File(source);
		File df=new File(destination);
		Workbook wk=Workbook.getWorkbook(rf);
		Sheet sh=wk.getSheet(0);
		int row=sh.getRows();
		int col=sh.getColumns();
		WritableWorkbook wrk=Workbook.createWorkbook(df);
		WritableSheet wsh=wrk.createSheet("umang01", 0);
		for(int i=0; i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell cl=sh.getCell(j, i);
				Label l=new Label(j, i, cl.getContents());
				wsh.addCell(l);
			}
		}
		wrk.write();
		wrk.close();
		System.out.println("Program run sucessfully");  //only for me to understand that my program runs full
	}
	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException {
		System.out.println("Enter the source file path:");
		Scanner sc=new Scanner(System.in);
		String path=sc.next();
		System.out.println("Enter the destination file path: ");
		String path2=sc.next();
		ExcelReadWriteProgram ex=new ExcelReadWriteProgram();
		ex.ReadWrite(path, path2);
		sc.close();
	}

}
