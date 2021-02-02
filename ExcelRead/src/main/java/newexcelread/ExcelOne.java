package newexcelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOne {
	
    XSSFSheet sh;

	public ExcelOne() throws IOException
	{
		FileInputStream f= new FileInputStream("D:\\newexcel\\exceldata\\test1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");
       XSSFSheet sh;

	}
	/*public double readData(int i, int j) {
		Row r= sh.getRow(i);
		Cell c= r.getCell(j); //Import Cell of apache poi not Table
		return c.getNumericCellValue(); //Read integer data and return it as double
		
	}*/
	
	public String readData(int i ,int j)
	{
		  
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype =c.getCellType(); 
	//  System.out.println(celltype);  
		switch(celltype)
		{
		case Cell.CELL_TYPE_NUMERIC:
		{
			double value=c.getNumericCellValue();
			return String.valueOf(value);
			
		}
		case Cell.CELL_TYPE_STRING:
			return c.getStringCellValue();
		}
		return null;
	 
	 
	}


	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
