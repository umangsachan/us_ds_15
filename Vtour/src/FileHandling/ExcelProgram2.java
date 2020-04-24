package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelProgram2 {
	public void readdatafromrow(int a) throws BiffException, IOException
	{
		System.out.println("Enter the file path");
		Scanner s=new Scanner(System.in);
		String path =s.next();
		File f =new File(path);
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sht=wk.getSheet(0);
		int row=a-1;
		int col=0;
		int column=sht.getColumns();
		for(col=0; col<column;col++)
		{
			Cell cl=sht.getCell(col, row);
			System.out.println(cl.getContents());
		}
	}
	public static void main (String[] args) throws BiffException, IOException
	{
		ExcelProgram2 as=new ExcelProgram2();
		System.out.println("Enter the row no. whose data you want to see");
		Scanner d=new Scanner(System.in);
		int fg=d.nextInt();
		as.readdatafromrow(fg); 
	}
}
