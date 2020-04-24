package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelProgram3 {
	public void readdatafromrowinrange(int startrow, int endrow) throws BiffException, IOException
	{
		System.out.println("Enter the file path");
		Scanner s=new Scanner(System.in);
		String path=s.next();
		File f=new File(path);
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sht=wk.getSheet(0);
		int row=startrow-1;
		int col=0;
		int column=sht.getColumns();
		for(row=startrow-1; row<endrow;row++)
		{
			for(col=0; col<column;col++) 
			{
				Cell cl=sht.getCell(col, row);
				System.out.println(cl.getContents());
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		ExcelProgram3 gh=new ExcelProgram3();
		System.out.println("Enter the start row number & end column number");
		Scanner z=new Scanner(System.in);
		int cv=z.nextInt();
		int v=z.nextInt();
		gh.readdatafromrowinrange(cv, v);
	}

}
