package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.WorkbookParser;

public class ExcelsheetProgram1 {
	public void read(int a, int b) throws BiffException, IOException
	{
		System.out.println("Enter the excel file path");
		Scanner d=new Scanner(System.in);
	    String path=d.next();
		File f=new File(path);
		Workbook wb= Workbook.getWorkbook(f);
		Sheet ws=wb.getSheet(0);
		//int row=ws.getRows();
		//int col=ws.getColumns();
		//int l=0;
//		int y=0;
//		for(int i=row-1;i<row;i++)
//		{
//			l=l-1;
//			for(int j=col-1;j<col;j++)
//			{
//				y=y-1;
//				if((l==a)&&(y==b))
//				{
					Cell df=ws.getCell(b-1, a-1);
					System.out.println(df.getContents());
				}

	public static void main(String[] args) throws BiffException, IOException {
		ExcelsheetProgram1 rt=new ExcelsheetProgram1();
		System.out.println("enter the row number and col number whose data you want to see");
		Scanner op=new Scanner(System.in);
		int h=op.nextInt();
		int v=op.nextInt();
		rt.read(v, h);

	}

}
